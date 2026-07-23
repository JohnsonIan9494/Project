package main.restaurant.factory;

import main.restaurant.menu.Combo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KidsComboCreatorTests {

    private final IComboCreator creator = new KidsComboCreator();

    @Test
    void createCombo_returnsNonNullCombo() {
        assertNotNull(creator.createCombo());
    }

    @Test
    void createCombo_hasExpectedPrice() {
        Combo combo = creator.createCombo();
        // nuggets 3.99 + juice 1.49 + applesauce 1.29 - discount 1.00
        float expected = 3.99f + 1.49f + 1.29f - 1.00f;
        assertEquals(expected, combo.getPrice(), 0.001f);
    }

    @Test
    void createCombo_nameContainsExpectedItems() {
        Combo combo = creator.createCombo();
        assertTrue(combo.getName().contains("Chicken Nuggets"));
        assertTrue(combo.getName().contains("Apple Juice"));
        assertTrue(combo.getName().contains("Applesauce"));
    }
}
