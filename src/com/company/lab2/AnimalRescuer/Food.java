package com.company.lab2.AnimalRescuer;

public class Food {
    String name = "Carnilove";
    double price = 10;

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

    public double getAmountKg() {
        return amountKg;
    }

    public void setAmountKg(double amountKg) {
        this.amountKg = amountKg;
    }

    public double getStockavailability() {
        return stockavailability;
    }

    public void setStockavailability(double stockavailability) {
        this.stockavailability = stockavailability;
    }

    double amountKg = 150;
    double stockavailability = 500;

}
