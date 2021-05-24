package patterns.prototype.domain.shapes;

import lombok.Data;
import lombok.NoArgsConstructor;
import patterns.prototype.domain.Point;

@Data
@NoArgsConstructor
public abstract class Shape {
    private Point startPoint;
    private Point endPoint;
    private String color;

    public Shape(Shape shape){
        if(shape != null){
            this.startPoint = shape.startPoint;
            this.endPoint = shape.endPoint;
            this.color = shape.color;
        }
    }

    public abstract Shape clone();
}
