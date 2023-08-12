package com.milanbdjuric.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="synth")
public class Synth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="manufacturer_name")
    private String manufacturerName;
    @Column(name="model_name")
    private String modelName;
    @Column(name="serial_number")
    private int serialNumber;

    public Synth(){}

    public Synth(String manufacturerName, String modelName, int serialNumber) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Synth{" +
                "id=" + id +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
