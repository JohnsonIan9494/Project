package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {

    private Food food;

    @BeforeEach
    void setUp(){
        food = new Food("Burger", 4.99f, "Hamburger");
    }

    @Test
    void getName_returnsCorrectName(){
        assertEquals("Burger", food.getName());
    }

    @Test
    void getPrice_returnsCorrectPrice(){
        assertEquals(4.99f, food.getPrice());
    }

    @Test
    void getDescription_returnsCorrectDescription(){
        assertEquals("Hamburger", food.getDescription());
    }

}
