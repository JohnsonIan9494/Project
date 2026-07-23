package main;

import main.restaurant.factory.IComboCreator;
import main.restaurant.factory.LunchComboCreator;
import main.restaurant.menu.Combo;
import main.restaurant.order.Order;

public class Main {
    static void main() {

        // creates an order number 1
        Order order = new Order(1);

        IComboCreator lunchCreator = new LunchComboCreator();
        Combo lunch = lunchCreator.createCombo();

        // adds a lunch combo to order number 1
        order.addItem(lunch);

        // prints the total of a lunch combo that is added to the User's order
        System.out.println("Total: " + order.getTotalPrice());
    }
}