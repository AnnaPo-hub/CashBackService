package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackServiceTest {

    @org.junit.Test
    public void remain() {
        CashBackService cashBackService = new CashBackService();
        assertEquals(100,cashBackService.remain(900) );
    }
}