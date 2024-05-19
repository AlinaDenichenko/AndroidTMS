import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Lessons> lessonsJohn = new ArrayList<>();
        List<Lessons> lessonsBob = new ArrayList<>();
        List<Lessons> lessonsJane = new ArrayList<>();
        lessonsJohn.add(Lessons.LITERATURE);
        lessonsJane.add(Lessons.PROGRAMMING);
        lessonsJane.add(Lessons.ENGLISH);
        lessonsBob.add(Lessons.MATH);
        lessonsBob.add(Lessons.HISTORY);
        students.add(new Student("John", Gender.MALE, 19, lessonsJohn));
        students.add(new Student("Jane", Gender.FEMALE, 21, lessonsJane));
        students.add(new Student("Bob", Gender.MALE, 22, lessonsBob));

        System.out.println("Only men: " + StudentFilter.getAllMale(students));
        System.out.println("Students older 20: " + StudentFilter.getStudentsOver20(students));
        System.out.println("Students with lessons less than 2: " + StudentFilter.getStudentsWithOneLesson(students));
        System.out.println("Students with lesson Programming: " + StudentFilter.getStudentsWithProgramming(students));
    }
}