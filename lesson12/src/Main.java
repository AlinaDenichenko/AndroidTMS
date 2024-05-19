import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new UserWorkExperienceComparator());
        List<String> tasksUser1 = List.of("To plant a tree", "Raise a son", "Build a house");
        List<String> tasksUser2 = List.of("Raise a son");
        List<String> tasksUser3 = List.of("Do rest");
        User user1 = new User("John", 12, tasksUser1);
        User user2 = new User("John", 14, tasksUser2);
        User user3 = new User("Mary", 9, tasksUser3);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(UserService.getUsersWithManyTasks(users));
        System.out.println(users);
        System.out.println(UserService.getUsersWithUniqueNames(users));

        System.out.println();
        System.out.println("Second task:");
        List<String> list = List.of("a", "b", "c", "a", "b");
        ArrayList<String> array = new ArrayList<>();
        array.addAll(list);
        System.out.println(UniqueValue.uniqueValue(array));
    }
}