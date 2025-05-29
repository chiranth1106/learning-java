package patterns;

import java.util.Scanner;

public class pattern_5 {

    public static void main(String[] args) {
        //hollow box
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter value of n: ");
      int n = sc.nextInt();

      for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if (i == 1||j == 1||i == n||j == n) {
                System.out.print("*  ");
            } else {
                System.out.print("   ");
            }
        }System.out.println();
      }
      sc.close();
    }
    
}
