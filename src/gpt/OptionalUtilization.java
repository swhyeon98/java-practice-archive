package gpt;

import java.util.Optional;

public class OptionalUtilization {

    public static void main(String[] args) {
        User user = new User("test");
        User user1 = new User(null);

        System.out.println(getUserName(user));
        System.out.println(getUserName(user1));
    }

    private static Optional<String> getUserName(User user) {
        return Optional.ofNullable(user.getName());
    }
}
