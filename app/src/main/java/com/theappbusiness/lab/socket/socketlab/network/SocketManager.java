package com.theappbusiness.lab.socket.socketlab.network;

/**
 * Created by swav on 13/09/2016.
 */

public interface SocketManager {

    void start(SocketListener listener);
    void send(SocketMessage socketMessage);
    void stop();
}
