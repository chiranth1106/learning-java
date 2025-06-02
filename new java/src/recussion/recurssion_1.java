package recussion;

import java.util.Scanner;

public class recurssion_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n1: ");
        int n1 = sc.nextInt();
        System.out.print("enter the value of n2: ");
        int n2 = sc.nextInt();

        printNum(n1);
        System.out.println();
        printRevNum(n2, n1);
    }

    public static void printNum(int n1) {
        if (n1 == 0) {
            return;
        }

        System.out.println(n1);
        printNum(n1 - 1);
    }

    public static void printRevNum(int n2, int n1) {
        if (n2 > n1) {
            return;
        }
        System.out.println(n2);
        printRevNum(n2 + 1, n1);
    }
    
}
