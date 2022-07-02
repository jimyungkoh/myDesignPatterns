package strategy.payment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KakaoCardStrategy implements PaymentStrategy{
    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String dateOfExpiry;

    @Override
    public String pay(int amount) {
        return amount+" paid using KakaoCard";
    }
}
