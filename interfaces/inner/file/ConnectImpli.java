package com.xworkz.interfaces.inner.file;

public class ConnectImpli implements Connect {
    @Override
    public void establish() {
        System.out.println("Connection established");
    }

    @Override
    public void maintain() {
        System.out.println("Connection is stable");
    }

    @Override
    public void terminate() {
        System.out.println("Connection terminated");
    }
}
