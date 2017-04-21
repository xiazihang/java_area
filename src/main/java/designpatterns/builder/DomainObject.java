package designpatterns.builder;

/**
 * Created by zhxia on 21/04/2017.
 */
public class DomainObject {
    private int age;
    private String name;
    private String sex;
    private String birthday;
    private String height;
    private String weight;

    public int getAge() {
        return age;
    }

    public String toString(){
        return "name : " + name + "\nage : " + age + "\nbirthday : " + birthday + "\nheight : " + height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
