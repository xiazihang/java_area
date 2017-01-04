import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'zhxia' at '1/4/17 11:56 PM' with Gradle 3.1
 *
 * @author zhxia, @date 1/4/17 11:56 PM
 */
public class PersonTest {

    private List<Person> persons;

    @Before
    public void setUp() throws Exception {
        persons = newArrayList();
        persons.add(new Person(12, "yaya", "m"));
        persons.add(new Person(19, "yaya", "f"));
        persons.add(new Person(22, "yaya", "m"));
        persons.add(new Person(32, "yaya", "m"));
        persons.add(new Person(42, "yaya", "f"));
        persons.add(new Person(52, "yaya", "m"));
        persons.add(new Person(62, "yaya", "m"));
    }

    @Test
    public void shouldReturnAdultManPersonList() throws Exception {
        List<Person> adultPersons = Person.filterAdultMan(this.persons);
        assertThat(adultPersons.size(), is(4));
        assertThat(adultPersons.get(0).getAge(), is(22));
        assertThat(adultPersons.get(0).getGender(), is("m"));
    }
}
