package com.xworkz.interfaces.inner.file;

public class PlutoImpli implements Pluto {
    @Override
    public void revolve() {
        System.out.println("Pluto is revolving");
    }

    @Override
    public void rotate() {
        System.out.println("Pluto is rotating slowly");
    }

    @Override
    public void hasIce() {
        System.out.println("Pluto has icy surface");
    }
}
