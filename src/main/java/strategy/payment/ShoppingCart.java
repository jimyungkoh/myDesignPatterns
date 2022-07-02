package strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        if (items.isEmpty()) return 0;

        return items.stream().mapToInt(Item::price)
                .reduce(Integer::sum).getAsInt();
    }

    public String pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();

        return paymentMethod.pay(amount);
    }
}
