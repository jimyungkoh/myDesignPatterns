package factory.coffeeShop.coffee;


public class DefaultCoffee extends Coffee {
    private final int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
