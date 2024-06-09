import java.util.Comparator;

public class UserWorkExperienceComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u2.getWorkExperience() - u1.getWorkExperience();
    }
}
