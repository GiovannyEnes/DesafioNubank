package com.giovannyenes.model;

public class Tax {
    private double tax;

    public Tax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "tax: "
                + tax;
    }
}
