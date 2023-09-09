package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

//    SPECIAL METHODS
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder entrees = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("entree")) {
                entrees.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nHARPER'S RAMEN MENU\n\n" +
                "---APPETIZERS---" + appetizers.toString() + "\n" +
                "---ENTREES---" + entrees.toString() + "\n" +
                "---DESSERTS---" + desserts.toString() + "\n";
    }

//    INSTANCE METHODS

    void addItem(MenuItem newItem) {
        String message = "Item has already been added to menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();

    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
    }
}
