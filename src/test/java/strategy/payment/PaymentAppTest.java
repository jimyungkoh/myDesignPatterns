package strategy.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentAppTest {
    @Test
    void testStrategyMessages() {
        //given
        Item itemA = new Item("Laptop", 800000);
        Item itemB = new Item("Keyboard", 100000);

        int totalAmount = itemA.price() + itemB.price();

        String expectedLunaMessage = totalAmount + " paid using LunaCard";
        String expectedKakaoMessage = totalAmount + " paid using KakaoCard";

        //when
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(itemA);
        cart.addItem(itemB);

        String actualLunaMessage = cart.pay(
                new LunaCardStrategy("payme@payment.com", "123456"));
        String actualKakaoMessage = cart.pay(
                new KakaoCardStrategy(
                        "Jason Koh", "123456789777", "777", "12/06"));

        //then
        assertEquals(actualLunaMessage, expectedLunaMessage);
        assertEquals(actualKakaoMessage, expectedKakaoMessage);
    }
}
