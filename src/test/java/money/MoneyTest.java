package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    //TODO:$5 + 10CHF = $10 (レートが2:1の場合)

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    // TODO:hashCode()
    // TODO:nullとの等価性比較
    // TODO:他のオブジェクトとの等価性比較
    // TODO:$5 + 10CHF = $10
}
