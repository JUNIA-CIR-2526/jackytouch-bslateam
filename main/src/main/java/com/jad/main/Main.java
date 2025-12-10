package com.jad.main;

import com.jad.controller.Controller;
import com.jad.model.*;
import com.jad.share.ICar;

public class Main {
    public static void main(String[] args) {
        ICar car = new Car();

        car = new Neon(car, new Strategies.NeonDisco());
        car = new Spoiler(car, new Strategies.SpoilerAerodynamic());
        car = new Rims(car, new Strategies.RimsPerformance());
        car = new Exhaust(car, new Strategies.ExhaustDrag());

        Controller controller = new Controller(car);
        controller.start();
    }
}