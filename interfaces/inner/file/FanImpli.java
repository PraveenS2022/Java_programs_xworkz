package com.xworkz.interfaces.inner.file;

public class FanImpli implements Fan {
    @Override
    public void rotate() {
        System.out.println("Fan is rotating");
    }

    @Override
    public void coolAir() {
        System.out.println("Fan blows cool air");
    }

    @Override
    public void changeSpeed() {
        System.out.println("Fan speed changed");
    }
}
