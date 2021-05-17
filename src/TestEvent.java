import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

public class TestEvent {
        @Test
        public void testGetAuthorID() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                assertEquals("DJ Headass", testEvent.getAuthorID());
        }

        @Test
        public void testGetName() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                assertEquals("DJ Set 004", testEvent.getName());
        }

        @Test
        public void testSetName() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.setName("DJ Set 005");

                assertEquals("DJ Set 005", testEvent.getName());
        }

        @Test
        public void testGetLocation() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                assertEquals("Stream", testEvent.getLocation());
        }

        @Test
        public void testSetLocation() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.setLocation("IRL XDDD");

                assertEquals("IRL XDDD", testEvent.getLocation());
        }

        @Test
        public void testGetEventDateTime() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                LocalDateTime testDateTime = LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter);
                String formattedTestDateTime = testDateTime
                                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));

                assertEquals(formattedTestDateTime, testEvent.getEventDateTime());
        }

        @Test
        public void testSetEventDateTime() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                LocalDateTime newDateTime = LocalDateTime.parse("07-07-2021 15:00", Event.eventFormatter);
                testEvent.setEventDateTime(newDateTime);

                String formattedNewDateTime = newDateTime
                                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));

                assertEquals(formattedNewDateTime, testEvent.getEventDateTime());

        }

        @Test
        public void testAddVote() {
                Vote testVote = new Vote("DJ Monke", true);

                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.addVote(testVote);

                assertEquals(1, testEvent.getTotalVotes());

        }

        @Test
        public void testRemoveVoteByID() {
                Vote testVote = new Vote("DJ Monke", true);
                Vote testVote2 = new Vote("DJ Edgy Reggie", false);
                Vote testVote3 = new Vote("DJ Oogway", true);

                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.addVote(testVote);
                testEvent.addVote(testVote2);
                testEvent.addVote(testVote3);

                testEvent.removeVoteByID("DJ Edgy Reggie");

                assertEquals(2, testEvent.getTotalVotes());
        }

        @Test
        public void testRemoveVoteByIndex() {
                Vote testVote = new Vote("DJ Monke", true);
                Vote testVote2 = new Vote("DJ Edgy Reggie", false);
                Vote testVote3 = new Vote("DJ Oogway", true);

                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.addVote(testVote);
                testEvent.addVote(testVote2);
                testEvent.addVote(testVote3);

                testEvent.removeVoteByIndex(2);

                assertEquals(2, testEvent.getTotalVotes());
        }

        @Test
        public void testGetTotalVotes() {
                Vote testVote = new Vote("DJ Monke", true);
                Vote testVote2 = new Vote("DJ Edgy Reggie", false);
                Vote testVote3 = new Vote("DJ Oogway", true);

                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));

                testEvent.addVote(testVote);
                testEvent.addVote(testVote2);
                testEvent.addVote(testVote3);

                assertEquals(3, testEvent.getTotalVotes());
        }

        @Test
        public void testCompareTo() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                Event testEventClone = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                Event testEvent2 = new Event("DJ Monke", "DJ Headass Afterparty - Electric Boogaloo Edition", "Stream",
                                LocalDateTime.parse("12-06-2021 17:00", Event.eventFormatter));
                Event testEvent3 = new Event("DJ Oogway", "DJ Set 021", "Stream",
                                LocalDateTime.parse("12-06-2021 20:00", Event.eventFormatter));

                assertEquals(-1, testEvent.compareTo(testEvent2));
                assertEquals(0, testEvent.compareTo(testEventClone));
                assertEquals(1, testEvent3.compareTo(testEvent));
        }

        @Test
        public void testEquals() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                Event testEventClone = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                Event testEvent2 = new Event("DJ Monke", "DJ Headass Afterparty - Electric Boogaloo Edition", "Stream",
                                LocalDateTime.parse("12-06-2021 17:00", Event.eventFormatter));

                assertEquals(true, testEvent.equals((Object) testEventClone));
                assertEquals(false, testEvent.equals((Object) testEvent2));
        }

        @Test
        public void testHashCode() {
                Event testEvent = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                int testEventHash = testEvent.hashCode();

                Event testEventClone = new Event("DJ Headass", "DJ Set 004", "Stream",
                                LocalDateTime.parse("12-06-2021 15:00", Event.eventFormatter));
                int testEventCloneHash = testEventClone.hashCode();

                Event testEvent2 = new Event("DJ Monke", "DJ Headass Afterparty - Electric Boogaloo Edition", "Stream",
                                LocalDateTime.parse("12-06-2021 17:00", Event.eventFormatter));
                int testEvent2Hash = testEvent2.hashCode();

                assertEquals(true, testEventHash == testEventCloneHash);
                assertEquals(false, testEventHash == testEvent2Hash);
        }
}