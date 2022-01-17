package com.company;

public class Laptop implements Discountable{
    int cost;
    Model model;

    public Laptop() {
    }

    public Laptop(int cost, Model model) {
        this.cost = cost;
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public  Model getModel() {
        return model;
    }

    public void setModel( Model model) {
        this.model = model;
    }

    @Override
    public void discount() {
        int discount = cost - ((cost / 100) * 20);
        setCost(discount);

    }

    @Override
    public String toString() {
        return "Ноутбук:" + "\n" +
                "Цена: " + cost + "\n" +
                "Модель ноутбука: " + model + "\n";
    }

}
