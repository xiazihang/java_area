package designpatterns.factorypatter;

import static designpatterns.factorypatter.ShapeFactory.getShape;
import static designpatterns.factorypatter.ShapeType.CIRCLE;
import static designpatterns.factorypatter.ShapeType.RECTANGLE;
import static designpatterns.factorypatter.ShapeType.SQUARE;

/**
 * Created by zhxia on 20/04/2017.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape rectangleShape = getShape(RECTANGLE);
        Shape circleShape = getShape(CIRCLE);
        Shape squareShape = getShape(SQUARE);

        System.out.println("+++++++++++++++++++++++++");
        rectangleShape.draw();
        System.out.println("+++++++++++++++++++++++++");
        circleShape.draw();
        System.out.println("+++++++++++++++++++++++++");
        squareShape.draw();
        System.out.println("+++++++++++++++++++++++++");
    }
}
