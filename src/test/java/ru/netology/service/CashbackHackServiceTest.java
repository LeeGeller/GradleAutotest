package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain2() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testWhenAmountIsThousand() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testWhenAmountMoreThanThousand() {
        int amount = 1500;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}