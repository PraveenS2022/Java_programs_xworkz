package com.xworkz.interfaces.inner.file;

public class DeadImpli implements Dead {
    @Override
    public void remember() {
        System.out.println("Remembering the dead");
    }

    @Override
    public void bury() {
        System.out.println("Burying the dead");
    }

    @Override
    public void mourn() {
        System.out.println("Mourning for the dead");
    }
}
