package com.example.chiranjeev.fishtracker.main;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Local unit test for the main presenter
 */
public class MainPresenterTest {
    @Mock
    private MainContract.MvpView mView;
    private MainContract.Presenter mPresenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mPresenter= new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
        View view=null ;
        mPresenter.handleSignInButtonClick(view);
        verify(mView).showSignInScreen();

    }

    @Test
    public void handleSignUpButtonClick() {
        View view=null;
        mPresenter.handleSignUpButtonClick(view);
        verify(mView).showSignUpScreen();

    }
}