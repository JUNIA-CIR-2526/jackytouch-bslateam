package com.jad.controller;

import com.jad.model.*;
import com.jad.share.ICar;
import com.jad.share.IView;
import com.jad.view.View;

public class Controller {
    private final IView view;
    private ICar car;

    public Controller() {
        this.view = new View();
        this.car = new Car();
    }

    public void start() {
        this.view.display(this.car);
        this.view.waitForInput();

        this.car = new Neon(this.car, new Strategies.NeonDisco());
        this.view.display(this.car);
        this.view.waitForInput();

        this.car = new Spoiler(this.car, new Strategies.SpoilerAerodynamic());
        this.view.display(this.car);
        this.view.waitForInput();

        this.car = new Rims(this.car, new Strategies.RimsPerformance());
        this.view.display(this.car);
        this.view.waitForInput();

        this.car = new Exhaust(this.car, new Strategies.ExhaustDrag());
        this.view.display(this.car);
    }
}