package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testRemain2() {
        int amount = 450;
        int expected = 550;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testWhenAmountIsThousand() {
        int amount = 1000;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testWhenAmountMoreThanThousand() {
        int amount = 1500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}