import java.util.Scanner;

public class Factorize {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scnr.nextInt();

        //Print the number of 2s that divide num
        while (num % 2 == 0){
            System.out.println(2 + " ");
            num = num / 2;
        
        }
    
    //num must be ood at this point so skip of 2 can be used.
    for (int i = 3; i<=Math.sqrt(num); i+=2){
        //while i divides num, print i and divide num
        while (num % i == 0){
            System.out.println(i + " ");
            num /= i;
        }
    }

    // This condition is to handle the case when n is a prime number > 2

    if (num > 2){
        System.out.println(num);
    }
    
    }
}
