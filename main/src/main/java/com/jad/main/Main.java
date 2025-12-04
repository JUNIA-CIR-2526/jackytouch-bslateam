package com.jad.main;

import com.jad.controller.Controller;
import com.jad.model.Strategies;
import com.jad.share.IBehavior;

public class Main {
    public static void main(String[] args) {

        IBehavior spoiler = new Strategies.SpoilerExaggerated();
        IBehavior neon = new Strategies.NeonDisco();
        IBehavior rims = new Strategies.RimsShowOff();
        IBehavior exhaust = new Strategies.ExhaustSport();

        Controller controller = new Controller(spoiler, neon, rims, null);
        controller.start();
    }
}