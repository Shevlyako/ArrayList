package org.example;

public class Car {
    private String brand;
    private int number;

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }
}
