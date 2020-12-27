package models.Interfaces;

import service.ShopItemService;

public interface PhoneInterface {

    double getScreenSize();

    void setScreenSize(double screenSize);

    String getScreenResolution();

    void setScreenResolution(String screenResolution);
    void printInfo();

}
