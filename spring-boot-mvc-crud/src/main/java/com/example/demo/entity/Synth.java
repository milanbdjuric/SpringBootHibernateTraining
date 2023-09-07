package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="synth")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Synth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "serial_number")
    private int serialNumber;

    public Synth(String manufacturerName, String modelName, int serialNumber) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
    }
}
