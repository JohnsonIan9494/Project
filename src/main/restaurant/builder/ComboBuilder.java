package main.restaurant.builder;

import main.restaurant.menu.Combo;
import main.restaurant.menu.Drink;
import main.restaurant.menu.Food;
import main.restaurant.menu.Side;

public class ComboBuilder {

    private Food food;
    private Drink drink;
    private Side side;
    private float discount = 0f; // default is no discount unless one is set.

    public ComboBuilder setFood(Food food){
        this.food = food;
        return this;
    }

    public ComboBuilder setDrink(Drink drink){
        this.drink = drink;
        return this;
    }

    public ComboBuilder setSide(Side side){
        this.side = side;
        return this;
    }

    public ComboBuilder setDiscount(float discount){
        this.discount = discount;
        return this;
    }

    public Combo build(){
        if(food == null || drink == null || side == null){
            throw new IllegalStateException("Combo requires a food, drink and a side to be set before building");
        }
        return new Combo(food, drink, side, discount);
    }

}
