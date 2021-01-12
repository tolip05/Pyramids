package com.company;

import com.company.commands.*;
import com.company.helpers.Repeat;
import com.company.helpers.RepeatImpl;
import com.company.io.ConsoleReader;
import com.company.io.ConsoleWriter;
import com.company.io.Reader;
import com.company.io.Write;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Write write = new ConsoleWriter();
        Reader reader = new ConsoleReader();
        Repeat repeat = new RepeatImpl();
        int n = Integer.parseInt(reader.read());
        Pyramid pyramid1 = new Pattern1(write,repeat);
        Pyramid pyramid2 = new Pattern2(write,repeat);
        Pyramid pyramid3 = new Pattern3(write,repeat);
        Pyramid pyramid4 = new Pattern4(write,repeat);
        Pyramid pyramid5 = new Pattern5(write,repeat);
        Pyramid pyramid6 = new Pattern6(write,repeat);
        Context context = new Context(pyramid1);
        context.executeStrategy(n);
        context = new Context(pyramid2);
        context.executeStrategy(n);
        context = new Context(pyramid3);
        context.executeStrategy(n);
        context = new Context(pyramid4);
        context.executeStrategy(n);
        context = new Context(pyramid5);
        context.executeStrategy(n);
        context = new Context(pyramid6);
        context.executeStrategy(n);
    }
}
