package src;

import java.util.ArrayList;

public class EventList {
    private ArrayList<Event> eventsList;

    public void sort() {
        // Likely will sort by date/time, then by name, then by other sorting criteria
        // Likely going to implement the comparisons made between objects of event class
    }

    public void deleteEvent(String eventName) {
        // this will get done soon, just a matter of whether we want to be able to
        // delete the first match,
        // or if we want to delete multiple events that share the same name
    }

    public void addEvent(Event eventToAdd) {
        eventsList.add(eventToAdd);
    }

}
