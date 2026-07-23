package main;

import main.restaurant.factory.IComboCreator;
import main.restaurant.factory.LunchComboCreator;
import main.restaurant.menu.Combo;
import main.restaurant.order.Order;

public class Main {
    static void main() {
        Order order = new Order(1);

        IComboCreator lunchCreator = new LunchComboCreator();
        Combo lunch = lunchCreator.createCombo();

        order.addItem(lunch);

        System.out.println("Total: " + order.getTotalPrice());
    }
}