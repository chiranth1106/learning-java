package basic_programs;

import java.util.Scanner;

public class basic_program_4_sumOf_N_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check the sum of 'n' th digit");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}