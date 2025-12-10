package com.jad.model.behavior.spoiler;

import com.jad.share.IBehavior;

public class SpoilerAerodynamique implements IBehavior {
    @Override
    public String getName() {
        return "Aérodynamique";
    }

    @Override
    public String getDescription() {
        return "stabilité accrue";
    }
}