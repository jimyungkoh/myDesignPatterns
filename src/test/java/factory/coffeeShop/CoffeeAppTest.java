package factory.coffeeShop;

import factory.coffeeShop.coffee.Americano;
import factory.coffeeShop.coffee.Coffee;
import factory.coffeeShop.coffee.Latte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeAppTest {
    @Test
    void testCoffeeFactory() {
        Coffee latte = CoffeeFactory.getCoffee("LATTE", 5000);
        Coffee americano = CoffeeFactory.getCoffee("AMERICANO", 4500);

        assertEquals(new Latte(5000), latte);
        assertEquals(new Americano(4500), americano);
    }
}