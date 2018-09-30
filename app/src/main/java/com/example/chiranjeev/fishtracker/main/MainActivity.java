package com.example.chiranjeev.fishtracker.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chiranjeev.fishtracker.R;
import com.example.chiranjeev.fishtracker.databinding.MainActivityBinding;

import java.sql.DatabaseMetaData;

/**
 * Displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.main_activity);
        presenter = new MainPresenter(this);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setPresenter(presenter);

    }

    //// MvpView methods ////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user the the sign in screen", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user the the sign up screen", Toast.LENGTH_LONG).show();
    }
}
