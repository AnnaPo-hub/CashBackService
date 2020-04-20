package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashBackServiceTest {

   @Test
    public void remain() {
        CashBackService cashBackService = new CashBackService();
        assertEquals (cashBackService.remain(900), 100);
    }
}
