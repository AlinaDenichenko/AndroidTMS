import java.util.Objects;

public class SearchEmployee {
    public static boolean searchEmployee(Director director, Employee searchEmployee) {
        Employee[] employees = director.getEmployees();
        for (Employee employee : employees) {
            if (
                    Objects.equals(employee.getName(), searchEmployee.getName()) &&
                    Objects.equals(employee.getSurname(), searchEmployee.getSurname())
            ) {
                return true;
            } else if (employee instanceof Director) {
                searchEmployee((Director) employee, searchEmployee);
            }
        }
        return false;
    }
}
