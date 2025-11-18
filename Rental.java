/*
Program: Rental
Group: Subah Ahmed, Edgar Ortiz Jr, Lenny Mariga
Class: COSC 1437
Description: This class stores information about a Sunshine Seashore rental. The price calculation is updated:
             $40 per full hour & $1 per extra minute up to and including 40 minutes past the hour.
*/

public class Rental
{
    // Constants
    public final static int MINUTES_IN_HOUR = 60;
    public final static double HOURLY_RATE = 40.0;

    // Private fields
    private String contractNumber;
    private int hours;
    private int extraMinutes;
    private double price;

    // Constructor with contract number and total minutes
    public Rental(String contractNumber, int totalMinutes)
    {
        setContractNumber(contractNumber);
        setHoursAndMinutes(totalMinutes);
    }

    // Default constructor
    public Rental()
    {
        this("A000", 0);
    }

    // Set contract number
    public void setContractNumber(String contractNumber)
    {
        this.contractNumber = contractNumber;
    }

    // Set hours, extra minutes, and calculate price
    public void setHoursAndMinutes(int totalMinutes)
    {
        if (totalMinutes < 0)
            totalMinutes = 0; // Prevent negative input

        hours = totalMinutes / MINUTES_IN_HOUR;
        extraMinutes = totalMinutes % MINUTES_IN_HOUR;

        // If extra minutes are more than 40, round up to next hour
        if (extraMinutes > 40)
        {
            hours += 1;
            extraMinutes = 0;
        }

        price = (hours * HOURLY_RATE) + extraMinutes; // $1 per extra minute up to 40
    }

    // These are get methods
    public String getContractNumber()
    {
        return contractNumber;
    }

    public int getHours()
    {
        return hours;
    }

    public int getExtraMinutes()
    {
        return extraMinutes;
    }

    public double getPrice()
    {
        return price;
    }
}

