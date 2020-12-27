package models;

import models.Interfaces.SmartWatchInterface;

public class SmartWatch extends MobileDevice implements SmartWatchInterface {
    private char heartRateSensor;
    private double strapLength;

    public char getHeartRateSensor() {
        return heartRateSensor;
    }

    public void setHeartRateSensor(char heartRateSensor) {
        if (heartRateSensor == 'y' || heartRateSensor == 'n') {
            this.heartRateSensor = heartRateSensor;
        }
    }

    public double getStrapLength() {
        return strapLength;
    }

    public void setStrapLength(double strapLength) {
        if (strapLength >= 0) {
            this.strapLength = strapLength;
        }
    }

}
