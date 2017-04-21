package designpatterns.builder;

/**
 * Created by zhxia on 21/04/2017.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        DomainObject tom = new DomainBuilder().withAge(7).withBirthday("2017-09-09").withHeight("123").withName("Tom").build();

        System.out.println(tom.toString());
    }
}
