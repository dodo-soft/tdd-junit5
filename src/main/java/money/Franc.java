package money;

// テストを書く
// コンパイラを通す
// テストを走らせ、失敗を確認する
// テストを通す
// 重複を排除する
public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
