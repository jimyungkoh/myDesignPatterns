package factory.coffeeShop.coffee;

import java.util.Objects;

public class Americano extends Coffee {
    private final int price;

    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Americano americano = (Americano) o;
        return price == americano.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
