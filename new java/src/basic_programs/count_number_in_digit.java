package basic_programs;

import java.util.Scanner;

public class count_number_in_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);

        sc.close();
    }
    
}
