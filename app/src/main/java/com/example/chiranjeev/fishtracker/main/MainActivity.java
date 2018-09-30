package com.example.chiranjeev.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
}
