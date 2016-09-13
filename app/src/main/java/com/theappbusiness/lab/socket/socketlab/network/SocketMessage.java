package com.theappbusiness.lab.socket.socketlab.network;

/**
 * Created by swav on 13/09/2016.
 */

public class SocketMessage {

    private String body;

    public SocketMessage(String body) {
        this.body = body;
    }

    String getBody() {
        return body;
    }
}
