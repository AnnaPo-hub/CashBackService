package ru.netology.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        int actual = cashBackService.remain(900);
        assertEquals(100, actual);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmountIsEqualToBoundary() {
        int actual = cashBackService.remain(1000);
        assertEquals(0, actual);
    }

    @org.junit.Test
    public void shouldThrowExceptionIfAmountLessThanZero() {
        assertThrows(IllegalArgumentException.class, () -> cashBackService.remain(-1));

    }
}
