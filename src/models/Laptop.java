package models;

import models.Interfaces.LaptopInterface;
import models.Interfaces.ShopItemInterface;

public class Laptop implements LaptopInterface, ShopItemInterface {
    private String model;
    private char buildInCam;
    private double screenSize;
    private String procModel;
    private String vCard;
    private int rOM;
    private int rAM;
    private double price;

    public String getModel() {

        return model;
    }

    public void setModel(String name) {
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


    public String getProcModel() {
        return procModel;
    }

    public void setProcModel(String procModel) {
        if (procModel.length() != 0) {
            this.procModel = procModel;
        }
    }

    public String getvCard() {
        return vCard;
    }

    public void setvCard(String vCard) {
        if (vCard.length() != 0) {
            this.vCard = vCard;
        }
    }

    public int getrOM() {
        return rOM;
    }

    public void setrOM(int rOM) {
        if (rOM >= 0) {
            this.rOM = rOM;
        }
    }

    public int getrAM() {
        return rAM;
    }

    public void setrAM(int rAM) {
        if (rAM >= 0) {
            this.rAM = rAM;
        }
    }



    public char getBuildInCam() {
        return buildInCam;
    }

    public void setBuildInCam(char buildInCam) {
        if (buildInCam == 'y' || buildInCam == 'n') {
            this.buildInCam = buildInCam;
        }
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize >= 0) {
            this.screenSize = screenSize;
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
