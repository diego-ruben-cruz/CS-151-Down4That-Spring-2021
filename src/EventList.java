
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class EventList {
    private ArrayList<Event> eventsList;

    /**
     * Constructor that initilizes the eventsList arraylist.
     */
    public EventList() {
        eventsList = new ArrayList<Event>();
    }

    /**
     * Sorts eventsList by date/time, then by name, then by other sorting criteria.
     * This will likely implement some comparator for objects.
     */
    public void sort() {
        Collections.sort(eventsList);
    }

    /**
     * Deletes an event with a specific name from eventsList.
     * 
     * @param eventName The name of the event that is to be deleted.
     */
    public void deleteEvent(String eventName) {
        // this will get done soon, just a matter of whether we want to be able to
        // delete the first match,
        // or if we want to delete multiple events that share the same name
    }

    /**
     * Adds an event object to eventsList.
     * 
     * @param eventToAdd The event to be added to eventsList.
     */
    public void addEvent(Event eventToAdd) {
        eventsList.add(eventToAdd);
        this.sort();
    }

    public void displayEvents() {
        this.sort();
        for (Event e : eventsList) {
            System.out.println("Event Name: " + e.getName());
            System.out.println("Event Location: " + e.getLocation());
            System.out.println("Event Date and Time: " + e.getEventDateTime());
            System.out.println();
        }
    }

    /**
     * quick test method to test EventList methods on terminal, this will be ported
     * to JUnit ASAP.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Event eventOne = new Event("User_1", "Event Juan", "Juan's House",
                LocalDateTime.parse("08-05-2021 14:00", Event.eventFormatter));
        Event eventTwo = new Event("User_2", "Party", "Apple Gate",
                LocalDateTime.parse("01-04-2021 15:00", Event.eventFormatter));
        Event eventThree = new Event("User_3", "Goat Park", "Jammy's house",
                LocalDateTime.parse("01-04-2021 16:00", Event.eventFormatter));
        Event eventFour = new Event("User_4", "Event Juan", "Juan's House",
                LocalDateTime.parse("01-05-2021 14:00", Event.eventFormatter));
        Event eventFive = new Event("User_5", "Church", "Bakersfield",
                LocalDateTime.parse("07-05-2021 14:00", Event.eventFormatter));

        EventList main = new EventList();
        main.addEvent(eventOne);
        main.addEvent(eventTwo);
        main.addEvent(eventThree);
        main.addEvent(eventFour);
        main.addEvent(eventFive);

        main.displayEvents();

        System.out.println("Dunzo");
    }
}