package designpatterns.builder;

/**
 * Created by zhxia on 21/04/2017.
 */
public class DomainBuilder {
    private DomainObject domainObject = new DomainObject();

    public DomainBuilder withAge(int age) {
        this.domainObject.setAge(age);
        return this;
    }

    public DomainBuilder withName(String name) {
        this.domainObject.setName(name);
        return this;
    }

    public DomainBuilder withBirthday(String birthday) {
        this.domainObject.setBirthday(birthday);
        return this;
    }

    public DomainBuilder withHeight(String height) {
        this.domainObject.setHeight(height);
        return this;
    }

    public DomainObject build() {
        return domainObject;
    }
}
