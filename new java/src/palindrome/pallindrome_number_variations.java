package palindrome;

import java.util.Scanner;

public class pallindrome_number_variations {
    //same logic as reverse digit

    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR PALLINDROME NUMBER MAKE SURE 'n' VALUE is '0' \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int pos = 0;

        if (n > 1) {
            pallindrome(n);   
        }

        if (n == 0) {
            System.out.println();
            System.out.println("Welcome to variation program");
            System.out.print("Enter lower range: ");
            int l = sc.nextInt();
            System.out.print("Enter Higer range: ");
            int u = sc.nextInt();
            pallinAscOrder(n, l, u);
            pallinDecOrder(n, l, u);
            pallinBiggest(n, l, u);
            pallinSmallest(n, l, u);
            pallinAllEven(n, l, u);
            pallinAllOdd(n, l, u);
            pallinAllOddPos(n, l, u, pos);
            pallinAllEvenPos(n, l, u, pos);
            pallinAllThirdPos(n, l, u, pos);
        }

        sc.close();
    }

    public static void pallindrome(int n) {
        System.out.println();
        System.out.println("the number is pallindrome or not");
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n /= 10;
        }
        System.out.println(temp == rev?"pallindrome number: " +temp:"not a pallindrome number: " +temp);
    }

    public static void pallinAscOrder(int n,int l, int u) {
        System.out.println();
        System.out.println("pallidrome numbers in ascending order");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                System.out.println("pallindrome numbers are: " +temp);
            }
        }
    }

    public static void pallinDecOrder(int n,int l, int u) {
        System.out.println();
        System.out.println("pallidrome numbers in decending order");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                System.out.println("pallindrome numbers are: " +temp);
            }
        }
    }

    public static void pallinBiggest(int n,int l, int u) {
        System.out.println();
        System.out.println("biggest pallidrome numbers");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                System.out.println("pallindrome numbers are: " +temp);
                return;
            }
        }
    }

    public static void pallinSmallest(int n,int l, int u) {
        System.out.println();
        System.out.println("smallest pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                System.out.println("pallindrome numbers are: " +temp);
                return;
            }
        }
    }

    public static void pallinAllEven(int n,int l, int u) {
        System.out.println();
        System.out.println("all even pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev && temp % 2 == 0) {
                System.out.println("pallindrome numbers are: " +temp);
            }
        }
    }

    public static void pallinAllOdd(int n,int l, int u) {
        System.out.println();
        System.out.println("all odd pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev && temp % 2 != 0) {
                System.out.println("pallindrome numbers are: " +temp);
            }
        }
    }

    public static void pallinAllOddPos(int n,int l, int u, int p) {
        System.out.println();
        System.out.println("all odd position pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                p++;
                if (p % 2 != 0) {
                    System.out.println("pallindrome numbers are: " +temp+ ", postion is : " +p);
                }
            }
        }
    }

    public static void pallinAllEvenPos(int n,int l, int u, int p) {
        System.out.println();
        System.out.println("all even position pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                p++;
                if (p % 2 == 0) {
                    System.out.println("pallindrome numbers are: " +temp+ ", postion is : " +p);
                }
            }
        }
    }

    public static void pallinAllThirdPos(int n,int l, int u, int p) {
        System.out.println();
        System.out.println("all thirs position pallidrome numbers");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (temp == rev) {
                p++;
                if (p % 3 == 0) {
                    System.out.println("pallindrome numbers are: " +temp+ ", postion is : " +p);
                }
            }
        }
    }
}
