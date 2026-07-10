package order;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderNumber;
    private List<IOrderable> items;
    private String orderName;
    private float totalPrice;


    public Order(int orderNumber){

        this.orderNumber = orderNumber;
        this.items = new ArrayList<>();
        this.totalPrice = 0f;
    }

    // add food/drink item to order and recalculate the total price
    public void addItem(IOrderable item){
        items.add(item);
        recalculateTotalPrice();
    }

    // removes an item from the Order's item list and recalculate the total price
    public boolean removeItem(IOrderable item){
        boolean removed = items.remove(item);
        // if removed is true, recalculate
        if(removed){
            recalculateTotalPrice();
        }
        return removed;
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

    // sets the total price by summing up all item prices
    public void setTotalPrice(){
        for(IOrderable item : items){
            this.totalPrice += item.getPrice();
        }
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

    public List<IOrderable> getItems() {
        return items;
    }

    // recalculates the price of the order, done after something chages
    private void recalculateTotalPrice(){
        float sum = 0;
        for(IOrderable item : items){
            sum += item.getPrice();
        }
        totalPrice = sum;
    }
}
