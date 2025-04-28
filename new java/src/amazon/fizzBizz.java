package amazon;

import java.util.Scanner;

public class fizzBizz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        fizzBizz.fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {
        if (n == 0) {
            return;
        }
        
        fizzBuzz(n - 1);
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(n % 3 == 0) {
            System.out.println("Fizz");
        } else if(n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
    
}
