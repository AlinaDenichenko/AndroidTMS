import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UserService {
    public static Set<User> getUsersWithManyTasks(Set<User> users) {
        Set<User> usersWithManyTasks = new TreeSet<>(new UserWorkExperienceComparator());
        for (User user : users) {
            if (user.getTasks().size() > 2) {
                usersWithManyTasks.add(user);
            }
        }
        return usersWithManyTasks;
    }

    public static List<String> getUsersWithUniqueNames(Set<User> users) {
        List<String> names = new ArrayList<>();
        List<String> uniqueNames = new ArrayList<>();
        for (User user : users) {
            names.add(user.getName());
        }
        int count = 0;
        String userName;
        for (int i = 0; i < names.size(); i++) {
            userName = names.get(i);
            for (String name : names) {
                if (name.equals(userName)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueNames.add(userName);
            }
            count = 0;
        }
        return uniqueNames;
    }
}
