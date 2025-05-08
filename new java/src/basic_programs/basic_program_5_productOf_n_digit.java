package basic_programs;

import java.util.Scanner;

public class basic_program_5_productOf_n_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find the 'n'th product");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        for(int i = 1; i <= n; i++) {
            prod *= i;
        }
        System.out.println(prod);
        sc.close();
    }
    
}
