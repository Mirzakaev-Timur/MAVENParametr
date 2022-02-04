package ru.netology.sqr;

import org.w3c.dom.ls.LSOutput;

public class SQRService {

        public int sqrOfNumber(int number) {
            for (int i = 10; i <= 99; i++) {
                if (i * i >= number) {
                    return i;
                }
            }
            return 0;
        }
    }