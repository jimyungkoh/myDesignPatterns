package strategy.payment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LunaCardStrategy implements PaymentStrategy {
    private final String emailId;
    private final String password;

    @Override
    public String pay(int amount) {
        return amount + " paid using LunaCard";
    }
}
