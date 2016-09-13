package com.theappbusiness.lab.socket.socketlab.di;

import com.theappbusiness.lab.socket.socketlab.MainActivity;

import dagger.Component;

/**
 * Created by swav on 13/09/2016.
 */
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
