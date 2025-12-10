package com.jad.controller;

import com.jad.share.ICar;
import com.jad.share.IView;
import com.jad.view.View;

import com.jad.model.Car;
import com.jad.model.decorators.*;
import com.jad.model.behavior.neon.*;
import com.jad.model.behavior.spoiler.*;
import com.jad.model.behavior.rims.*;
import com.jad.model.behavior.exhaust.*;

public class Controller {
    private final IView view;
    private ICar currentCar;

    public Controller() {
        this.view = new View();
    }

    public void start() {
        this.currentCar = new Car();
        this.updateAndWait();

        this.currentCar = new Neon(this.currentCar, new NeonDisco());
        this.updateAndWait();

        this.currentCar = new Spoiler(this.currentCar, new SpoilerAesthetic());
        this.updateAndWait();

        this.currentCar = new Rims(this.currentCar, new RimsShowOff());
        this.updateAndWait();

        this.view.archiveCar(this.currentCar);
        this.view.getInput();

        this.currentCar = new Car();
        this.updateAndWait();

        this.currentCar = new Exhaust(this.currentCar, new ExhaustDrag());
        this.updateAndWait();

        this.currentCar = new Spoiler(this.currentCar, new SpoilerAerodynamique());
        this.updateAndWait();

        this.currentCar = new Rims(this.currentCar, new RimsPerformance());
        this.updateAndWait();

        this.currentCar = new Neon(this.currentCar, new NeonSober());
        this.view.display(this.currentCar);
    }

    private void updateAndWait() {
        this.view.display(this.currentCar);
        this.view.getInput();
    }
}