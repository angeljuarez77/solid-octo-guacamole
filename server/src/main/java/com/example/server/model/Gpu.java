package com.example.server.model;

import javax.persistence.*;

@Entity
@Table(name = "gpus")
public class Gpu {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    private boolean raytracing;

    public Gpu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRaytracing() {
        return raytracing;
    }

    public void setRaytracing(boolean raytracing) {
        this.raytracing = raytracing;
    }
}
