package Order;

public class Drink implements IOrderable {


    private final String name;
    private final float price;
    private final String description;
    private final Boolean isLarge;

    public Drink(String name, float price, String description, Boolean isLarge) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isLarge = isLarge;
    }

    public String getName(){
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // returns "Large" if isLarge is true, else return "Small"
    // only 2 sizes
    public String getSize(){
        if(isLarge){
            return "Large";
        }else{
            return "Small";
        }
    }
}
