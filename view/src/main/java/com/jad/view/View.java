package com.jad.view;

import com.jad.share.ICar;
import com.jad.share.IView;

public class View implements IView {
    @Override
    public void display(ICar car) {
        System.out.println("\n--- BSLATEAM CUSTOM GARAGE ---\n");
        for (String line : car.getRenderedImage()) {
            System.out.println(line);
        }
        System.out.println("\n--- SPECIAL ---");
        for (String stat : car.getStats()) {
            System.out.println("> " + stat);
        }
        System.out.println("--------------------");
    }
}