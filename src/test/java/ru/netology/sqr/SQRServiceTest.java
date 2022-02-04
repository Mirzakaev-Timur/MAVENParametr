package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void sqrOfRoundedNumberHundred() {
        SQRService service = new SQRService();
        int number = 200;
        int expected = 15;

        int actual = service.sqrOfNumber(number);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrOfRoundedNumberThousands() {
        SQRService service = new SQRService();
        int number = 2_000;
        int expected = 45;

        int actual = service.sqrOfNumber(number);

        assertEquals(expected, actual);
    }
}

