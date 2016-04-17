package main.com.twitter;


public class Tweet {

    private final String message;

    public Tweet(String body) {
        this.message = body;
    }

    public String message() {
        return this.message;
    }
}
