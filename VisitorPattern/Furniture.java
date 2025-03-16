package VisitorPattern;


public class Furniture {
    private String type;
    private double weight;
    private double distance;
    private ShippingStrategy shippingStrategy;

    public Furniture(String type, double weight, double distance, ShippingStrategy shippingStrategy) {
        this.type = type;
        this.weight = weight;
        this.distance = distance;
        this.shippingStrategy = shippingStrategy;
    }

    public double getShippingCost() {
        return shippingStrategy.calculateShipping(weight, distance);
    }
}