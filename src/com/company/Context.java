package com.company;

import com.company.commands.Pyramid;

public class Context {
    private Pyramid pyramid;

    public Context(Pyramid pyramid) {
        this.pyramid = pyramid;
    }

    public void executeStrategy(int n){
        this.pyramid.printPyramid(n);
    }
}
