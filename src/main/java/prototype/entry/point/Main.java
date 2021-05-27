package prototype.entry.point;

import prototype.ShapeRegistry;
import prototype.domain.Point;
import prototype.domain.shapes.Circle;
import prototype.domain.shapes.Rectangle;
import prototype.domain.shapes.Shape;

public class Main {
    private static ShapeRegistry shapeRegistry = new ShapeRegistry();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setStartPoint(new Point(1,0));
        circle.setEndPoint(new Point(2,1));
        circle.setColor("Blue");
        circle.setRadius(2);

        shapeRegistry.addShape(circle);

        Shape someShape = circle.clone();
        System.out.println("Is circle is equal to someShape? " + someShape.equals(circle));

        Rectangle rectangle = new Rectangle();
        rectangle.setStartPoint(new Point(3,0));
        rectangle.setEndPoint(new Point(5,5));
        rectangle.setColor("Red");
        rectangle.setLength(10);
        rectangle.setWidth(10);

        shapeRegistry.addShape(rectangle);

        someShape = rectangle.clone();
        System.out.println("IS rectangle is equal to someShape? " + someShape.equals(rectangle));

        Shape shapeWithRedColor = shapeRegistry.getByColor("Red");
        System.out.println(shapeWithRedColor);
    }
}
