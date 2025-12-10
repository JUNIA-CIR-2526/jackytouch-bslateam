package com.jad.model.decorators;

import com.jad.share.IBehavior;
import com.jad.share.ICar;

public class Spoiler extends CarDecorator {
    public Spoiler(ICar decoratedCar, IBehavior behavior) {
        super(decoratedCar, "spoiler.txt", behavior);
    }
}