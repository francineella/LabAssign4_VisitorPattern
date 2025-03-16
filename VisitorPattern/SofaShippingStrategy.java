package VisitorPattern;

public class SofaShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(double weight, double distance) {
        return weight * 0.5 + distance * 0.3;
    }
}