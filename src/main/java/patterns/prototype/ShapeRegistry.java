package patterns.prototype;

import patterns.prototype.domain.shapes.Shape;

import java.util.HashSet;
import java.util.Set;

public class ShapeRegistry {
    private Set<Shape> shapes = new HashSet<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public Shape getByColor(String color){
        return shapes.stream()
                .filter(e -> e.getColor().equals(color))
                .findFirst()
                .get();
    }
}
