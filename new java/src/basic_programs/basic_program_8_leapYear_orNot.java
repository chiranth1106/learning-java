package basic_programs;

import java.util.Scanner;

public class basic_program_8_leapYear_orNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check weather the year is leap year or not");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            
        }
    }
    
}
