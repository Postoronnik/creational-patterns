package factory.start.point;

import factory.Factory;
import factory.ObjectAFactory;
import factory.ObjectBFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ObjectAFactory();
        System.out.println(factory.createObject());

        factory = new ObjectBFactory();
        System.out.println(factory.createObject());
    }
}
