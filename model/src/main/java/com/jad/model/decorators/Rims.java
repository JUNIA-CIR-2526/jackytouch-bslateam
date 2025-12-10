package com.jad.model.decorators;

import com.jad.share.IBehavior;
import com.jad.share.ICar;

public class Rims extends CarDecorator {
    public Rims(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "rims.txt", behavior);
    }
}