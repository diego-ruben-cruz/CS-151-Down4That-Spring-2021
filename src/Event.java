package src;

import java.time.ZonedDateTime;

public class Event implements Comparable<Event>{
    private String eventName;
    private String eventLocation;
    private int eventDate;
    private int eventTime;
    private boolean preference;

    //This class will include a possible implementation of ZonedDateTime in case there
    //is enough dev time and resources to replace using ZonedDateTime objects rather than ints
    //private ZonedDateTime loggedTime;

    public Event(){
        //loggedTime = java.time.ZonedDateTime.now();
        eventName = "null";
        eventLocation = "null";
        eventDate = 0;
        eventTime = 0;
        preference = false;
    }

    //public Event(String inputString, String inputLocation, ZonedDateTime inputDateTime){
    //  eventName = inputString;    
    //  location = inputLocation;  
    //  loggedTime = inputDateTime;    
    //}
    
    public Event(String inputString, String inputLocation, int inputDate, int inputTime, boolean inputPref){
        eventName = inputString;
        eventLocation = inputLocation;
        eventDate = inputDate;
        eventTime = inputTime;
        preference = inputPref;
    }

    public String getName(){
        return this.eventName;
    }

    public void setName(String newName){
        this.eventName = newName;
    }

    public String getLocation(){
        return this.eventLocation;
    }

    public void setLocation(String newLocation){
        this.eventLocation = newLocation;
    }

    public int getDate(){
        return this.eventDate;
    }

    public void setDate(int newDate){
        this.eventDate = newDate;
    }

    public int getTime(){
        return this.eventTime;
    }

    public void setTime(int newTime){
        this.eventTime = newTime;
    }

    public boolean getPreference(){
        return this.preference;
    }

    public void setPreference(boolean newPref){
        this.preference = newPref;
    }

    //Sorts by date first, then time, then name, then location.
    //Preference is not included in the comparison criteria because it comes down to a boolean.
    @Override
    public int compareTo(Event other){
        if(this.getDate() == other.getDate()){
            if(this.getTime() == other.getTime()){
                if(this.getName().compareTo(other.getName()) == 0){
                    return this.getLocation().compareTo(other.getLocation());
                }
                else{
                    return this.getName().compareTo(other.getName());
                }
            }
            else{
                return this.getTime() - other.getTime();
                }
        }
        else{
            return this.getDate() - other.getDate();
        }
    }

    @Override
    public boolean equals(Object other){
        Event objectToCheck = (Event) other;
        return this.compareTo(objectToCheck) == 0 && this.getPreference() == objectToCheck.getPreference();
    }
}