import java.util.Objects;

public class Person {

    //Atributos
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    //ToString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    //Hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
