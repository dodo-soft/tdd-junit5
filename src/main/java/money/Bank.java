package money;

public class Bank {
    // reduce(動)簡約する。式を単純な形に変形する。
    // TODO:$5+$5がMoneyを返す
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
