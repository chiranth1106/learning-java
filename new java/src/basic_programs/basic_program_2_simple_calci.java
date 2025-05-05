package basic_programs;

import java.util.Scanner;

public class basic_program_2_simple_calci {

    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To the calculator program!");

        do{
            System.out.print("Enter Num1: ");
            int num1 = sc.nextInt();
            System.out.println();
            System.out.println("The following operations can be performed is \n: +, - , *, /, %, ^, &, !");
            System.out.println(": Where '&' stand for square of a number \n: for square and factorial assign num2 has '0'");
            System.out.print("Enter the operation: ");
            char oper = sc.next().charAt(0); 
            System.out.println();
            System.out.print("Enter num2: ");
            int num2 = sc.nextInt();

            basic_program_2_simple_calci.opeartions(num1, num2, oper);

            System.out.println();
            System.out.println("Do you want to continue.? press(y)/press(n)");
            int ch = sc.next().charAt(0);
            System.out.println();
            if (ch == 'y' || ch == 'Y') {
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

    public static void opeartions(int a, int b, char oper) {
        int r = 1;
        switch (oper) {
            case '+':
                r = add(a, b);
                System.out.print("Addition of two numbers is: " +r);
                break;

            case '-':
                r = sub(a, b);
                System.out.print("Substraction of two numbers is: " +r);
                break;

            case '*':
                r = mul(a, b);
                System.out.print("Multiplication of two numbers is: " +r);
                break;

            case '/':
                r = div(a, b);
                System.out.print("Division of two numbers is: " +r);
                break;

            case '%':
                r = mod(a, b);
                System.out.print("Remainder of two numbers is: " +r);
                break;

            case '^':
                r = pow(a, b);
                System.out.print("Power of a number is: " +r);
                break;

            case '&':
                r = sqr(a);
                System.out.print("Square of a number is: " +r);
                break;

            case '!':
                r = fac(a);
                System.out.print("Factorial of a numbers is: " +r);
                break;
        
            default:
                System.out.println("Invalid operations, Exiting the program");
                break;
        }
    }

    public static int add(int a, int b) {
        res = a + b;
        return res;
    }

    public static int sub(int a, int b) {
        res = a - b;
        return res;
    }

    public static int mul(int a, int b){
        res = a * b;
        return res;
    }

    public static int div(int a, int b) {
        res = a / b;
        return res;
    }

    public static int mod(int a, int b) {
        res = a % b;
        return res;
    }

    public static int pow(int a, int b) {
        basic_program_2_simple_calci.res = 1;
        while(b != 0) {
            res *= a;
            b--;
        }
        return res;
    }

    public static int sqr(int a) {
        res = a * a;
        return res;
    }

    public static int fac(int a){
        basic_program_2_simple_calci.res = 1;
        for(int i = a; i >= 1; i--) {
            res *= i;
        }
        return res;
    }
    
}