package com.xworkz.interfaces.inner.file;

public class NetworkImpli implements Network {
    @Override
    public void connect() {
        System.out.println("Network is connecting");
    }

    @Override
    public void transferData() {
        System.out.println("Transferring data through network");
    }

    @Override
    public void disconnect() {
        System.out.println("Network disconnected");
    }
}
