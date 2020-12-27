package service;

import models.Interfaces.ShopItemInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Double;

public class ShopItemService {


    public static <T extends ShopItemInterface> T getMaxPrice(List<T> shopItems) {
        return shopItems.stream().max(Comparator.comparingDouble(ShopItemInterface::getPrice)).get();
    }


    public static <T extends ShopItemInterface> T getMinPrice(List<T> shopItems) {
        return shopItems.stream().min(Comparator.comparingDouble(ShopItemInterface::getPrice)).get();
    }


    public static <T extends ShopItemInterface> List<T> searchByModel(List<T> shopItems, String model) {
        List<T> searchMatches = new ArrayList<>();
        for (T x : shopItems) {
            if (x.getModel().equalsIgnoreCase(model)) {
                searchMatches.add(x);
            }
        }
        return searchMatches;

    }


    public static <T extends ShopItemInterface> List<T> searchByPriceInterval(List<T> shopItems, double price1, double price2) {
        List<T> searchMatches = new ArrayList<>();
        for (T x : shopItems) {
            if (x.getPrice() <= price2 && x.getPrice()>=price1) {
                searchMatches.add(x);
            }
        }
        return searchMatches;

    }
}


