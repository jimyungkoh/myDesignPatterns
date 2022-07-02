package factory.coffeeShop;

import factory.coffeeShop.coffee.*;

public class CoffeeFactory {
    public static Coffee getCoffee(String type, int price) {
        return switch (getCoffeeType(type)) {
            case LATTE -> new Latte(price);
            case AMERICANO -> new Americano(price);
            default -> new DefaultCoffee();
        };
    }

    private static CoffeeType getCoffeeType(String type) {
        return CoffeeType.valueOf(type);
    }
}
