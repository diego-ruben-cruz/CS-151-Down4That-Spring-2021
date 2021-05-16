import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestVote {

    @Test
    public void testGetAuthorID() {
        Vote testVote = new Vote("test_user", false);

        assertEquals("test_user", testVote.getAuthorID());
    }

    @Test
    public void testSwitchValue() {
        Vote testVote = new Vote("test_user", false);
        testVote.switchValue();

        assertEquals(true, testVote.getValue());

    }
}