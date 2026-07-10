package order;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OrderTest {

    private Order order;
    private Food burger;
    private Drink cola;

    @BeforeEach
    void setUp(){
        order = new Order(1);
        burger = new Food("Burger", 5.99f, "Beef Burger");
        cola = new Drink("Cola", 1.99f, "Classic Cola", false);
    }

    @Test
    void addItem_increaseTotalPrice(){
        order.addItem(burger);
        assertEquals(5.99f, order.getTotalPrice(), .001f);
    }

    @Test
    void addItem_acceptMixedOrderableItems(){
        order.addItem(burger);
        order.addItem(cola);
        assertEquals(2, order.getItems().size());
        assertEquals(7.98f, order.getTotalPrice(), 0.001f);
    }

    @Test
    void removeItem_decreasesTotalPrice(){
        order.addItem(burger);
        order.addItem(cola);
        order.removeItem(cola);
        assertEquals(5.99f, order.getTotalPrice(), 0.001f);
    }

    @Test
    void removeItem_returnsFalse_whenItemNotInOrder(){
        assertFalse(order.removeItem(cola));
    }
}
