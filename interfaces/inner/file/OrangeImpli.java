package com.xworkz.interfaces.inner.file;

public class OrangeImpli implements Orange {
    @Override
    public void isCitrus() {
        System.out.println("Orange is citrus fruit");
    }

    @Override
    public void hasVitaminC() {
        System.out.println("Orange contains Vitamin C");
    }

    @Override
    public void isRound() {
        System.out.println("Orange is round in shape");
    }
}
