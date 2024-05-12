public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 26, 50000);
        Person newPerson = person.clone();
        newPerson.setName("John");
        System.out.println(person);
        System.out.println(newPerson);
        System.out.println(newPerson.equals(person));
    }
}