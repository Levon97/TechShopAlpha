package service;

import models.Interfaces.SmartWatchInterface;
import models.SmartWatch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartWatchService {
    private static final String PATH_SM = "data/smartWatchList.txt";

    public static List<SmartWatch> smartWatchReader() throws IOException {
        List<String> lines = ReaderWriterService.reader(PATH_SM);
        List<SmartWatch> listOfSW = new ArrayList<>();
        SmartWatch smartWatch = new SmartWatch();
        for (String x : lines) {
            String[] sWParameters = x.split(",");
            SmartWatch watch = new SmartWatch();
            watch.setModel(sWParameters[0]);
            watch.setBatteryCap(Integer.parseInt(sWParameters[1]));
            watch.setStrapLength(Double.parseDouble(sWParameters[2]));
            watch.setHeartRateSensor(sWParameters[3].charAt(0));
            watch.setPrice(Double.parseDouble(sWParameters[4]));
            listOfSW.add(smartWatch);
        }
        return listOfSW;
    }

    public static void printWatchInfo(List<SmartWatch> list) throws IOException {
        System.out.println("-------------Smart watches parameters-------------");
        for (SmartWatchInterface x : list) {
            x.printInfo();
        }
    }

    public static void addSmartWatch() throws IOException {
        SmartWatch smartWatch = new SmartWatch();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model");
        smartWatch.setModel(s.nextLine());
        System.out.println("Enter Battery capacity");
        smartWatch.setBatteryCap(s.nextInt());
        System.out.println("Enter strap length in SM");
        smartWatch.setStrapLength(s.nextDouble());
        System.out.println("Build in heart rate sensor (y or n)");
        smartWatch.setHeartRateSensor(s.next().charAt(0));
        System.out.println("Enter the price");
        smartWatch.setPrice(s.nextDouble());
        ReaderWriterService.writer(PATH_SM, smartWatch.toString());
    }

    public static void search() throws IOException {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter model name");
        printWatchInfo(ShopItemService.searchByModel(smartWatchReader(), ss.nextLine()));
    }

    public static void deleteSmartWatch() throws IOException {
        Scanner ss = new Scanner(System.in);

        ReaderWriterService.deleteLine(PATH_SM, ss.nextLine());

    }

}
