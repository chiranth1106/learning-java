package strong_number;

import java.util.Scanner;

public class strong_number_variation {

    //SUM OF FACTORIAL OF THE NUMBER SHOULD BE EQUAL TO THE ORIGNAL NUMBER

    static int f = 0, strong = 0;

    public static int factorial(int r, int fac){
        if (r == 0 || r == 1) {
            return fac;
        } else {
            fac *= r;
            return factorial(r - 1, fac);
        }
    }

    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR STRONG NUMBER MAKE SURE 'n' VALUE is '0' \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();

        int pos = 0;

        if (n >= 1) {
            strong(n);
        }

        if (n == 0) {
            System.out.println("\nwelcome, to the variation program");
            System.out.print("enter th lower range: ");
            int l = sc.nextInt();
            System.out.print("enter the upper range: ");
            int u = sc.nextInt();
            System.out.print("\nALL THE CHOICES OF VARIATION \n1. acending order \n2. decending order \n3. biggest number \n4. smallest number \n5. all even numbers \n6. all odd numbers \n7. every even position \n8. every odd position \n9. every third position \n0. execute all variation \n\nenter your choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1: aceOrder(l, u, n);
                    break;
                case 2: decOrder(l, u, n);
                    break;
                case 3: strBiggest(l, u, n);
                    break;
                case 4: strSmallest(l, u, n);
                    break;
                case 5: allEvenStr(l, u, n);
                    break;
                case 6: allOddStr(l, u, n);
                    break;
                case 7: allEvenPosStr(l, u, n, pos);
                    break;
                case 8: allOddPosStr(l, u, n, pos);
                    break;
                case 9: allThirdPosStr(l, u, n, pos);
                    break;

                case 0: 
                        aceOrder(l, u, n);
                        decOrder(l, u, n);
                        strBiggest(l, u, n);
                        strSmallest(l, u, n);
                        allEvenStr(l, u, n);
                        allOddStr(l, u, n);
                        allEvenPosStr(l, u, n, pos);
                        allOddPosStr(l, u, n, pos);
                        allThirdPosStr(l, u, n, pos);
                    break;
                default:System.out.println("Invalid input, Exiting the Program");
                break;
            }
        }

        sc.close();
    }

    public static void strong(int n) {
        System.out.println("\ncheck weather the number is strong number or not");
        int temp = n;

        while (n > 0) {
            int r = n % 10;
            f += factorial(r , 1);
            n /= 10;
            // System.out.println(f);
        }
        strong = f;
        System.out.println(temp == strong?temp+ " : strong number" :temp+ " : not a strong number");
    }
    
    public static void aceOrder(int l, int u, int n) {
        System.out.println("\nstrong numbers in acending order");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                System.out.println("strong number: " +temp);
            }
        }
    }

    public static void decOrder(int l, int u, int n) {
        System.out.println("\nstrong numbers in decending order");
        for(int i = u; i >= l; i--){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                System.out.println("strong number: " +temp);
            }
        }
    }

    public static void strBiggest(int l, int u, int n) {
        System.out.println("\nbiggest strong numbers");
        for(int i = u; i >= l; i--){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                System.out.println("strong number: " +temp);
                return;
            }
        }
    }

    public static void strSmallest(int l, int u, int n) {
        System.out.println("\nSmallest strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                System.out.println("strong number: " +temp);
                return;
            }
        }
    }

    public static void allEvenStr(int l, int u, int n) {
        System.out.println("\nall even strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong && temp % 2 == 0) {
                System.out.println("strong number: " +temp);
            }
        }
    }

    public static void allOddStr(int l, int u, int n) {
        System.out.println("\nall odd strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong && temp % 2 != 0) {
                System.out.println("strong number: " +temp);
            }
        }
    }

    public static void allEvenPosStr(int l, int u, int n, int p) {
        System.out.println("\nall even position strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                p++;
                if (p % 2 == 0) {
                    System.out.println("strong number: " +temp);
                }
            }
        }
    }

    public static void allOddPosStr(int l, int u, int n, int p) {
        System.out.println("\nall odd position strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                p++;
                if (p % 2 != 0) {
                    System.out.println("strong number: " +temp);
                }
            }
        }
    }

    public static void allThirdPosStr(int l, int u, int n, int p) {
        System.out.println("\nall third position strong numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;
            strong_number_variation.f = 0;
            strong_number_variation.strong = 0;

            while (n > 0) {
                int r = n % 10;
                f += factorial(r, 1);
                n /= 10;
            }

            strong = f;
            if (temp == strong) {
                p++;
                if (p % 3 == 0) {
                    System.out.println("strong number: " +temp);
                }
            }
        }
    }
}