package com.xworkz.interfaces.inner.file;

public class ShoeImpli implements Shoe {
    @Override
    public void wear() {
        System.out.println("Wearing the shoe");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the shoe");
    }

    @Override
    public void walk() {
        System.out.println("Walking with shoes");
    }
}
