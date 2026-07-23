package main.restaurant.factory;

import main.restaurant.menu.Combo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValueComboCreatorTests {

    private final IComboCreator creator = new ValueComboCreator();

    @Test
    void createCombo_returnsNonNullCombo() {
        assertNotNull(creator.createCombo());
    }

    @Test
    void createCombo_hasExpectedPrice() {
        Combo combo = creator.createCombo();
        // smallBurger 3.49 + water 0.99 + sideSalad 1.99 - discount 0.75
        float expected = 3.49f + 0.99f + 1.99f - 0.75f;
        assertEquals(expected, combo.getPrice(), 0.001f);
    }

    @Test
    void createCombo_nameContainsExpectedItems() {
        Combo combo = creator.createCombo();
        assertTrue(combo.getName().contains("Small Burger"));
        assertTrue(combo.getName().contains("Water"));
        assertTrue(combo.getName().contains("Side Salad"));
    }

    @Test
    void differentCreators_produceDifferentCombos() {
        Combo lunch = new LunchComboCreator().createCombo();
        Combo kids = new KidsComboCreator().createCombo();

        assertNotEquals(lunch.getPrice(), kids.getPrice(), 0.001f);
    }

}
