package automorphic_number;

import java.util.Scanner;

public class automorphic_number_variation {

    // ORIGINAL NUMBER SHOULD BE EQUAL TO THE LAST DIGITS OF SQUARED NUMBER
    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR AUTOMORPHIC NUMBER MAKE SURE 'n' VALUE is '0' \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();

        int pos = 0;

        if (n > 0) {
            automorphic(n);   
        }

        if (n == 0) {
            System.out.println("\nWelcome, to the variation program");
            System.out.print("enter the lower range: ");
            int l = sc.nextInt();
            System.out.print("enter the upper range: ");
            int u = sc.nextInt();
            System.out.print("\nALL THE CHOICES OF VARIATION \n1. acending order \n2. decending order \n3. biggest number \n4. smallest number \n5. all even numbers \n6. all odd numbers \n7. every even position \n8. every odd position \n9. every third position \n0. execute all variation \n\nenter your choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1: aceOrder(n, l, u);
                    break;
                case 2: decOrder(n, l, u);
                    break;
                case 3: biggestAuto(n, l, u);
                    break;
                case 4: smallestAuto(n, l, u);
                    break;
                case 5: allEvenAuto(n, l, u);
                    break;
                case 6: allOddAuto(n, l, u);
                    break;
                case 7: allEvenPos(n, l, u, pos);
                    break;
                case 8: allOddPos(n, l, u, pos);
                    break;
                case 9: allThirdPos(n, l, u, pos);
                    break;

                case 0: aceOrder(n, l, u);
                        decOrder(n, l, u);
                        biggestAuto(n, l, u);
                        smallestAuto(n, l, u);
                        allEvenAuto(n, l, u);
                        allOddAuto(n, l, u);
                        allEvenPos(n, l, u, pos);
                        allOddPos(n, l, u, pos);
                        allThirdPos(n, l, u, pos);
                    break; 
            
                default:
                    break;
            }
        }

        sc.close();
    }

    public static void automorphic(int n) {
        System.out.println("\nto check weither number is automorphic or not");
        int temp = n;
        int a = 1;

        while (n > 0) {
            a *= 10;
            n /= 10;
        }
        n = temp;
        int sq = n * n;
        int res = sq % a;
        System.out.println(res == temp?temp+ " : is automorphic" :temp+ " : is not automorphic");
    }

    public static void aceOrder(int n, int l, int u) {
        System.out.println("\nautomorphic number in acending order");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                System.out.println("automorphic number: " +temp);
            }
        }
    }

    public static void decOrder(int n, int l, int u) {
        System.out.println("\nautomorphic number in decending order");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                System.out.println("automorphic number: " +temp);
            }
        }
    }

    public static void biggestAuto(int n, int l, int u) {
        System.out.println("\nbiggest automorphic number");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                System.out.println("automorphic number: " +temp);
                return;
            }
        }
    }

    public static void smallestAuto(int n, int l, int u) {
        System.out.println("\nsmallest automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                System.out.println("automorphic number: " +temp);
                return;
            }
        }
    }

    public static void allEvenAuto(int n, int l, int u) {
        System.out.println("\nall even automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp && temp % 2 == 0) {
                System.out.println("automorphic number: " +temp);
            }
        }
    }

    public static void allOddAuto(int n, int l, int u) {
        System.out.println("\nall odd automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp && temp % 2 != 0) {
                System.out.println("automorphic number: " +temp);
            }
        }
    }

    public static void allEvenPos(int n, int l, int u, int p) {
        System.out.println("\nall even position automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                p++;
                if (p % 2 == 0) {
                    System.out.println("automorphic number: " +temp); 
                }
            }
        }
    }

    public static void allOddPos(int n, int l, int u, int p) {
        System.out.println("\nall odd position automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                p++;
                if (p % 2 != 0) {
                    System.out.println("automorphic number: " +temp); 
                }
            }
        }
    }

    public static void allThirdPos(int n, int l, int u, int p) {
        System.out.println("\nall third position automorphic number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int a = 1;

            while (n > 0) {
                a *= 10;
                n /= 10;
            }
            n = temp;
            int sq = n * n;
            int res = sq % a;

            if (res == temp) {
                p++;
                if (p % 3 == 0) {
                    System.out.println("automorphic number: " +temp); 
                }
            }
        }
    }
}
