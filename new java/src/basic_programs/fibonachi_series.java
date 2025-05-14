package basic_programs;

import java.util.Scanner;

public class fibonachi_series {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (n > 0) {
            if (n == 1) {
                System.out.println(a);
                return;
            }
        }

        System.out.print(a+ ", " +b+ ", ");
        for(int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(", " +c);
            a = b;
            b = c;
        }   

        sc.close();
    }
    
}
