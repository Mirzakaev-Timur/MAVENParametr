package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void checkTest() {
        SQRService service = new SQRService();
        int underLimit = 200;
        int overLimit = 300;
        int expected = 3;

        int actual = service.sqrOfNumber(underLimit, overLimit);

        assertEquals(expected, actual);

    }
}