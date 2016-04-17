package test.com.twitter;

import main.com.twitter.Tweet;
import org.junit.Test;
import static org.junit.Assert.*;

public class TweetTest {

    @Test
    public void createMessage() {
        Tweet tweet = new Tweet("My first tweet!!");
        assertEquals("My first tweet!!", tweet.message());
    }


}