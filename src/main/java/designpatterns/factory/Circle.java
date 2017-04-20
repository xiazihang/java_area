package designpatterns.factory;

/**
 * Created by zhxia on 20/04/2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
