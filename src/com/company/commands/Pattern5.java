package com.company.commands;

import com.company.helpers.Repeat;
import com.company.io.Write;

public class Pattern5 implements Pyramid {
    private Write write;
    private Repeat repeat;

    public Pattern5(Write write,Repeat repeat) {
        this.write = write;
        this.repeat = repeat;
    }

    @Override
    public void printPyramid(int n) {
        int upperAndDownRows = n - 1;
        int count = 1;
        for (int i = upperAndDownRows; i >= 0; i--) {
            this.write.write(this.repeat.repeatString(" ", upperAndDownRows - i) + count);
            this.write.write(this.repeat.repeatNumber(count + 1,i));
            this.write.writeLine(this.repeat.repeatNumberReverse(i,i));
        }

    }
}
