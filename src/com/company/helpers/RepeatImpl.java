package com.company.helpers;

import com.company.io.Reader;

public class RepeatImpl implements Repeat {

    @Override
    public String repeatString(String text, int countToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countToRepeat; i++) {
            sb.append(" ");
            sb.append(text);
        }
        return sb.toString();
    }

    @Override
    public String repeatNumber(int number, int countToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countToRepeat; i++) {
            sb.append(" " + number++);
        }
        return sb.toString();
    }

    @Override
    public String repeatNumberV2(int number, int countToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countToRepeat; i++) {
            sb.append(" ");
            sb.append(" " + number++);
        }
        return sb.toString();
    }

    @Override
    public String repeatNumberReverse(int number, int countToRepeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countToRepeat; i++) {
            sb.append(" " + number--);
        }
        return sb.toString();
    }
}
