package designpatterns.singleton;

/**
 * Created by zhxia on 21/04/2017.
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void showMessage(){
        System.out.println("hello world!");
    };
}
