import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhxia on 11/01/2017.
 */
public class Observerimpl implements Observer{
    @Override
    public void update(Observable obserable, Object arg) {
        Obserableimpl obj = (Obserableimpl) obserable;
        System.out.println("observable.data changed, the new value is " + obj.getData());
    }
}
