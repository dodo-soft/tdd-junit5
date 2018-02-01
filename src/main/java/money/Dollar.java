package money;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    // TODO:timesの一般化
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
