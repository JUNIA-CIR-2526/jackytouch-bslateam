package com.jad.model.behavior.spoiler;

import com.jad.share.IBehavior;

public class SpoilerAesthetic implements IBehavior {
    @Override
    public String getName() {
        return "Esthétique";
    }

    @Override
    public String getDescription() {
        return "aucun effet mécanique";
    }
}