package com.jad.view;

import com.jad.share.ICar;
import com.jad.share.IView;
import java.util.List;
import java.util.Scanner;

public class View implements IView {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void display(ICar car) {
        for (int i = 0; i < 50; i++) System.out.println();

        List<String> image = car.getRenderedImage();
        for (String line : image) {
            System.out.println(line);
        }
        System.out.println("Stats:");
        for (String stat : car.getStats()) {
            System.out.println("- " + stat);
        }
    }

    @Override
    public void waitForInput() {
        System.out.println("\n[Appuyez sur Entree pour continuer...]");
        scanner.nextLine();
    }
}