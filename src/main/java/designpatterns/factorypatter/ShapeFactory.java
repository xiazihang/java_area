package designpatterns.factorypatter;

import static designpatterns.factorypatter.ShapeType.CIRCLE;
import static designpatterns.factorypatter.ShapeType.RECTANGLE;

/**
 * Created by zhxia on 20/04/2017.
 */
public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        if (RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (CIRCLE.equals(shapeType)) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
