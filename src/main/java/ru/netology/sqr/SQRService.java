package ru.netology.sqr;

import org.w3c.dom.ls.LSOutput;

public class SQRService {

    public int sqrOfNumber(int underLimit, int overLimit) {
        int number = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= underLimit && i * i <= overLimit) {
                number++;
            }
        }

        return (number);
    }
}

