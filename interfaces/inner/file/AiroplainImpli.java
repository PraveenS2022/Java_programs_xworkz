package com.xworkz.interfaces.inner.file;

public class AiroplainImpli implements Airoplain {
    @Override
    public void fly() {
        System.out.println("Airoplain is flying");
    }

    @Override
    public void land() {
        System.out.println("Airoplain is landing");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Carrying passengers in Airoplain");
    }
}
