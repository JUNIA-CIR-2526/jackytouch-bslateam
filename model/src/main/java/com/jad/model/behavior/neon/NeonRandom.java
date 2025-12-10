package com.jad.model.behavior.neon;

import com.jad.share.IBehavior;

public class NeonRandom implements IBehavior {
    @Override
    public String getName() {
        return "Aléatoire";
    }

    @Override
    public String getDescription() {
        return "affichage imprévisible";
    }
}