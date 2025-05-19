package happy_Number;

import java.util.Scanner;

public class happy_number_variations {

    //happy number
    //SUM OF SQUARE OF THE NUMBER SHOULD BE EQUAL TO ONE

    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR HAPPY NUMBER NUMBER MAKE SURE 'n' VALUE is '0' \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int pos = 0;

        if(n > 1) {
            happyNum(n);
        }

        if (n == 0) {
            System.out.println("\nWelcome to the variations");
            System.out.print("enter the lower range l: ");
            int l = sc.nextInt();
            System.out.print("enter the upper range u: ");
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
    }

    public static void happyNum(int n) {
        int temp = n;

        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r * r;
                n /= 10;
            }
        n = sum;
        }

        System.out.println(n == 1?temp+ " : is happy number":temp+ " : is not happy number");
    }

    public static void aceOrder(int l, int u, int n) {
        System.out.println("\nhappy numbers in acending order");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }

            if (n == 1) {
                System.out.println(temp+ " : is a happy number");
            }
        }
    }

    public static void decOrder(int l, int u, int n) {
        System.out.println("\nhappy numbers in decending order");
        for(int i = u; i >= l; i--){

            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                System.out.println(temp+ " : is a happy number");
            }
        }
    }

    public static void strBiggest(int l, int u, int n) {
        System.out.println("\nbiggest happy numbers");
        for(int i = u; i >= l; i--){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                System.out.println(temp+ " : is a happy number");
                return;
            }
        }
    }

    public static void strSmallest(int l, int u, int n) {
        System.out.println("\n Smallest happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                System.out.println(temp+ " : is a happy number");
                return;
            }
        }
    }

    public static void allEvenStr(int l, int u, int n) {
        System.out.println("\nall even happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1 && temp % 2 == 0) {
                System.out.println(temp+ " : is a happy number");
            }
        }
    }

    public static void allOddStr(int l, int u, int n) {
        System.out.println("\nall odd happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1 && temp % 2 != 0) {
                System.out.println(temp+ " : is a happy number");
            }
        }
    }

    public static void allEvenPosStr(int l, int u, int n, int p) {
        System.out.println("\nall even position happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                p++;
                if (p % 2 == 0) {
                   System.out.println(temp+ " : is a happy number"); 
                }
                
            }
        }
    }

    public static void allOddPosStr(int l, int u, int n, int p) {
        System.out.println("\nall odd position happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                p++;
                if (p % 2 != 0) {
                   System.out.println(temp+ " : is a happy number"); 
                }
                
            }
        }
    }

    public static void allThirdPosStr(int l, int u, int n, int p) {
        System.out.println("\nall odd position happy numbers");
        for(int i = l; i <= u; i++){
            n = i;
            int temp = n;

            while (n != 1 && n != 4) {
                int sum = 0;
                while (n > 0) {
                    int r = n % 10;
                    sum += r * r;
                    n /= 10;
                }
            n = sum;
            }
            if (n == 1) {
                p++;
                if (p % 3 == 0) {
                   System.out.println(temp+ " : is a happy number"); 
                }
                
            }
        }
    }
}
