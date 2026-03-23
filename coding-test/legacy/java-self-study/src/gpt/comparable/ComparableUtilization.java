package gpt.comparable;

import java.util.Comparator;
import java.util.List;

public class ComparableUtilization {

    public static void main(String[] args) {
        User user1 = new User("test1", 11);
        User user2 = new User("test2", 12);
        User user3 = new User("test3", 13);
        User user4 = new User("test4", 14);
        User user5 = new User("test5", 15);

        List<User> users = List.of(user1, user5, user3, user2, user4);

        System.out.println(sortByAge(users));
    }

    private static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .toList();
    }
}
