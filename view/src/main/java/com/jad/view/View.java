package com.jad.view;

import com.jad.share.ICar;
import com.jad.share.IView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class View implements IView {
    private final JFrame frame;
    private final JTextArea textArea;
    private final Object lock = new Object();
    private final StringBuilder history = new StringBuilder();

    public View() {
        this.frame = new JFrame("Simulateur Jacky Touch");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 800);
        this.frame.setLocationRelativeTo(null);

        this.textArea = new JTextArea();
        this.textArea.setFont(new Font("Monospaced", Font.BOLD, 12));
        this.textArea.setEditable(false);
        this.textArea.setBackground(Color.BLACK);
        this.textArea.setForeground(Color.WHITE);

        this.textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    synchronized (lock) {
                        lock.notify();
                    }
                }
            }
        });

        this.frame.add(new JScrollPane(this.textArea));
        this.frame.setVisible(true);
        this.textArea.requestFocusInWindow();
    }

    private String renderCarToString(ICar car) {
        StringBuilder sb = new StringBuilder();
        List<String> image = car.getRenderedImage();
        for (String line : image) {
            sb.append(line).append("\n");
        }
        sb.append("\n--------------------------------------------------\n");
        sb.append("STATS :\n");
        for (String stat : car.getStats()) {
            sb.append("- ").append(stat).append("\n");
        }
        sb.append("--------------------------------------------------\n");
        return sb.toString();
    }

    @Override
    public void display(ICar car) {
        String currentContent = renderCarToString(car);
        String fullContent = this.history.toString() + currentContent + "\n[Appuyez sur ESPACE pour continuer...]";

        this.textArea.setText(fullContent);
        this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
    }

    @Override
    public void archiveCar(ICar car) {
        this.history.append("=== VOITURE TERMINEE ===\n");
        this.history.append(renderCarToString(car));
        this.history.append("\n\nV V V V V V V V V V V V\n\n");
    }

    @Override
    public void displayMenu() {
    }

    @Override
    public String getInput() {
        try {
            synchronized (lock) {
                lock.wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "";
    }
}