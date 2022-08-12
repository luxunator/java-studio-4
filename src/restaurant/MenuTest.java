package restaurant;

import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args) {
        MenuItem food = new MenuItem("cheese", 1, 2.5, "d", "d");
        MenuItem foodTwo = new MenuItem("orangr", 2, 2.5, "d", "d");
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(food);
        menuItems.add(foodTwo);
        Menu newMenu = new Menu(1, "newmenu", menuItems);

        System.out.println(newMenu.getMenu());

        MenuItem foodThree = new MenuItem("pickle", 3, 2.5, "d", "d");
        newMenu.add(foodThree);

        System.out.println(newMenu.getMenu());

        newMenu.remove(food);

        System.out.println(newMenu.getMenu());
    }
}