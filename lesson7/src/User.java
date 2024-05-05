import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private Profession profession;
    private int workExperience;

    public User(String name, Profession profession, int workExperience) {
        this.name = name;
        this.profession = profession;
        this.workExperience = workExperience;
    }

    private float salary() {
        return 1000 * workExperience * profession.getRatio();
    }

    public String salaryWithBonus(int bonus) {
        return "Final salary: " + String.format("%.0f", salary() + bonus);
    }

    public String toString() {
        return "Name: " + name + ", profession: " + profession + ", work experience: " + workExperience + ", salary: " + String.format("%.0f", salary());
    }
}