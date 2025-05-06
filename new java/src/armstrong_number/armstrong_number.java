package armstrong_number;

import java.util.Scanner;

public class armstrong_number {

    // THE SUM OF NUMBER TO THE POWER OF THE NUMBER OF DIGITS PRESENT IN THE NUMBER 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        armstrong(n);
    }

    public static void armstrong(int n) {   
        int temp = n;
        int count = 0;

        while(n > 0) {
            count++;
            n /= 10;
        }

        n = temp;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum += (int) Math.pow(r, count);
            n /= 10;
        }
       System.out.println(temp == sum?"is armstrong number" : "is not armstrong number");
    }
    
}


//list of armstrong number within range in terms of acending order