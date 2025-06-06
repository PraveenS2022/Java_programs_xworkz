package com.xworkz.interfaces.inner.file;

public class BatteryImpli implements Battery {
    @Override
    public void storePower() {
        System.out.println("Battery stores electrical energy");
    }

    @Override
    public void discharge() {
        System.out.println("Battery discharges power");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Battery is rechargeable");
    }
}
