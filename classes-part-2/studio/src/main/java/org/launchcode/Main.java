package org.launchcode;

public class Main {
    public static void main(String[] args){

        MenuItem item1 = new MenuItem( "Gyoza", "Crispy pan fried pork and cabbage dumplings", 7.00, "appetizer");
        MenuItem item2 = new MenuItem( "Edamame", "Steamed soy beans in the pod seasoned with salt", 4.00, "appetizer");
        MenuItem item3 = new MenuItem( "Tonketsu Ramen", "Classic pork style Ramen", 20.00, "entree");
        MenuItem item4 = new MenuItem( "Spicy Tonketsu Ramen", "Spicy version of the classic pork style Ramen", 20.00, "entree");
        MenuItem item5 = new MenuItem( "Mochi Ice cream", "Vanilla ice cream wrapped in mochi, rice dough. Comes in 3 flavors (strawberry, vanilla, green tea)", 6.00, "dessert");

        System.out.println(item1);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        menu.removeItem(item2);
        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem( "Gyoza", "Crispy pan fried pork and cabbage dumplings", 7.00, "appetizer");
        System.out.println(item1.equals(item6));

        menu.addItem(item6);
        System.out.println(menu);
    }
}
