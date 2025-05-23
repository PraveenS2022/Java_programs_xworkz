package com.xworkz.interfaces.inner.file;

public class ChainImpli implements Chain {
    @Override
    public void lock() {
        System.out.println("Chain is locked");
    }

    @Override
    public void wear() {
        System.out.println("Chain is worn");
    }

    @Override
    public void shine() {
        System.out.println("Chain is shiny");
    }
}
