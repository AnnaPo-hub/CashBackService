package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        int actual = cashBackService.remain(900);
        assertEquals(100, actual);
    }

    @org.junit.Test
    public void shouldReturn1000IfAmountIsEqualToBoundary() {
        int actual = cashBackService.remain(1000);
        assertEquals(1000, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturn100ifAmountIs900() {
        int actual = cashBackService.remain(900);
        assertEquals(100, actual);
    }
}
