package niven_harshad_number;

import java.util.Scanner;

public class niven_harshad_number_variation {

    //ADDITION OF SUM OF NUMBER SHOULD BE GIVE REMINDER ZERO WHEN DIVIDED WITH ORIGINAL NUMBER

    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR NIVEN/HARSHAD NUMBER MAKE SURE 'n' VALUE is '0' \n");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
    
            int pos = 0;
    
            if (n >= 1) {
                nivHar(n);
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
                
                    default: System.out.println("Invalid opertion, exiting program");
                        break;
                }
            }

            System.out.print("Do you want to continue.?, press(y) or press(n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'y' ||choice == 'Y') {
                System.out.println();
                continue;

            } else if(choice == 'n' || choice == 'N') {
                System.out.println("\nThank You, for using the Niven/Harshad number program");
                return;

            } else {
                System.out.println("Invalid input, Exiting the program");
                return;
            }

        } while (true);
    }

    public static void nivHar(int n) {
        System.out.println("\nto check weither number is niven/harshad or not");
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }

        n = temp;
        int res = n % sum;

        System.out.println(res == 0? temp+ " : is niven/harshad number" :temp+ " : is not niven/harshad number");
    }

    public static void aceOrder(int n, int l, int u) {
        System.out.println("\nniven/harshad number in acending order");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                System.out.println("niven/harshad number: " +temp);
            }
        }
    }

    public static void decOrder(int n, int l, int u) {
        System.out.println("\nautomorphic number in decending order");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                System.out.println("niven/harshad number: " +temp);
            }
        }
    }

    public static void biggestAuto(int n, int l, int u) {
        System.out.println("\nbiggest niven/harshad number");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                System.out.println("niven/harshad number: " +temp);
                return;
            }
        }
    }

    public static void smallestAuto(int n, int l, int u) {
        System.out.println("\nsmallest niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                System.out.println("niven/harshad number: " +temp);
                return;
            }
        }
    }

    public static void allEvenAuto(int n, int l, int u) {
        System.out.println("\nall even niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0 && temp % 2 == 0) {
                System.out.println("niven/harshad number: " +temp);
            }
        }
    }

    public static void allOddAuto(int n, int l, int u) {
        System.out.println("\nall odd niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0 && temp % 2 != 0) {
                System.out.println("niven/harshad number: " +temp);
            }
        }
    }

    public static void allEvenPos(int n, int l, int u, int p) {
        System.out.println("\nall even position niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                p++;
                if (p % 2 == 0) {
                    System.out.println("niven/harshad number: " +temp); 
                }
            }
        }
    }

    public static void allOddPos(int n, int l, int u, int p) {
        System.out.println("\nall odd position niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                p++;
                if (p % 2 != 0) {
                    System.out.println("niven/harshad number: " +temp); 
                }
            }
        }
    }

    public static void allThirdPos(int n, int l, int u, int p) {
        System.out.println("\nall third position niven/harshad number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                n /= 10;
            }

            n = temp;
            int res = n % sum; 

            if (res == 0) {
                p++;
                if (p % 3 == 0) {
                    System.out.println("niven/harshad number: " +temp); 
                }
            }
        }
    }
}