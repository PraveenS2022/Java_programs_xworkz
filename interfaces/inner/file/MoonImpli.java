package com.xworkz.interfaces.inner.file;

public class MoonImpli implements Moon {
    @Override
    public void glow() {
        System.out.println("Moon glows softly");
    }

    @Override
    public void reflectSunlight() {
        System.out.println("Moon reflects sunlight");
    }

    @Override
    public void appearAtNight() {
        System.out.println("Moon appears at night");
    }
}
