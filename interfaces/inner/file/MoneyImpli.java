package com.xworkz.interfaces.inner.file;

public class MoneyImpli implements Money {
    @Override
    public void spend() {
        System.out.println("Money is spent");
    }

    @Override
    public void save() {
        System.out.println("Money is saved");
    }

    @Override
    public void invest() {
        System.out.println("Money is invested");
    }
}
