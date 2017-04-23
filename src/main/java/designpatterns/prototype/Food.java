package designpatterns.prototype;

/**
 * Created by zhxia on 23/04/2017.
 */
public abstract class Food implements Cloneable{
    private int id;// identifier !!!
    protected String type;

    abstract void smell();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return clone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
