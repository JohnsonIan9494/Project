package main.restaurant.factory;

import main.restaurant.menu.Combo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LunchComboCreatorTest {

    private final IComboCreator creator = new LunchComboCreator();

    @Test
    void createCombo_returnsNonNullCombo() {
        assertNotNull(creator.createCombo());
    }

    @Test
    void createCombo_hasExpectedPrice() {
        Combo combo = creator.createCombo();
        // burger 5.99 + cola 1.99 + fries 2.49 - discount 1.50
        float expected = 5.99f +1.99f + 2.49f - 1.50f;
        assertEquals(expected, combo.getPrice(),0.001f);
    }

    @Test
    void createCombo_nameContainsExpectedItems() {
        Combo combo = creator.createCombo();
        assertTrue(combo.getName().contains("Burger"));
        assertTrue(combo.getName().contains("Cola"));
        assertTrue(combo.getName().contains("Fries"));
    }

    @Test
    void createCombo_returnsNewInstanceEachCall() {
        Combo first = creator.createCombo();
        Combo second = creator.createCombo();
        assertNotSame(first, second);
    }
}
