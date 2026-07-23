package main.restaurant.builder;

import main.restaurant.menu.Combo;
import main.restaurant.menu.Drink;
import main.restaurant.menu.Food;
import main.restaurant.menu.Side;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComboBuilderTest {

    private Food burger;
    private Drink cola;
    private Side fries;

    @BeforeEach
    void setUp(){
        burger = new Food("Burger", 5.99f, "Beef Burger");
        cola = new Drink("Cola", 1.99f, "Classic cola", false);
        fries = new Side("Fries", 2.49f, "Crispy fries");
    }

    @Test
    void build_succeedsWithAllRequiredFields(){
        Combo combo = new ComboBuilder()
                .setFood(burger)
                .setDrink(cola)
                .setSide(fries)
                .build();
        assertNotNull(combo);
    }

    @Test
    void build_throwsException_whenFoodMissing(){
        ComboBuilder builder = new ComboBuilder()
                .setDrink(cola)
                .setSide(fries);
        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void build_throwsException_whenDrinkMissing(){
        ComboBuilder builder = new ComboBuilder()
                .setFood(burger)
                .setSide(fries);
        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void build_throwsException_whenSideMissing(){
        ComboBuilder builder = new ComboBuilder()
                .setDrink(cola)
                .setFood(burger);
        assertThrows(IllegalStateException.class, builder::build);
    }

    @Test
    void build_appliesDiscountCorrectly(){
        Combo combo = new ComboBuilder()
                .setFood(burger)
                .setDrink(cola)
                .setSide(fries)
                .setDiscount(1.00f)
                .build();

        float expected = burger.getPrice() + cola.getPrice() + fries.getPrice() - 1.00f;
        assertEquals(expected, combo.getPrice(), 0.001f);
    }

}
