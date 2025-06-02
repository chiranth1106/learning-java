package patterns;

import java.util.Scanner;

public class pattern_9 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int count = 65;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                // if (j == 1 && i < n * 3/4 +1 || i == 1 && j < n * 3/4 +1 || i == n * 3/4 +1 && j < n * 3/4 +1 || j == n * 3/4 +1 && i < n * 3/4 +1 || i == j && i > n/2 && j > n/2)  {
                //     System.out.print("* ");
                // } else {
                //     System.out.print(" ");
                // }

                // if (count < 10) {
                //     System.out.print("0"+ count++ +"  ");
                // } else {
                //     System.out.print(count++ +"  ");
                // }

                // System.out.print((char) (i + 64) + " ");

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}