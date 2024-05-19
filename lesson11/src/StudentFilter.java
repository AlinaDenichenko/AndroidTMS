import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
    public static List<Student> getAllMale(List<Student> students) {
        List<Student> allMale = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getGender() == Gender.MALE) {
                    allMale.add(student);
            }
        }
        return allMale;
    }

    public static List<Student> getStudentsOver20(List<Student> students) {
        List<Student> studentsOver20 = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 20) {
                studentsOver20.add(student);
            }
        }
        return studentsOver20;
    }

    public static List<Student> getStudentsWithOneLesson(List<Student> students) {
        List<Student> studentsWithOneLesson = new ArrayList<>();
        for (Student student : students) {
            if (student.getLessons().size() < 2) {
                studentsWithOneLesson.add(student);
            }
        }
        return studentsWithOneLesson;
    }

    public static List<Student> getStudentsWithProgramming(List<Student> students) {
        List<Student> studentsWithProgramming = new ArrayList<>();
        for (Student student : students) {
            if (student.getLessons().contains(Lessons.PROGRAMMING)) {
                studentsWithProgramming.add(student);
            }
        }
        return studentsWithProgramming;
    }
}
