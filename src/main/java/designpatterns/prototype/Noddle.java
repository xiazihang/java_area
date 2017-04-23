package designpatterns.prototype;

/**
 * Created by zhxia on 23/04/2017.
 */
public class Noddle extends Food {
    @Override
    void smell() {
        System.out.println("this is noddle, id : " + getId());
    }
}
