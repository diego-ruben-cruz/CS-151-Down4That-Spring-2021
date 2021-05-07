package src;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 * The building block of Down4That, implements both Votes, and Events.
 */
public class Event implements Comparable<Event> {
    private String eventName;
    private String eventLocation;
    // private int eventDate;
    // private int eventTime;

    // Pretty sure that preference is going to get replaced by the eventVotes
    // implemenation
    // private boolean preference;

    private ArrayList<Vote> eventVotes;
    private ZonedDateTime loggedTime;

    /**
     * no-param constructor, sets default values to either null, the current moment,
     * or false, depending on var type.
     */
    public Event() {
        loggedTime = ZonedDateTime.now();
        eventName = "null";
        eventLocation = "null";
        eventVotes = new ArrayList<Vote>();

        // eventDate = 0;
        // eventTime = 0;
        // preference = false;
    }

    /**
     * Creates an event object with ZonedDateTime implementation.
     * 
     * @param inputString   input string for event name.
     * @param inputLocation input string for event location.
     * @param inputDateTime input string for event date and time.
     */
    public Event(String inputString, String inputLocation, ZonedDateTime inputDateTime) {
        eventName = inputString;
        eventLocation = inputLocation;
        loggedTime = inputDateTime;
        eventVotes = new ArrayList<Vote>();
    }

    // /**
    // * Creates an event object with instance vars set to input parameters.
    // *
    // * @param inputString input string for event name.
    // * @param inputLocation input string for event location.
    // * @param inputDate input int for event date.
    // * @param inputTime input int for event time.
    // * @param inputPref input boolean for voting system.
    // */
    // public Event(String inputString, String inputLocation, int inputDate, int
    // inputTime, boolean inputPref) {
    // eventName = inputString;
    // eventLocation = inputLocation;
    // eventDate = inputDate;
    // eventTime = inputTime;
    // preference = inputPref;
    // }

    /**
     * Fetches the event name.
     * 
     * @return A string representing the event name.
     */
    public String getName() {
        return this.eventName;
    }

    /**
     * Sets the event name to a new value.
     * 
     * @param newName The new name for the event.
     */
    public void setName(String newName) {
        this.eventName = newName;
    }

    /**
     * Fetches the location of the event
     * 
     * @return A string representing the event location.
     */
    public String getLocation() {
        return this.eventLocation;
    }

    /**
     * Sets the event location to a new value.
     * 
     * @param newLocation The new location for the event
     */
    public void setLocation(String newLocation) {
        this.eventLocation = newLocation;
    }

    // /**
    // * Fetches the date of the event.
    // *
    // * @return The date of the event represented in an integer.
    // */
    // public int getDate() {
    // return this.eventDate;
    // }

    // /**
    // * Sets the event date to a new value
    // *
    // * @param newDate The new event date.
    // */
    // public void setDate(int newDate) {
    // this.eventDate = newDate;
    // }

    /**
     * Returns the date and time of the event to an easily recognizable String
     * format via ZonedDateTime implemenation.
     * 
     * @return The date and time of the event.
     */
    public String getEventDateTime() {
        return this.loggedTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));
        // The default detail level for displaying the event time is medium, but this
        // does not have to be the case, we can adjust it as desired.

    }

    // /**
    // * Fetches the event time.
    // *
    // * @return The time of the event.
    // */
    // public int getTime() {
    // return this.eventTime;
    // }

    // /**
    // * Sets the event time to a new value.
    // *
    // * @param newTime The new event time.
    // */
    // public void setTime(int newTime) {
    // this.eventTime = newTime;
    // }

    // /**
    // * Fetches the preference associated with the event, will likely be replaced
    // * with further implementation of the Vote class.
    // *
    // * @return
    // */
    // public boolean getPreference() {
    // return this.preference;
    // }

    // /**
    // * Sets a new preference to the event, will likely be replaced with further
    // * implemenation of the Vote class.
    // *
    // * @param newPref
    // */
    // public void setPreference(boolean newPref) {
    // this.preference = newPref;
    // }

    // Sorts by date first, then time, then name, then location.
    // Preference is not included in the comparison criteria because it comes down
    // to a boolean.
    // /**
    // * Compares the current instance to another Event object.
    // *
    // * @param other The Event that the current instance will be compared to.
    // * @return The result of the comparison between the two objects. -1 equates to
    // * "less than", 0 equates to "equals", and 1 equates to "greater than"
    // */
    // @Override
    // public int compareTo(Event other) {
    // if (this.getDate() == other.getDate()) {
    // if (this.getTime() == other.getTime()) {
    // if (this.getName().compareTo(other.getName()) == 0) {
    // return this.getLocation().compareTo(other.getLocation());
    // } else {
    // return this.getName().compareTo(other.getName());
    // }
    // } else {
    // return this.getTime() - other.getTime();
    // }
    // } else {
    // return this.getDate() - other.getDate();
    // }
    // }

    /**
     * Compares an event to another event. Compares by date-time first, then name,
     * then location.
     * 
     * @return The result of the comparison.
     */
    @Override
    public int compareTo(Event other) {
        if (this.loggedTime.compareTo(other.loggedTime) == 0) {
            if (this.getName().compareTo(other.getName()) == 0) {
                return this.getLocation().compareTo(other.getLocation());
            } else {
                return this.getName().compareTo(other.getName());
            }
        } else {
            return this.loggedTime.compareTo(other.loggedTime);
        }
    }

    /**
     * Compares an event to some instance of an object for deep equality.
     * 
     * @param other The object that this one is getting compared to.
     * @return returns a boolean that is the result of checking for deep equals.
     */
    @Override
    public boolean equals(Object other) {
        Event objectToCheck = (Event) other;
        return this.compareTo(objectToCheck) == 0; // && this.getPreference() == objectToCheck.getPreference();
        // Note: Not sure if it is worth comparing the Arraylist of votes, since that
        // does not have too much to do with what really makes an event the same as
        // another in our criteria. That is, what makes an event too similar to another
        // happens at a higher level of abstraction.

        // The most important thing is to check that the compareTo is too similar. That
        // is def the ground we all can agree on.
    }
}