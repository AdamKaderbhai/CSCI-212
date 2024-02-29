/* 
 * Name : Adam Kaderbhai
 * Date : 2/22/2024
 * Description : This program takes a date and returns if it is a valid date.
 * Version : 1.0
 */

import java.util.Scanner;

public class ValidatedDate {
    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner scnr = new Scanner(System.in);
        int month, day, year;

        //While loop until a valid date is entered
        while (true) {
            //Prompt the user to enter month
            System.out.println("Enter a month(1-12): ");
            month = scnr.nextInt();

            //Prompt the user to enter day
            System.out.println("Enter a day(1-31): ");
            day = scnr.nextInt();
            
            //Prompt the user to enter year
            System.out.println("Enter a year(1900 - 2023): ");
            year = scnr.nextInt();

            //Check if the date is valid using the isValidDate method
            if (isValidDate(year, month, day)) {
                break; // Exit the loop if the date is valid
            }else {
                System.out.println("Invalid date. Please try again.");
            }
        }
        // Print the valid date
        System.out.println("The valid date is: " + month + "/" + day + "/" + year);

    }
    // Create a method to check if the year is a leap year
    public static boolean isLeapYear(int year){
       // A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Create a method to check if the date is valid
    public static boolean isValidDate(int year, int month, int day){
        // Check if the month, day, and year are valid
        if (month < 1 || month > 12 || year < 1900 || year > 2023) {
            return false;
        }
        // Check if the day is valid for the given month and year
        if (month == 4 || month == 6 || month == 9 || month == 11) {

            return day <= 30;
        }
        // Check if the day is valid for February
        if (month == 2) {
            return isLeapYear(year) ? day <= 29 : day <= 28;
        }
        // Check if the day is valid for the other months
        return day <= 31;
    }
}
