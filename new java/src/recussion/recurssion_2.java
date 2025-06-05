package recussion;

import java.util.Scanner;

public class recurssion_2 {

    //sum of n natural number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vakue of n: ");
        int n = sc.nextInt();

        printSum(n, 0);
    }

    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n - 1, sum);
    }
    
}
