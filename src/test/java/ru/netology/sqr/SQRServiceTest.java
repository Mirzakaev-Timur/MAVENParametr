package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalcSqrNumInBound() {
        SQRService service = new SQRService();
        int underLimit = 200;
        int overLimit = 300;
        int expected = 3;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrZero() {
        SQRService service = new SQRService();
        int underLimit = 0;
        int overLimit = 0;
        int expected = 0;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrOne() {
        SQRService service = new SQRService();
        int underLimit = 1;
        int overLimit = 1;
        int expected = 0;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrThousand() {
        SQRService service = new SQRService();
        int underLimit = 2_000;
        int overLimit = 3_000;
        int expected = 10;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrUpThousand() {
        SQRService service = new SQRService();
        int underLimit = 0;
        int overLimit = 1000;
        int expected = 22;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrNegativeNum() {
        SQRService service = new SQRService();
        int underLimit = -300;
        int overLimit = -400;
        int expected = 0;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrMinLimit() {
        SQRService service = new SQRService();
        int underLimit = 0;
        int overLimit = 100;
        int expected = 1;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrMaxLimit() {
        SQRService service = new SQRService();
        int underLimit = 0;
        int overLimit = 9801;
        int expected = 89;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalcSqrMinNum() {
        SQRService service = new SQRService();
        int underLimit = 0;
        int overLimit = 1;
        int expected = 0;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);
    }
}
