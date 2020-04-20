package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackServiceTest {

    @org.junit.Test
    public void showdCheckRemain() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(100,cashBackService.remain(900) );

    }

    @org.junit.Test
    public void showdCheckRemainIfAmountIsEqualToBoundary() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(0,cashBackService.remain(1000) );


    }
}