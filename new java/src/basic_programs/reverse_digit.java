package basic_programs;

import java.util.Scanner;

public class reverse_digit {

    // rev = (rev * 10) +r

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n /= 10;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
