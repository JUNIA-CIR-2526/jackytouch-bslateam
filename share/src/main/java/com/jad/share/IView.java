package com.jad.share;

public interface IView {
    void display(ICar car);
    void archiveCar(ICar car);
    void displayMenu();
    String getInput();
}