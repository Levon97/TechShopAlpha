package models;

import models.Interfaces.PhoneInterface;

public class Phone extends MobileDevice implements PhoneInterface {

    private double screenSize;
    private String screenResolution;   //HD,UHD ...

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize >= 0) {
            this.screenSize = screenSize;
        }
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        if (screenResolution.length() > 0) {
            this.screenResolution = screenResolution;
        }
    }

    @Override
    public String toString() {
        return String.join(",", this.getModel(), Integer.toString(this.getBatteryCap()), Double.toString(this.getScreenSize()), this.getScreenResolution(), Double.toString(this.getPrice()));
    }
}
