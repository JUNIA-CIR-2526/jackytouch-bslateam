package com.jad.model.behavior.exhaust;

import com.jad.share.IBehavior;

public class ExhaustSilent implements IBehavior {
    @Override
    public String getName() {
        return "Silencieux";
    }

    @Override
    public String getDescription() {
        return "bruit discret";
    }
}