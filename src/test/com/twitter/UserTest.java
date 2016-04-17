package test.com.twitter;

import main.com.twitter.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {


    @Test
    public void createAUser() {
        User user = new User("Tony");
        assertEquals("Tony", user.name());
    }

}