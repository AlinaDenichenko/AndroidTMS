public class Main {
    public static void main(String[] args) {
        Worker workerJohn = new Worker("John", "Cina", 1, Profession.WORKER);
        Worker workerMichael = new Worker("Michael", "Fassbender", 3, Profession.WORKER);
        Worker workerJames = new Worker("James", "MvAvoy", 5, Profession.WORKER);
        Director directorLeon = new Director("Leon", "Stark", 7, Profession.DIRECTOR);

        System.out.println(workerJohn);
        System.out.println(workerMichael);
        System.out.println(workerJames);
        System.out.println(directorLeon);
        System.out.println();

        directorLeon.addEmployee(workerJohn);
        directorLeon.addEmployee(workerMichael);

        System.out.println(directorLeon);
        System.out.print("Employees: ");
        for (Employee employee : directorLeon.getEmployees()) {
            System.out.println(employee.getName() + " " + employee.getSurname());
        }
        System.out.println();

        Director directorStuart = new Director("Stuart", "Little", 13, Profession.DIRECTOR);
        directorStuart.addEmployee(workerJames);
        directorLeon.addEmployee(directorStuart);

        System.out.println(directorLeon);
        System.out.print("Employees: ");
        for (Employee employee : directorLeon.getEmployees()) {
            System.out.println(employee.getName() + " " + employee.getSurname());
        }
        System.out.println();

        System.out.println(SearchEmployee.searchEmployee(directorLeon, workerJohn));
    }
}