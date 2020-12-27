package service;


import models.SmartWatch;

import java.io.IOException;
import java.util.Scanner;


public class Menu {

    public static void authorizationMenu() throws IOException {
        boolean isMenuActive = true;
        Scanner s = new Scanner(System.in);

        while (isMenuActive) {
            System.out.println("\nWelcome to TechShop");
            System.out.println("1: For Login (Entering user name and password):");
            System.out.println("2: For registration:");
            System.out.println("3: Exit");

            int i = s.nextInt();
            switch (i) {
                case 1:
                    Authorization.login();
                    break;
                case 2:
                    try {
                        Authorization.registration();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    isMenuActive = false;
                    System.out.println("Exiting shop");
                    break;
                default:
                    System.out.println("there is no such a command as " + i);
            }
        }
    }

    public static void mainMenu() {
        boolean isMenuActive = true;
        Scanner s = new Scanner(System.in);

        while (isMenuActive) {
            System.out.println("1: For laptops");
            System.out.println("2: For phones");
            System.out.println("3: For smart watches");
            System.out.println("4: Back to Registration-Login menu");

            int i = s.nextInt();
            switch (i) {
                case 1:
                    laptopMenu();
                    break;
                case 2:
                    phoneMenu();
                    break;
                case 3:
                    watchMenu();
                    break;
                case 4:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("there is no such a command as " + i);
            }
        }
    }

    public static void laptopMenu() {
        boolean isMenuActive = true;
        Scanner s = new Scanner(System.in);
        while (isMenuActive) {
            System.out.println("\nMenu for Laptops");
            System.out.println("1: List of available laptops with parameters");
            System.out.println("2: List of devices within specified limits of price ");
            System.out.println("3: Most expensive laptop");
            System.out.println("4: Lowest priced Laptop");
            System.out.println("5: Add laptop");
            System.out.println("6: Search laptop by model");
            System.out.println("7: Back to main menu");
            int j = s.nextInt();
            switch (j) {
                case 1:
                    try {
                        LaptopService.printLaptopInfo(LaptopService.laptopReader());
                        System.out.println("End of the list");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    double a, b;
                    System.out.println("Enter price limit");

                    a = s.nextDouble();
                    System.out.println("Enter the other limit");
                    b = s.nextDouble();
                    try {
                        LaptopService.printLaptopInfo(ShopItemService.searchByPriceInterval(LaptopService.laptopReader(), a, b));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        ShopItemService.getMaxPrice(LaptopService.laptopReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        ShopItemService.getMinPrice(LaptopService.laptopReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        LaptopService.addLaptop();
                        System.out.println("Device added to list.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        LaptopService.search();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("there is no such a command as " + j);
            }
        }
    }


    public static void phoneMenu() {
        boolean isMenuActive = true;
        Scanner s = new Scanner(System.in);
        while (isMenuActive) {
            System.out.println("\nMenu for phones");
            System.out.println("1: List of available phones with parameters");
            System.out.println("2: List of devices within specified limits of price ");
            System.out.println("3: Most expensive phone in list");
            System.out.println("4: Lowest priced phone in list");
            System.out.println("5: Add phone to list");
            System.out.println("6: Search phone by model");
            System.out.println("7: Back to main menu");
            int j = s.nextInt();
            switch (j) {
                case 1:
                    try {
                        PhoneService.printPhoneInfo(PhoneService.phoneReader());
                        System.out.println("End of the list");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    double a, b;
                    System.out.println("Enter price limit");

                    a = s.nextDouble();
                    System.out.println("Enter the other limit");
                    b = s.nextDouble();
                    try {
                        PhoneService.printPhoneInfo(ShopItemService.searchByPriceInterval(PhoneService.phoneReader(), a, b));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        ShopItemService.getMaxPrice(PhoneService.phoneReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        ShopItemService.getMinPrice(PhoneService.phoneReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        PhoneService.addPhone();
                        System.out.println("Device added to list.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        PhoneService.search();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("there is no such a command as " + j);
            }
        }
    }

    public static void watchMenu() {
        boolean isMenuActive = true;
        Scanner s = new Scanner(System.in);
        while (isMenuActive) {
            System.out.println("\nMenu for smart watches");
            System.out.println("1: List of available smart watches with parameters");
            System.out.println("2: List of devices within specified limits of price ");
            System.out.println("3: Most expensive smart watch in list");
            System.out.println("4: Lowest priced smart watch in list");
            System.out.println("5: Add smart watch to list");
            System.out.println("6: Search smart watch by model");
            System.out.println("7: Back to main menu");
            int j = s.nextInt();
            switch (j) {
                case 1:
                    try {
                        SmartWatchService.printWatchInfo(SmartWatchService.smartWatchReader());
                        System.out.println("End of the list");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    double a, b;
                    System.out.println("Enter price limit");

                    a = s.nextDouble();
                    System.out.println("Enter the other limit");
                    b = s.nextDouble();
                    try {
                        SmartWatchService.printWatchInfo(ShopItemService.searchByPriceInterval(SmartWatchService.smartWatchReader(), a, b));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        ShopItemService.getMaxPrice(SmartWatchService.smartWatchReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        ShopItemService.getMinPrice(SmartWatchService.smartWatchReader()).printInfo();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        SmartWatchService.addSmartWatch();
                        System.out.println("Device added to list.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        SmartWatchService.search();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("there is no such a command as " + j);
            }
        }
    }
}
