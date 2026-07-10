package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrinkTest {

    private Drink smallDrink;
    private Drink largeDrink;

    @BeforeEach
    void setUp(){
        smallDrink = new Drink("Cola", 1.99f, "Classic Cola", false);
        largeDrink = new Drink("Cola", 2.99f, "Classic Cola", true);
    }

    @Test
    void getName_returnsCorrectName(){
        assertEquals("Cola", smallDrink.getName());
    }

    @Test
    void getPrice_returnsCorrectPrice(){
        assertEquals(1.99f, smallDrink.getPrice());
    }

    @Test
    void getDescription_returnsCorrectDescription(){
        assertEquals("Classic Cola", smallDrink.getDescription());
    }

    @Test
    void getSize_returnSmall_whenIsLargeFalse(){
        assertEquals("Small", smallDrink.getSize());
    }

    @Test
    void getSize_returnLarge_whenIsLargeTrue(){
        assertEquals("Large", largeDrink.getSize());
    }

}
