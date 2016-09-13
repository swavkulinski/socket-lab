package com.theappbusiness.lab.socket.socketlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.theappbusiness.lab.socket.socketlab.di.DaggerMainComponent;
import com.theappbusiness.lab.socket.socketlab.di.MainComponent;
import com.theappbusiness.lab.socket.socketlab.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private MainComponent component;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        component = DaggerMainComponent.builder().build();
        component.inject(this);
    }
}
