import lombok.Getter;

@Getter
public class Director extends Employee {
    private Employee[] employees = new Employee[0];

    public Director(String name, String surname, int workExperience, Profession profession) {
        super(name, surname, workExperience, profession);
    }

    public void addEmployee(Employee employee) {
        Employee[] newEmployees = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        newEmployees[newEmployees.length - 1] = employee;
        employees = newEmployees;
    }
}
