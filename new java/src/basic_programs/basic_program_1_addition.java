package basic_programs;

import java.util.Scanner;

public class basic_program_1_addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the ADDITION program.!");

        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();

        int r = basic_program_1_addition.add(n1, n2);
        System.out.println("Addition of two numbers is: " +r);

        System.out.println("Thank you.!, for using the ADDITION program");

        sc.close();
    }
    public static int add(int a, int b){
        int res = a + b;
        return res;
    }
    
}
