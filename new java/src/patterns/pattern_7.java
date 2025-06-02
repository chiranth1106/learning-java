package patterns;

import java.util.Scanner;

public class pattern_7 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n: ");
    int n = sc.nextInt();

    int star = 1;
    int space = n - 1;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= space; j++) {
            System.out.print("  ");
        }for(int k = 1; k <= star; k++){
            System.out.print("* ");
        }
        System.out.println();
        space -= 1;
        star += 2;
      }
      sc.close();
    }
    
}
