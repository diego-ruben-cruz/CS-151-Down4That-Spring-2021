import java.util.ArrayList;
import java.util.Collections;

/**
 * Responsible for handling a collection of events, with a sorting operation
 * that occurs upon modification of the collection.
 */
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
     */
    public void sort() {
        Collections.sort(eventsList);
    }

    /**
     * Fetches the number of events in the Event List
     * 
     * @return The number of events inside the event list
     */
    public int getSize() {
        return eventsList.size();
    }

    /**
     * Deletes the first occurrence of a given event from the event list.
     *
     * @param eventToDelete The event to be deleted.
     */
    public void deleteEvent(Event eventToDelete) {
        eventsList.remove(eventToDelete);
        this.sort();
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

    /**
     * Displays the event list on the console line, mainly used for testing purposes
     * in the corresponding JUnit class.
     */
    public void displayEvents() {
        this.sort();
        for (Event e : eventsList) {
            System.out.println("Event Name: " + e.getName());
            System.out.println("Event Location: " + e.getLocation());
            System.out.println("Event Date and Time: " + e.getEventDateTime());
            System.out.println();
        }
    }
}