package com.company;

public class Main {

    public static void main(String[] args) {
        Thread server = new Thread(new Server());
        server.start();
    }
}
