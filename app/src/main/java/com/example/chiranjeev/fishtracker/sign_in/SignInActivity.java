package com.example.chiranjeev.fishtracker.sign_in;

public class SignInActivity implements SignInContract.MvpView {

    private SignInPresenter presenter;

    public SignInActivity(){
         presenter=new SignInPresenter(this);

    }
}
