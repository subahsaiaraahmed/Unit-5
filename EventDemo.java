/*
Program: EventDemo
Group : Subah Ahmed, Edgar Ortiz Jr, Lenny Mariga
Class: COSC 1437
Description:
Description: This program demonstrates the Event class. 
             It creates three events, displays details, and compares them to find larger events.
*/

import java.util.Scanner;

public class EventDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Create three Event objects with user input
        Event event1 = createEventFromUser(input, 1);
        Event event2 = createEventFromUser(input, 2);
        Event event3 = createEventFromUser(input, 3);

        System.out.println();

        // Display details of all three events
        displayDetails(event1);
        System.out.println();
        displayDetails(event2);
        System.out.println();
        displayDetails(event3);
        System.out.println();

        // Compare events and display the larger ones
        displayLargerEvent(event1, event2);
        displayLargerEvent(event1, event3);
        displayLargerEvent(event2, event3);

        input.close();
    }

    // Method to create an Event object from user input
    public static Event createEventFromUser(Scanner input, int eventNumber)
    {
        System.out.print("Enter event number for Event " + eventNumber + ": ");
        String num = input.nextLine();

        System.out.print("Enter number of guests for Event " + eventNumber + ": ");
        int guests = input.nextInt();
        input.nextLine(); // Consume newline

        return new Event(num, guests);
    }

    // Displays event details neatly
    public static void displayDetails(Event e)
    {
        System.out.println("***********************************************");
        System.out.println("* Yummy makes the food that makes it a party. *");
        System.out.println("***********************************************");
        System.out.println("Event Number: " + e.getEventNumber());
        System.out.println("Number of Guests: " + e.getNumGuests());
        System.out.printf("Total Price: $%.2f%n", e.getPrice());
        System.out.println("Is this a large event? " + e.isLargeEvent());
    }

    // Compares two events and displays the larger one
    public static void displayLargerEvent(Event e1, Event e2)
    {
        Event larger = (e1.getNumGuests() >= e2.getNumGuests()) ? e1 : e2;

        System.out.println("Comparing Events " + e1.getEventNumber() + " and " + e2.getEventNumber());
        System.out.println("Event " + e1.getEventNumber() + " guests: " + e1.getNumGuests());
        System.out.println("Event " + e2.getEventNumber() + " guests: " + e2.getNumGuests());
        System.out.println("Larger Event: " + larger.getEventNumber() + " with " + larger.getNumGuests() + " guests");
        System.out.println();
    }
}