package basic_programs;

import java.util.Scanner;

public class basic_program_6_factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        fac(n, 1);

        sc.close();
    }

    public static void fac(int i, int res) {
        if (i == 1 || i == 0) {
            System.out.println("factorial is: " +res);
            return;
        } 
        res *= i;
        fac(i - 1, res);
    }
    
}
