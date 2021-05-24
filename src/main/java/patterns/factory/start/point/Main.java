package patterns.factory.start.point;

import patterns.factory.Factory;
import patterns.factory.ObjectAFactory;
import patterns.factory.ObjectBFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ObjectAFactory();
        System.out.println(factory.createObject());

        factory = new ObjectBFactory();
        System.out.println(factory.createObject());
    }
}
