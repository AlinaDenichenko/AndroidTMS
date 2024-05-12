public class Main {
    public static void main(String[] args) {
        User ivan = new User("Ivan", Profession.HR, 12);
        System.out.println(ivan);
        System.out.println("Final salary: " + String.format("%.0f", ivan.getSalaryWithBonus(15600)));
        User john = new User("John", Profession.WORKER, 5);
        System.out.println(john);
        System.out.println("Final salary: " + String.format("%.0f", john.getSalaryWithBonus(5300)));
        User luis = new User("Luis", Profession.DIRECTOR, 16);
        System.out.println(luis);
        System.out.println("Final salary: " + String.format("%.0f", luis.getSalaryWithBonus(31000)));
        System.out.println();

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doVoice();
        cat.doVoice();
    }
}