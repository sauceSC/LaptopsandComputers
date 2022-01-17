package com.company;

public class Computer extends Laptop{
    int diagonal;
    public Computer(int cost, Model model, int diagonal) {
        super(cost, model);
        this.diagonal = diagonal;
    }

    public Computer() {
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Компьютер: " + "\n" +
                "Цена: " + cost + "\n" +
                "Модель: " + model + "\n" +
                "Диагональ монитора: " + diagonal + "\n";
    }
}
