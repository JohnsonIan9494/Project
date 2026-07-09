package Order;

import java.util.List;

public class Order {

    //

    private int orderNumber;
    private List<Food> foodList;
    private List<Drink> drinkList;
    private String orderName;
    private float totalPrice;


    public Order(int orderNumber){
        this.orderNumber = orderNumber;
    }

    // add food item to order
    public void addFood(Food food){
        foodList.add(food);
    }

    // add drink item to order
    public void addDrink(Drink drink){
        drinkList.add(drink);
    }

    // sets the name for the order based on a given string.
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // can be used if we want to manually change the order number, currently
    // the constructor requires an order number to create an order.
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // sets the total price by summing up all food prices and then all drink prices
    public void setTotalPrice(){
        float foodprice = 0;
        for(Food food : foodList){
            foodprice += food.getPrice();
        }
        float drinkprice = 0;
        for(Drink drink : drinkList){
            drinkprice += drink.getPrice();
        }
        this.totalPrice = foodprice + drinkprice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }
}
