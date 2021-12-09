package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testUserBuilder() {
        User user = User.builder()
                .firstName("Michael")
                .occupation("builder")
                .age(30)
                .build();
        String expected = "User(firstName=Michael, lastName=null, occupations=[builder], gender=null, age=30)";
        assertEquals(expected, user.toString());
    }
}