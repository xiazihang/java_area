package designpatterns.factorypatter;

/**
 * Created by zhxia on 20/04/2017.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
