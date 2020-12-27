package models.Interfaces;



public interface SmartWatchInterface{

    char getHeartRateSensor();

    void setHeartRateSensor(char heartRateSensor);

    double getStrapLength();

    void setStrapLength(double strapLength);
    void printInfo();

}
