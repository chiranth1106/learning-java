package basics;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int printing = add(a, b);
        System.out.print("the following output for the given method is: " +printing);

        sc.close();
        
    }

    public static int add(int a, int b){
        int res = a + b;
        return res;
    }
}
