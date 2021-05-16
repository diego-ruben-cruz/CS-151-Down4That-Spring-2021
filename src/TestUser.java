import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUser {
    @Test
    public void testGetUserID() {
        User testUser = new User("test@gmail.com", "test_user", "testpassword");

        assertEquals("test_user", testUser.getUserID());
    }

    @Test
    public void testGetEmail() {
        User testUser = new User("test@gmail.com", "test_user", "testpassword");

        assertEquals("test@gmail.com", testUser.getEmail());
    }

    @Test
    public void testGetHashedPassword() {
        User testUser = new User("test@gmail.com", "test_user", "testpassword");

        assertEquals("testpassword".hashCode(), testUser.getHashedPassword());
    }

    @Test
    public void testSetEmail() {
        User testUser = new User("test@gmail.com", "test_user", "testpassword");

        testUser.setEmail("test_2_electric_boogaloo@gmail.com");

        assertEquals("test_2_electric_boogaloo@gmail.com", testUser.getEmail());
    }

    @Test
    public void testSetHashedPassword() {
        User testUser = new User("test@gmail.com", "test_user", "testpassword");

        testUser.setHashedPassword("test_password_2_electric_boogaloo");
        assertEquals("test_password_2_electric_boogaloo".hashCode(), testUser.getHashedPassword());
    }
}