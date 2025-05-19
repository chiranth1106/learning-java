package basics;
//progamming using all the different loops, scanner class, break, return, continue and using methods//
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator program!");
        System.out.println("The following operations, can be performed is:- +, -, *, /, %, ^, !");
        do{
            System.out.print("Enter num1: ");
            int n1 = sc.nextInt();
            System.out.print("Enter num2: ");
            int n2 = sc.nextInt();
            System.out.print("Enter the opearation: ");
            char oper = sc.next().charAt(0);

            scanner.operations(n1, n2, oper);

            System.out.println("Do you want to continue.? press(y)/press(n): ");
            char ch = sc.next().charAt(0);
            if(ch == 'y' || ch == 'Y'){
                continue;
            }else if(ch == 'n' || ch == 'N'){
                System.out.println("Thank you for using the calculator program!");
                break;
            }else{
                System.out.println("Invalid input. Exiting the program.");
                break;
            }
        }while(true);
        
        sc.close();
        
    }

    public static int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    public static int mul(int a, int b) {
        int res = a * b;
        return res;
    }

    public static int div(int a, int b) {
        int res = a / b;
        return res;
    }

    public static int mod(int a, int b) {
        int res = a % b;
        return res; 
    }

    public static int pow(int a, int b) {
        int res = 1;
        while(b != 0) {
            res *= a;
            b--;
        }
        return res;
    }

    public static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        int res = 1;
        for(int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static int operations(int a, int b, char operation){
        int r = 0;
        switch (operation) {
            case '+':
                r = add(a, b);
                System.out.println("addtion of 2 numbers is: " +r);
                break;
            case '-':
                r = sub(a, b);
                System.out.println("substraction of 2 numbers is: " +r);
                break;
            case '*':
                r = mul(a, b);
                System.out.println("multiplication of 2 numbers is: " +r);
                break;
            case '/':
                r = div(a, b);
                System.out.println("divsion of 2 numbers is: " +r);
                break;
            case '%':
                r = mod(a, b);
                System.out.println("modulus of 2 numbers is: " +r);
                break;
            case '^':
                r = pow(a, b);
                System.out.println("power of 2 numbers is: " +r);
                break;
            case '!':
                r = fact(a);
                System.out.println("factorial of a number is: " +r);
                break;
            default:
                System.out.println("Invalid operation");
        }
        return r;
    }
}