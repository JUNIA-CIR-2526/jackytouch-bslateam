package com.jad.model.behavior.rims;

import com.jad.share.IBehavior;

public class RimsPerformance implements IBehavior {
    @Override
    public String getName() {
        return "Performance";
    }

    @Override
    public String getDescription() {
        return "accélération améliorée";
    }
}