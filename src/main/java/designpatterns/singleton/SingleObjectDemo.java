package designpatterns.singleton;

/**
 * Created by zhxia on 21/04/2017.
 */
public class SingleObjectDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.showMessage();

    }
}
