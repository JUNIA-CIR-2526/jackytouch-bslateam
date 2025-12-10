package com.jad.model.decorators;

import com.jad.share.IBehavior;
import com.jad.share.ICar;

public class Exhaust extends CarDecorator {
    public Exhaust(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "exhaust.txt", behavior);
    }
}