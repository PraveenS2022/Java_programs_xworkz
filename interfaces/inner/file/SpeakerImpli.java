package com.xworkz.interfaces.inner.file;

public class SpeakerImpli implements Speaker {
    @Override
    public void produceSound() {
        System.out.println("Speaker produces sound");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Speaker connected via Bluetooth");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Speaker volume increased");
    }
}
