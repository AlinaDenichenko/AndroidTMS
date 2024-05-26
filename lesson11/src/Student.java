import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private Gender gender;
    private int age;
    private List<Lessons> lessons;
}
