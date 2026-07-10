package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SideTest {

    private Side side;

    @BeforeEach
    void setUp(){
        side = new Side("Fries", 1.99f, "Side of French Fries");
    }

    @Test
    void getName_returnsCorrectName(){
        assertEquals("Fries", side.getName());
    }

    @Test
    void getPrice_returnsCorrectPrice(){
        assertEquals(1.99f, side.getPrice());
    }

    @Test
    void getDescription_returnsCorrectPrice(){
        assertEquals("Side of French Fries", side.getDescription());
    }
}
