package com.lambton.vehicle;

import com.lambton.util.IDisplay;

public class Bus extends Vehicle implements IDisplay {

    private String busType;
    private Boolean accessibilityServices;
    private Boolean wifiAvailability;

    public Bus(String vehicleId, String busType, String description, String manufacturer, Boolean isSelfDrive, Boolean isInsured, String insuranceProviderName, int numberOfSeat, Boolean wifiAvailability, Boolean accessibilityServices, FuelType fuelType, float baseRate) {
        super(vehicleId, description, manufacturer, isSelfDrive, isInsured, insuranceProviderName, numberOfSeat, fuelType, baseRate);
        this.busType = busType;
        this.accessibilityServices = accessibilityServices;
        this.wifiAvailability = wifiAvailability;
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString()+
                "busType='" + busType + '\'' +
                ", accessibilityServices=" + accessibilityServices +
                ", wifiAvailability=" + wifiAvailability +
                '}';
    }

    public void display(){
        System.out.println(this.toString());
    }
}
