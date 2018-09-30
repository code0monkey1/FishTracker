package com.example.chiranjeev.fishtracker.main;

/**
 * Responsible for taking inputs from the View and updating the UI as required
 */
public class MainPresenter implements MainContract.Presenter {
    MainContract.MvpView view;

    public MainPresenter(MainContract.MvpView view){
        this.view=view;
    }
}
