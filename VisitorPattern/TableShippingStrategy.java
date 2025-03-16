package VisitorPattern;

public class TableShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(double weight, double distance) {
        return weight * 0.7;
    }
}