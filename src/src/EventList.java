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

    public int getSize() {
        return eventsList.size();
    }

    /**
     * Deletes an event with a specific name from eventsList.
     *
     * @param eventToDelete The name of the event that is to be deleted.
     */
    public void deleteEvent(Event eventToDelete) {
        // this will get done soon, just a matter of whether we want to be able to
        // delete the first match,
        // or if we want to delete multiple events that share the same name
        eventsList.remove(eventToDelete);
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
}
