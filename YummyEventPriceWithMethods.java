/*
Unit 2: Case 1 Problem
Program : YummyEventPrice
Group : Subah Ahmed, Edgar Ortiz Jr, Lenny Mariga
Class: COSC 1437
Description: This program calculates the total price for a Yummy Catering event
             It asks the user for the number of guests, ensures it is positive, calculates the total cost, and shows if the event is large (50 or more guests).
Expected Output: ***********************************************
                 * Yummy makes the food that makes it a party. *
                 ***********************************************
                 Enter the number of guests attending the event: 
                 (Number entered by the user)
                 Number of guests: (number)
                 Price per guest: $35.0
                 Total price: $(number * 35.0)
                 Is this a large event (50 or more guests)? true/false
*/

import java.util.Scanner;

public class YummyEventPriceWithMethods 
{
    public static void main(String[] args)
    {
    int numGuests = input.nextInt();    // getting no. of guests from the user
    MottowBorder();                    // displaying company's motto with a border around it.
    PriceNDisplay();                  // calculating the price of the per guests in total and showing if it is larger than the limit
    }

    // Method 1: making the user input their number of guests and return it
    public static int numGuests()
    {
        Scanner input = new Scanner(System.in);
        // Making the user to type in the number of guests
        System.out.print("Enter the number of guests attending the event: ");   //printing the number of guests the user typed in
        int guests = input.nextInt();

        // Keep asking if the number is negative
        while (guests < 0) 
        {
            System.out.println("Error: Number of guests cannot be negative.");System.out.print("Please enter a positive number: ");
            guests = input.nextInt();
        }
    }

    // Method 2: display the company motto with a border around it
    public static void MottowBorder()
    {
        Scanner input = new Scanner(System.in);
        // the company motto with a border
        System.out.println("***********************************************");
        System.out.println("* Yummy makes the food that makes it a party. *");
        System.out.println("***********************************************");
    }
    // Method 3: caculating the price of cost per cost guests 
    public static void PriceNDisplay(int guests)
    {
        // A named constant for the price per guest
        final double PPerGuest = 35.0;

        // The total price calculation
        double totalP = numGuests * PPerGuest;

        // Event details
        System.out.println();
        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + PPerGuest);
        System.out.println("Total price: $" + totalP);

        // Check whether the event is larger with 50 and more guests.
        boolean LargeParty = numGuests >= 50;
        System.out.println("Is this a large event (50 or more guests)? " + LargeParty);

        input.close();
    }
}
