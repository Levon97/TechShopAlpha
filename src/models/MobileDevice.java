package models;

import models.Interfaces.MobileDeviceInterface;
import models.Interfaces.ShopItemInterface;

public abstract class MobileDevice implements ShopItemInterface {
    private int batteryCap;
    private String model;
    private double price;

    public String getModel() {

        return model;
    }
    public void setModel(String model){
        if (model.length() != 0) {
            this.model = model;
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }

    }

    public int getBatteryCap() {
        return batteryCap;
    }

    public void setBatteryCap(int batteryCap) {
        if (batteryCap >= 0) {
            this.batteryCap = batteryCap;
        }
    }

}

