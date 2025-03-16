package VisitorPattern;

public class ChairShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(double weight, double distance) {
        return 10.0;
    }
}
