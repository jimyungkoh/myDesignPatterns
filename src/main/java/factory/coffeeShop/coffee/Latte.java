package factory.coffeeShop.coffee;

import java.util.Objects;

public class Latte extends Coffee {
    private final int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Latte latte = (Latte) o;
        return price == latte.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
