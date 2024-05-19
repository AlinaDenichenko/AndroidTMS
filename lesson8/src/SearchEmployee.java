import java.util.Objects;

public class SearchEmployee {
    public static boolean searchEmployee(Director director, Employee searchEmployee) {
        Employee[] employees = director.getEmployees();
        for (Employee employee : employees) {
            if (Objects.equals(employee, searchEmployee)) {
                return true;
            } else if (employee instanceof Director) {
                if (searchEmployee((Director) employee, searchEmployee)) {
                    return true;
                }
            }
        }
        return false;
    }
}
