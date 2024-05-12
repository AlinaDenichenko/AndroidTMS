import lombok.Getter;

@Getter
public abstract class Employee {
    private String name;
    private String surname;
    private int workExperience;
    private Profession profession;

    public Employee(String name, String surname, int workExperience, Profession profession) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Work Experience: " + workExperience + ", Profession: " + profession;
    }
}
