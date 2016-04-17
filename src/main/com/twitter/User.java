package main.com.twitter;


public class User {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String name() {
        return username;
    }

}
