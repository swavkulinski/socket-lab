package com.theappbusiness.lab.socket.socketlab.network;

/**
 * Created by swav on 13/09/2016.
 */

public interface SocketListener {
    void onReceive(SocketMessage message);
    void onStop();
    void onSend(SocketMessage message);
    void onStart();
}
