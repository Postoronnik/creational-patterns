package prototype.domain.shapes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        if(rectangle != null){
            this.width = rectangle.width;
            this.length = rectangle.length;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString(){
        return "Rectangle" +
                "{" + this.getStartPoint() +
                "," + this.getEndPoint()  +
                "," + this.getColor() +
                "," + this.getLength() +
                "," + this.getWidth() +
                "}";
    }
}
