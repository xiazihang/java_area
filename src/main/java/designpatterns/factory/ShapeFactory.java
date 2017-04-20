package designpatterns.factory;

import static designpatterns.factory.ShapeType.CIRCLE;
import static designpatterns.factory.ShapeType.RECTANGLE;

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
