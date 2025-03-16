package VisitorPattern;

public class ECommerce {
    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", 5.0, 100, new ChairShippingStrategy());
        System.out.println("Chair Shipping Cost: $" + chair.getShippingCost());

        Furniture sofa = new Furniture("Sofa", 50.0, 100, new SofaShippingStrategy());
        System.out.println("Sofa Shipping Cost: $" + sofa.getShippingCost());

        Furniture table = new Furniture("Table", 30.0, 100, new TableShippingStrategy());
        System.out.println("Table Shipping Cost: $" + table.getShippingCost());
    }
}