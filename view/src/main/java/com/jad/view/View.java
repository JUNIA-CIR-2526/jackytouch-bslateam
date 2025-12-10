package com.jad.view;

import com.jad.share.ICar;
import com.jad.share.IView;
import java.util.List;

public class View implements IView {
    @Override
    public void display(ICar car) {
        List<String> image = car.getRenderedImage();
        for (String line : image) {
            System.out.println(line);
        }
        System.out.println("Stats:");
        for (String stat : car.getStats()) {
            System.out.println("- " + stat);
        }
    }
}