/*
Program: RentalDemo
Group: Subah Ahmed, Edgar Ortiz Jr, Lenny Mariga
Class: COSC 1437
Description: This program demonstrates the Rental class. It creates three rentals, displays details, and    
             compares each pair to find the longer rental.
*/

import java.util.Scanner;

public class RentalDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Create three rentals from user input
        Rental rental1 = createRentalFromUser(input, 1);
        Rental rental2 = createRentalFromUser(input, 2);
        Rental rental3 = createRentalFromUser(input, 3);

        System.out.println();

        // Display details of each rental
        displayDetails(rental1);
        System.out.println();
        displayDetails(rental2);
        System.out.println();
        displayDetails(rental3);
        System.out.println();

        // Compare pairs and display longer rental
        displayLongerRental(rental1, rental2);
        displayLongerRental(rental1, rental3);
        displayLongerRental(rental2, rental3);

        input.close();
    }

    // Method to get rental info from the user
    public static Rental createRentalFromUser(Scanner input, int rentalNum)
    {
        System.out.print("Enter contract number for Rental " + rentalNum + ": ");
        String contract = input.nextLine();

        System.out.print("Enter total minutes rented for Rental " + rentalNum + ": ");
        int minutes = input.nextInt();
        input.nextLine();

        return new Rental(contract, minutes);
    }

    // Display details of a Rental object
    public static void displayDetails(Rental r)
    {
        System.out.println("Contract Number: " + r.getContractNumber());
        System.out.println("Hours: " + r.getHours());
        System.out.println("Additional Minutes: " + r.getExtraMinutes());
        System.out.printf("Total Rental Price: $%.2f%n", r.getPrice());
    }

    // Compares two rentals and displays the longer one
    public static void displayLongerRental(Rental r1, Rental r2)
    {
        Rental longer = (r1.getHours() * 60 + r1.getExtraMinutes() >= r2.getHours() * 60 + r2.getExtraMinutes()) ? r1 : r2;

        System.out.println("Comparing Rentals " + r1.getContractNumber() + " and " + r2.getContractNumber());
        System.out.println("Rental " + r1.getContractNumber() + ": " + r1.getHours() + " hrs " + r1.getExtraMinutes() + " mins");
        System.out.println("Rental " + r2.getContractNumber() + ": " + r2.getHours() + " hrs " + r2.getExtraMinutes() + " mins");
        System.out.println("Longer Rental: " + longer.getContractNumber());
        System.out.println();
    }
}