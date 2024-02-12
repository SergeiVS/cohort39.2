package object;

import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        //if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
