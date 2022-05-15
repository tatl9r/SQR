package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.crypticCount(1000, 600);
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForNegativeLimit() {
        SQRService service = new SQRService();

        int actual = service.crypticCount(-200, -100);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForZeroLimit() {
        SQRService service = new SQRService();

        int actual = service.crypticCount(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForSmallLimit() {
        SQRService service = new SQRService();

        int actual = service.crypticCount(20, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateForOddLimit() {
        SQRService service = new SQRService();

        int actual = service.crypticCount(705, 307);
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }
}
