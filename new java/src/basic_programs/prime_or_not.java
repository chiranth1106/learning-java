package basic_programs;

import java.util.Scanner;

public class prime_or_not {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n > 0) {
            if (n == 1) {
                System.out.println("Neither prime nor composite");
                return;
            }

            for(int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("prime");
        }
        sc.close();
    }
}
