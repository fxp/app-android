package shaolizhi.sunshinebox.ui.phone_number_verify;

import android.content.Context;
import android.support.annotation.NonNull;

import shaolizhi.sunshinebox.ui.base.BasePresenter;
import shaolizhi.sunshinebox.ui.base.BaseView;

/**
 * 由邵励治于2017/11/29创造.
 */

public interface PhoneNumberVerifyContract {
    interface View extends BaseView {
        void setResendButtonEnable(Boolean clickable);

        void setResendButtonText(String text);

        void openIndexActivity();

        Context getContext();

        String getPhoneNumber();

        String getCaptcha();
    }

    interface Presenter extends BasePresenter {
        void tryToRequestCaptcha();

        void tryToVerifyCaptcha();

        void tryToLogin();

        void startCountDown();
    }

    interface Model {
        void requestSendCaptchaBean(@NonNull String phoneNumber);

        void requestCheckCaptchaBean(@NonNull String phoneNumber, @NonNull String captcha);

        void requestToLogin(@NonNull String phoneNumber, @NonNull String password);
    }

    interface CallBack {
        void requestSendCaptchaBeanSuccess();

        void requestSendCaptchaBeanFailure();

        void requestCheckCaptchaBeanSuccess();

        void requestCheckCaptchaBeanFailure();

        void requestToLoginSuccess();

        void requestToLoginFailure();
    }
}
