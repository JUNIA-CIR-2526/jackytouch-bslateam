package com.jad.controller;

import com.jad.model.*;
import com.jad.share.IBehavior;
import com.jad.share.ICar;
import com.jad.share.IController;
import com.jad.share.IView;
import com.jad.view.View;

public class Controller implements IController {
    private final ICar car;
    private final IView view;

    public Controller(IBehavior spoiler, IBehavior neon, IBehavior rims, IBehavior exhaust) {
        this.view = new View();
        this.car = buildCar(spoiler, neon, rims, exhaust);
    }

    private ICar buildCar(IBehavior spoiler, IBehavior neon, IBehavior rims, IBehavior exhaust) {
        ICar c = new Car();

        if (neon != null) c = new Neon(c, neon);
        if (rims != null) c = new Rims(c, rims);
        if (exhaust != null) c = new Exhaust(c, exhaust);
        if (spoiler != null) c = new Spoiler(c, spoiler);

        return c;
    }

    @Override
    public void start() {
        view.display(car);
    }
}