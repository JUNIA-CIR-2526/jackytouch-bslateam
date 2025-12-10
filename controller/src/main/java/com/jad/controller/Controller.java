package com.jad.controller;

import com.jad.share.ICar;
import com.jad.share.IView;
import com.jad.view.View;

public class Controller {
    private final IView view;
    private final ICar car;

    public Controller(ICar car) {
        this.view = new View();
        this.car = car;
    }

    public void start() {
        this.view.display(this.car);
    }
}