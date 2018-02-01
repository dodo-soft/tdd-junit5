package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    //TODO:$5 + 10CHF = $10 (レートが2:1の場合)
    //TODO:通貨の概念

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    // TODO:hashCode()
    // TODO:$5 + 10CHF = $10
    // TODO:他のオブジェクトとの等価性比較
    // TODO:nullとの等価性比較

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
