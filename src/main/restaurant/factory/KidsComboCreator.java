package main.restaurant.factory;

import main.restaurant.builder.ComboBuilder;
import main.restaurant.menu.Combo;
import main.restaurant.menu.Food;
import main.restaurant.menu.Drink;
import main.restaurant.menu.Side;

public class KidsComboCreator implements IComboCreator{
    @Override
    public Combo createCombo(){
        Food nuggets = new Food("Chicken Nuggets", 3.99f, "5-piece nuggets");
        Drink juice = new Drink("Apple Juice", 1.49f, "Small Apple Juice", false);
        Side applesauce = new Side("Applesauce", 1.29f, "Single-serve applesauce");

        return new ComboBuilder()
                .setFood(nuggets)
                .setDrink(juice)
                .setSide(applesauce)
                .setDiscount(1.00f)
                .build();
    }
}
