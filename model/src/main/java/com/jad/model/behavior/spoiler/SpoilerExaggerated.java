package com.jad.model.behavior.spoiler;

import com.jad.share.IBehavior;

public class SpoilerExaggerated implements IBehavior {
    @Override
    public String getName() {
        return "Exagéré";
    }

    @Override
    public String getDescription() {
        return "vitesse max réduite, effet visuel accentué";
    }
}