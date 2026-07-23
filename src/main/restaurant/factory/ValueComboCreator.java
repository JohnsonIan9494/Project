package main.restaurant.factory;

import main.restaurant.builder.ComboBuilder;
import main.restaurant.factory.IComboCreator;
import main.restaurant.menu.Combo;
import main.restaurant.menu.Food;
import main.restaurant.menu.Drink;
import main.restaurant.menu.Side;

public class ValueComboCreator implements IComboCreator {
    @Override
    public Combo createCombo() {
        Food smallBurger = new Food("Small Burger", 3.49f, "Single Patty Burger");
        Drink water = new Drink("Water", 0.99f, "Bottled Water", false);
        Side sideSalad = new Side("Side Salad", 1.99f, "Small garden salad");

        return new ComboBuilder()
                .setFood(smallBurger)
                .setDrink(water)
                .setSide(sideSalad)
                .setDiscount(.75f)
                .build();
    }
}