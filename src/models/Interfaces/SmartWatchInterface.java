package models.Interfaces;

import models.MobileDevice;

public interface SmartWatchInterface{

    char getHeartRateSensor();

    void setHeartRateSensor(char heartRateSensor);

    double getStrapLength();

    void setStrapLength(double strapLength);

}
