package abstract_factory.start.point;


import abstract_factory.factories.BitterAndSaltyFactory;
import abstract_factory.factories.SweetAndSoftFactory;
import abstract_factory.factories.SweetsFactory;

public class Main {
    private static SweetsFactory sweetsFactory;
    public static void main(String[] args) {

        System.out.println("Salty candies and bitter chocolate");
        sweetsFactory = new BitterAndSaltyFactory();
        System.out.println(sweetsFactory.createCandie());
        System.out.println(sweetsFactory.createChocolate());

        System.out.println();
        System.out.println("Sweet candies and milk chocolate");
        sweetsFactory = new SweetAndSoftFactory();
        System.out.println(sweetsFactory.createCandie());
        System.out.println(sweetsFactory.createChocolate());
    }
}
