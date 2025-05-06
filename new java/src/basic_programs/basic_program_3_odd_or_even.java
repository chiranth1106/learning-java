package basic_programs;

import java.util.Scanner;

public class basic_program_3_odd_or_even {

    // check odd or even

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check weather the given number is odd or even");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }

        sc.close();
    }
    
}
