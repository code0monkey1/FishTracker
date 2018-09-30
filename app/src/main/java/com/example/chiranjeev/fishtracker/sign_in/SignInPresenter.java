package com.example.chiranjeev.fishtracker.sign_in;

public class SignInPresenter implements SignInContract.Presenter {

    private SignInContract.MvpView view;

    public SignInPresenter(SignInContract.MvpView view){
        this.view= view;
    }
}
