package models.Interfaces;

public interface LaptopInterface  {


    String getModel();

    void setModel(String model);

    char getBuildInCam();

    void setBuildInCam(char buildInCam);

    double getScreenSize();

    void setScreenSize(double screenSize);
    void printInfo();
}
