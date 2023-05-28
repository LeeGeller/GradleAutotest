package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestWitJunit4 {

    @org.junit.Test
    public void remain() {

            int amount = 800;
            int expected = 200;

            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(amount);

            assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testWhenAmountIsThousand() {
        int amount = 1000;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}