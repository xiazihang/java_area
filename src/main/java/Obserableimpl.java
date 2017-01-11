import java.util.Observable;

/**
 * Created by zhxia on 11/01/2017.
 */
public class Obserableimpl extends Observable{
    private int data;


    public void setData(int data) {
        this.data = data;
        this.setChanged();
        this.notifyObservers();
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Obserableimpl obserableimpl = new Obserableimpl();
        obserableimpl.addObserver(new Observerimpl());
        obserableimpl.setData(0);
        obserableimpl.setData(120);
        obserableimpl.setData(1234);
    }
}
