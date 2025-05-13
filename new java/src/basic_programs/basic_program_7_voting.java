package basic_programs;

import java.util.Scanner;

public class basic_program_7_voting {

    public static void main(String []arges) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check weather the person is eligible to vote or not.");
        System.out.print("Enter the persons age: ");
        int age = sc.nextInt();

        System.out.println(age >= 18 ? "person is eligible to vote" : "person not eligible to vote");
    }
}