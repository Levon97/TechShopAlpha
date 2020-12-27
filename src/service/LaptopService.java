package service;

import models.Interfaces.LaptopInterface;
import models.Interfaces.PhoneInterface;
import models.Interfaces.ShopItemInterface;
import models.Laptop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopService {
    private static final String PATH_LAPTOP = "data/laptopList.txt";

    public static List<Laptop> laptopReader() throws IOException {
        List<String> lines  = ReaderWriterService.reader(PATH_LAPTOP);
        List<Laptop> listOfLaptops = new ArrayList<>();
        Laptop laptop = new Laptop();
        for(String x: lines){
            String[] laptopParameters = x.split(",");
            laptop.setModel(laptopParameters[0]);
            laptop.setProcModel(laptopParameters[1]);
            laptop.setvCard(laptopParameters[2]);
            laptop.setrOM(Integer.parseInt(laptopParameters[3]));
            laptop.setrAM(Integer.parseInt(laptopParameters[4]));
            laptop.setBuildInCam(laptopParameters[5].charAt(0));
            laptop.setScreenSize(Double.parseDouble(laptopParameters[6]));
            laptop.setPrice(Double.parseDouble(laptopParameters[7]));
            listOfLaptops.add(laptop);
        }
        return listOfLaptops;
    }
    public static void printLaptopInfo(List<Laptop> list) throws IOException {
        System.out.println("-------------Laptops parameters-------------");
        for (LaptopInterface x : list) {
            x.printInfo();
        }
    }
    public static void addLaptop() throws IOException {
        Laptop laptop = new Laptop();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model");
        laptop.setModel(s.nextLine());
        System.out.println("Enter processor unit model");
        laptop.setProcModel(s.nextLine());
        System.out.println("Enter video card model");
        laptop.setvCard(s.nextLine());
        System.out.println("Enter ROM capacity in GB");
        laptop.setrOM(s.nextInt());
        System.out.println("Enter RAM capacity in GB");
        laptop.setrAM(s.nextInt());
        System.out.println("Build in camera (y or n)");
        laptop.setBuildInCam(s.next().charAt(0));
        System.out.println("Enter screen size");
        laptop.setScreenSize(s.nextDouble());
        System.out.println("Enter the price");
        laptop.setPrice(s.nextDouble());

        ReaderWriterService.writer(PATH_LAPTOP,laptop.toString());
    }
}
