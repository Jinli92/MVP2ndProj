package com.example.jinliyu.mvp2ndproj.ui.login;

/**
 * Created by jinliyu on 4/20/18.
 */

public class Presenter implements IPresenter{
   IView iView;

    public Presenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void onButtonClicked() {
        iView.showToast();
    }
}
