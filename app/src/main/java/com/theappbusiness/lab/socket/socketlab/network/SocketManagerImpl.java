package com.theappbusiness.lab.socket.socketlab.network;


import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscription;


/**
 * Created by swav on 13/09/2016.
 */

public class SocketManagerImpl implements SocketManager {

    private SocketListener listener;
    private Subscription subscription;

    @Inject public SocketManagerImpl() {}

    @Override
    public void start(SocketListener listener) {
        this.listener = listener;
    }

    @Override
    public void send(SocketMessage socketMessage) {
        Observable<SocketMessage> observable = createSocketObservable();
        subscription = observable.subscribe(listener::onReceive);
    }

    @Override
    public void stop() {
        listener = null;
        if(subscription != null) {
            subscription.unsubscribe();
        }
    }

    private Observable<SocketMessage> createSocketObservable() {
        return Observable.create(subscriber -> {
           try {
               Socket socket = new Socket("10.5.1.20",3000);
               InputStream is = socket.getInputStream();
               int ch;
               StringBuilder sb = new StringBuilder();
               while ((ch = is.read()) != -1);
               {
                   sb.append((char)ch);
               }
               SocketMessage message = new SocketMessage(sb.toString());
               subscriber.onNext(message);
           } catch (IOException e) {
               Log.e("Socket error",e.getMessage());
               subscriber.onError(e);
           }


        });
    }

}
