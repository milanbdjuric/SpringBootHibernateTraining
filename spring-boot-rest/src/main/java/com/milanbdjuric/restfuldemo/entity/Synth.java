package com.milanbdjuric.restfuldemo.entity;

public class Synth {

    private String model;
    private String manufacturer;

    public Synth(){}

    public Synth(String manufacturer, String model) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
