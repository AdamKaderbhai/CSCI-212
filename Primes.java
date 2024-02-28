/* 
 * Name : Adam Kaderbhai
 * Date Of Submission: 2/26/2024
 * Description : This program takes a number and returns the first n prime numbers.
 * Version : 1.0
 */

import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // declare and initialize variables
        
        int n  = scnr.nextInt();
        int count = 0;
        int num = 2;
        // while loop to find the first n prime numbers
        while (count <n) {
            // if the number is prime, print it and increment the count
            if (isPrime(num)) {
                System.out.println(num);
                count++;

            }
        // increment the number
        num++;
    }
    
}
// Create a method to check if a number is prime
 public static boolean isPrime(int num) {
   // A number is prime if it is greater than 1 and has no divisors other than 1 and itself
    if (num <= 1) {
        return false;
    }
    // Check if the number is divisible by any number from 2 to the square root of the number
    for (int i = 2; i <= Math.sqrt(num); i++) {
       // If the number is divisible by any number from 2 to the square root of the number, it is not prime
        if (num% i == 0) {
            return false;
        }
    }
    return true;
  }
}
