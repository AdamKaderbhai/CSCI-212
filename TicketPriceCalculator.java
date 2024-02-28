/* 
 * Name : Adam Kaderbhai
 * Date : 2/22/2024
 * Description : This program takes a day, time, age, and group size and returns the price of the ticket.
 * Version : 1.0
 */



import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter day of show (weekday/weekend):");
        String day = scnr.nextLine();

            // Check if the day is valid
        if (!day.equalsIgnoreCase("weekday") && !day.equalsIgnoreCase("weekend")) {
            System.out.println("Invalid day");
            return;
        }

        System.out.println("Enter time of show (2 PM or 7 PM):");
        String time = scnr.nextLine();
            // Check if the time is valid
        if (!time.equals("2 PM") && !time.equals("7 PM")) {
            System.out.println("Invalid time");
            return;
        }

        System.out.println("Enter customer's age:");
        int age = scnr.nextInt();
       
        // Check if the age is valid
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }

        System.out.println("Enter number of tickets to be purchased together:");
        int groupSize = scnr.nextInt();

        // Check if the group size is valid
        if (groupSize < 1) {
            System.out.println("Invalid group size");
            return;
        }
 
        // Calculate the ticket price
        double price;

        // Base price
        if (day.equalsIgnoreCase("weekday")) {
            price = 80;
        } else {
            price = 100;
        }

        // Matinee discount
        // if the time is 2 PM, apply a 10% discount
        if (time.equals("2 PM")) {
            price *= 0.9;  // 10% discount
        }

        // Group discount
        // if the group size is 4 or more, apply a 5% discount
        if (groupSize >= 8) {
            price *= 0.85;  // 15% discount
        }

        // Age discount
        // if the age is 65 or older, apply a 20% discount
        if (age >= 65) {
            price *= 0.8;  // 20% discount
        } else if (age < 5) {
            price = 0;  // Free for kids under 5
        }
        // Print the show details and ticket price
        System.out.println("Show details:");
        System.out.println("Day: " + day);
        System.out.println("Time: " + time);
        System.out.println("Age: " + age);
        System.out.println("Group size: " + groupSize);
        System.out.printf("Ticket price: $%.2f\n", price);
    }
}
