package service;

import models.Interfaces.PhoneInterface;
import models.MobileDevice;
import models.Phone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneService {
    private static final String PHONE_PHAT = "data/phoneList.txt";

    public static List<Phone> phoneReader() throws IOException {
        List<Phone> listOfPhones = new ArrayList<>();
        List<String> lines = ReaderWriterService.reader(PHONE_PHAT);
        for (String x : lines) {
            Phone phone = new Phone();
            String[] phoneParameter = x.split(",");
            phone.setModel(phoneParameter[0]);
            phone.setBatteryCap(Integer.parseInt(phoneParameter[1]));
            phone.setScreenSize(Double.parseDouble(phoneParameter[2]));
            phone.setScreenResolution(phoneParameter[3]);
            phone.setPrice(Double.parseDouble(phoneParameter[4]));
            listOfPhones.add(phone);
        }
        return listOfPhones;
    }

    public static void printPhoneInfo(List<Phone> list) throws IOException {
        System.out.println("--------------Phones parameters--------------");
        for (PhoneInterface x : list) {
            x.printInfo();
        }
    }

    public static void addPhone() throws IOException {
        Phone phone = new Phone();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model");
        phone.setModel(s.nextLine());
        System.out.println("Enter Battery capacity");
        phone.setBatteryCap(s.nextInt());
        System.out.println("Enter screen size");
        phone.setScreenSize(s.nextDouble());
        s.nextLine();
        System.out.println("Enter screen resolution");
        phone.setScreenResolution(s.nextLine());
        System.out.println("Enter the price");
        phone.setPrice(s.nextDouble());
        ReaderWriterService.writer(PHONE_PHAT, phone.toString());
    }

    public static void search() throws IOException {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter model name");
        printPhoneInfo(ShopItemService.searchByModel(phoneReader(), ss.nextLine()));
    }


    public static void deletePhone() throws IOException {
        Scanner ss = new Scanner(System.in);
        ReaderWriterService.deleteLine(PHONE_PHAT, ss.nextLine());
    }

}
