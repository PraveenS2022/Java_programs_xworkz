package com.xworkz.interfaces.inner.file;

public class EngineImpli implements Engine {
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void consumeFuel() {
        System.out.println("Engine consuming fuel");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }
}
