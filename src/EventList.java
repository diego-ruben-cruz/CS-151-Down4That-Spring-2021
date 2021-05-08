package src;

import java.util.ArrayList;

public class EventList implements Comparable<Event>{
    private ArrayList<Event> eventsList;

    /**
     * Sorts eventsList by date/time, then by name, then by other sorting criteria.
     * This will likely implement some comparator for objects.
     */
    public void sort() {
        // need to implement some comparator in either Event class or this method, check
        // the lecture material.
        //using compareTo in event class?
        Event event1 = new Event();
        Event event 2  = new Event();
        event1.compareTo(event2);

        //or
        //eventsList.sort(Event);
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
        eventsList.delete(eventName);
    }

    /**
     * Adds an event object to eventsList.
     * 
     * @param eventToAdd The event to be added to eventsList.
     */
    public void addEvent(Event eventToAdd) {
        eventsList.add(eventToAdd);
    }

}