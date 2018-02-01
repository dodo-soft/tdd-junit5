package money;

public interface Expression {
    //TODO:timesメソッド
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
