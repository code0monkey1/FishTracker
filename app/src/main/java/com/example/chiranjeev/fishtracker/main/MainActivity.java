package com.example.chiranjeev.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.chiranjeev.fishtracker.R;

/**
 * Displays the main screen
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new MainPresenter(this);
     }
 //// MvpView methods ////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this,"Taking user the the sign in screen",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"Taking user the the sign up screen",Toast.LENGTH_LONG).show();
    }
}
