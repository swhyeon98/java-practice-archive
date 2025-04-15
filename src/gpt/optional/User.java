package gpt.optional;

public class User {

    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
