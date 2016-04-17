package main.com.twitter;


import java.util.*;

import static java.lang.Integer.parseInt;

public class Interface {

    public static void main(String args[]) {
       optionCommands();
       commands();
    }

    public static void optionCommands() {
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
                exit();
                break;
        }
    }

    private static String scanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static void createUser() {
        List<String> users = new ArrayList<String>();
        System.out.println("Enter your Username: ");
        users.add(scanner());
        System.out.println("Pick another option from the menu:");
        commands();
    }

    private static void createPost() {
        List<String> post = new ArrayList<String>();
        System.out.println("Enter Tweet: ");
        post.add(scanner());
        System.out.println("Pick another option from the menu:");
        commands();
    }

    private static void exit() {
    }

}
