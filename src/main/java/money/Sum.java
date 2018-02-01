package money;

public class Sum implements Expression {
    public Expression augend; // 被加算量（足される数）
    public Expression addend; // 加数（足す数）

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    // TODO:空実装
    public Expression plus(Expression addend) {
        return null;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}
