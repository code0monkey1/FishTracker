package com.example.chiranjeev.fishtracker.main;

import android.view.View;

/**
 * Responsible for taking inputs from the View and updating the UI as required
 */
public class MainPresenter implements MainContract.Presenter {
    MainContract.MvpView mView;

    public MainPresenter(MainContract.MvpView mView) {
        this.mView = mView;
    }

    //// Presenter Methods ////
    @Override
    public void handleSignInButtonClick(View view) {

        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {

        mView.showSignUpScreen();
    }
}
