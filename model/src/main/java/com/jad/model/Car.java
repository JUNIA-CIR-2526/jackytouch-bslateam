package com.jad.model;

import com.jad.share.ICar;
import java.util.ArrayList;
import java.util.List;

public class Car implements ICar {
    @Override
    public List<String> getRenderedImage() {
        return new ArrayList<>();
    }

    @Override
    public List<String> getStats() {
        return new ArrayList<>();
    }
}