package com.jad.model.behavior.neon;

import com.jad.share.IBehavior;

public class NeonDisco implements IBehavior {
    @Override
    public String getName() {
        return "Disco";
    }

    @Override
    public String getDescription() {
        return "clignotement simulé";
    }
}