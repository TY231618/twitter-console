package main.com.twitter;


import java.util.*;

import static java.lang.Integer.parseInt;

public class Interface {

    public static void main(String args[]) {
       optionCommands();
       commands();
    }

    private static List<String> post = new ArrayList<String>();
    private static List<String> users = new ArrayList<String>();
    private static Map<String, String> usersAndTweets = new HashMap<String, String>();


    private static void optionCommands() {
        System.out.println("User Options");
        System.out.println("1. Create User");
        System.out.println("2. Post Tweet");
        System.out.println("3. View Wall");
        System.out.println("4. Follow User");
        System.out.println("5. Exit");
    }

    private static void commands() {
        switch (parseInt(scanner())) {
            case 1:
                createUser();
                break;
            case 2:
                createPost();
                break;
            case 3:
                viewWall();
                break;
            case 4:
                exit();
                break;
        }
    }

    private static String scanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void createUser() {
        System.out.println("Enter your Username: ");
        users.add(scanner());
        System.out.println("Pick another option from the menu:");
        commands();
    }

    private static void createPost() {
        System.out.println("Enter Tweet: ");
        post.add(scanner());
        System.out.println("Pick another option from the menu:");
        commands();
    }

    private static void viewWall() {
        userWall();
        System.out.println(usersAndTweets);


    }

    private static void userWall() {
        usersAndTweets.put(users.toString(), post.toString());
    }

    private static void exit() {
        System.out.println("Gooodbye");
    }

}

