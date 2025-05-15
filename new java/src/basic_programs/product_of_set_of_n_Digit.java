package basic_programs;

import java.util.Scanner;

public class product_of_set_of_n_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vakue of n: ");
        int n = sc.nextInt();

        int sum = 1;
        while (n > 0) {
            int r = n % 10;
            sum *= r;
            n /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
