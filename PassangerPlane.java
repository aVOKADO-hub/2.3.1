package org.example;

import java.util.Objects;

public class PassangerPlane extends Plane{
    private int floorsCount;
    private int passangersCount;

    public PassangerPlane(String name, Double weight, Double fuelConsumption, Double tankVol, int floorsCount, int passangersCount) {
        super(name, weight, fuelConsumption, tankVol);
        this.floorsCount = floorsCount;
        this.passangersCount = passangersCount;
    }

    public int floorsCount() {
        return floorsCount;
    }

    public PassangerPlane setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
        return this;
    }

    public int passangersCount() {
        return passangersCount;
    }

    public PassangerPlane setPassangersCount(int passangersCount) {
        this.passangersCount = passangersCount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassangerPlane)) return false;
        if (!super.equals(o)) return false;
        PassangerPlane that = (PassangerPlane) o;
        return floorsCount == that.floorsCount && passangersCount == that.passangersCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorsCount, passangersCount);
    }

    @Override
    public void isReady() {
        System.out.println(this.name+" is ready");
    }

    @Override
    public String toString() {
        return "PassangerPlane{" +
                "floorsCount=" + floorsCount +
                ", passangersCount=" + passangersCount +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", tankVol=" + tankVol +
                '}';
    }
}
