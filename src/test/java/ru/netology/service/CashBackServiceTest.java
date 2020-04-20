package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(100,cashBackService.remain(900) );

    }

    @org.junit.Test
    public void shouldReturn1000IfAmountIsEqualToBoundary() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(1000,cashBackService.remain(1000) );


    }


    @org.junit.jupiter.api.Test
    void shouldReturn100ifAmountIs900() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(100, cashBackService.remain(900));
    }
}
