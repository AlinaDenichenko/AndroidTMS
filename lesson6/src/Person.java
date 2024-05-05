import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private int salary;
    private Cat cat;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = new Cat("Berry");
    }

    public Person(String name, int age, int salary, Cat cat) {
        this(name , age, salary);
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        return name.length() + age + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;

        return Objects.equals(name, person.name) && age == person.age && salary == person.salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Cat: " + cat;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            clone.age = age;
            clone.salary = salary;
            clone.cat = cat;
            clone.name = name;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
