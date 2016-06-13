package com.pediy.kanxue.ui.main;

import com.pediy.kanxue.BasePresenter;
import com.pediy.kanxue.BaseView;

public interface MainContract {
    interface View extends BaseView {
        void startAboutActivity();
        void startFeedbackActivity();
        void startSettingActivity();
    }

    interface Presenter extends BasePresenter<View> {

    }
}
