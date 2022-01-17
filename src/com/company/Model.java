package com.company;

public enum Model {
    Dell ("Dell"),
    Lenovo ("Lenovo"),
    Mac ("Mac"),
    HP ("HP"),
    Sony ("Sony");

    public String model;
    Model(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
