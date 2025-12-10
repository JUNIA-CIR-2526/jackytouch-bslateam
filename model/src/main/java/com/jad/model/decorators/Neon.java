package com.jad.model.decorators;

import com.jad.share.IBehavior;
import com.jad.share.ICar;

public class Neon extends CarDecorator {
    public Neon(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "neon.txt", behavior);
    }
}