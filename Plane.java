package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;

public class Plane {
    protected String name;
    protected Double weight;
    protected Double fuelConsumption;//per 100km
    protected Double tankVol;

    public Plane(String name, Double weight, Double fuelConsumption, Double tankVol) {
        this.name = name;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
        this.tankVol = tankVol;

    }

    public String name() {
        return name;
    }

    public Plane setName(String name) {
        this.name = name;
        return this;
    }

    public Double weight() {
        return weight;
    }

    public Plane setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Double fuelConsumption() {
        return fuelConsumption;
    }

    public Plane setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public Double tankVol() {
        return tankVol;
    }

    public Plane setTankVol(Double tankVol) {
        this.tankVol = tankVol;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return Objects.equals(name, plane.name) && Objects.equals(weight, plane.weight) && Objects.equals(fuelConsumption, plane.fuelConsumption) && Objects.equals(tankVol, plane.tankVol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, fuelConsumption, tankVol);
    }
    public void isReady(){
        System.out.println(this.name+" is ready");
    }
    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", tankVol=" + tankVol +
                ", passangersCount=" +
                '}';
    }
}
