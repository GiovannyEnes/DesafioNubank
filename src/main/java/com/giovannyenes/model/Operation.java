package com.giovannyenes.model;


public class Operation {
    private OperationType operation;
    private double uniCost;
    private int quantity;

    public Operation(OperationType operation, double uniCost, int quantity) {
        this.operation = operation;
        this.uniCost = uniCost;
        this.quantity = quantity;
    }

    public double getUniCost() {
        return uniCost;
    }

    public void setUniCost(double uniCost) {
        this.uniCost = uniCost;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "operation: "
                + operation
                + ", uniCost: "
                + uniCost
                + ", quantity: "
                + quantity;
    }
}
