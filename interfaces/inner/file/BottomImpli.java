package com.xworkz.interfaces.inner.file;

public class BottomImpli implements Bottom {
    @Override
    public void sitOn() {
        System.out.println("Sitting on the bottom");
    }

    @Override
    public void balance() {
        System.out.println("Balancing on bottom");
    }

    @Override
    public void support() {
        System.out.println("Bottom gives support");
    }
}
