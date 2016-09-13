package com.theappbusiness.lab.socket.socketlab.di;

import com.theappbusiness.lab.socket.socketlab.network.SocketManager;
import com.theappbusiness.lab.socket.socketlab.network.SocketManagerImpl;
import com.theappbusiness.lab.socket.socketlab.presenter.MainPresenter;
import com.theappbusiness.lab.socket.socketlab.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by swav on 13/09/2016.
 */
@Module
public class MainModule {


    @Provides
    SocketManager provideSocketManager(SocketManagerImpl impl) {
        return impl;
    }

    @Provides
    MainPresenter provideMainPresenter (MainPresenterImpl impl) {
        return impl;
    }
}
