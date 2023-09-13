package main.java;

abstract class MakeupProduct {
    final String brand;
    final String name;

    MakeupProduct(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    abstract void apply();

    abstract String getColour();
}