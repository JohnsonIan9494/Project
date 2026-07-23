package main.restaurant.menu;

public class Side implements IOrderable {
    private final String name;
    private final float price;
    private final String description;

    public Side(String name, float price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
