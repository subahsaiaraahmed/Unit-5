/*
Program: Event
Group : Subah Ahmed, Edgar Ortiz Jr, Lenny Mariga
Class: COSC 1437
Description: This class stores information about a Yummy Catering event. 
             It uses different prices for large and small events and can tell if an event is large.
*/

public class Event
{
    // Constants for prices
    public final static double LOWER_PRICE_PER_GUEST = 32.0;  // Large events
    public final static double HIGHER_PRICE_PER_GUEST = 35.0; // Small events

    // Private fields
    private String eventNumber;
    private int numGuests;
    private double price;

    // Constructor with event number and guest count
    public Event(String eventNumber, int numGuests)
    {
        setEventNumber(eventNumber);
        setGuests(numGuests);
    }

    // Default constructor
    public Event()
    {
        this("A000", 0);
    }

    // Set event number
    public void setEventNumber(String eventNumber)
    {
        this.eventNumber = eventNumber;
    }

    // Set number of guests and calculate total price
    public void setGuests(int numGuests)
    {
        if (numGuests < 0)
            numGuests = 0;  // Prevent negative input

        this.numGuests = numGuests;

        // Large event uses lower price, small event uses higher price
        if (isLargeEvent())
            price = numGuests * LOWER_PRICE_PER_GUEST;
        else
            price = numGuests * HIGHER_PRICE_PER_GUEST;
    }

    // Get methods
    public String getEventNumber()
    {
        return eventNumber;
    }

    public int getNumGuests()
    {
        return numGuests;
    }

    public double getPrice()
    {
        return price;
    }

    // Returns true if the event has 50 or more guests
    public boolean isLargeEvent()
    {
        return numGuests >= 50;
    }
}
