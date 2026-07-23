package main.restaurant.factory;

import main.restaurant.builder.ComboBuilder;
import main.restaurant.menu.Combo;
import main.restaurant.menu.Food;
import main.restaurant.menu.Drink;
import main.restaurant.menu.Side;

public class LunchComboCreator implements IComboCreator{

    @Override
    public Combo createCombo(){
        Food burger = new Food("Burger", 5.99f, "Beef burger");
        Drink cola = new Drink("Cola", 1.99f, "Classic cola", false);
        Side fries = new Side("Fries", 2.49f, "Crispy fries");

        return new ComboBuilder()
                .setFood(burger)
                .setDrink(cola)
                .setSide(fries)
                .setDiscount(1.50f)
                .build();
    }
}
