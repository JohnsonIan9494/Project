package order;

public class Combo implements IOrderable{

    private final Food food;
    private final Drink drink;
    private final Side side;
    private final float discount; // how much is saved by making it a combo

    public Combo(Food food, Drink drink, Side side, float discount){
        this.food = food;
        this.drink = drink;
        this.side = side;
        this.discount = discount;
    }

    @Override
    public float getPrice(){
        float total = food.getPrice() + drink.getPrice() + side.getPrice();
        return total - discount;
    }

    @Override
    public String getName(){
        return "Combo: " + food.getName() + " + " + drink.getName() + " + " + side.getName();
    }

    @Override
    public String getDescription(){
        return "Combo meal including " + food.getName() + " + " + drink.getName() + " + " + side.getName();
    }


}
