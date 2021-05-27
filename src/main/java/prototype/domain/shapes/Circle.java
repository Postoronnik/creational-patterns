package prototype.domain.shapes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Circle extends Shape {
    private int radius;

    public Circle(Circle circle){
        super(circle);
        if(circle != null){
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString(){
        return "Circle" +
                "{" + this.getStartPoint() +
                "," + this.getEndPoint()  +
                "," + this.getColor() +
                "," + this.getRadius() +
                "}";
    }
}
