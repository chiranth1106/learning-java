package perfect_number;

import java.util.Scanner;

// SUM OF FACTOR OF THE NUMBER SHOULD BE EQUAL TO THE ORGINAL NUMBER(i.e N VALUE) 

class Perfect { // grand-parent
    public static int test(int n, int t, int sum) {
        if (n < 1) {
            return sum == t ? t : 0;
        } else {
            int res = t % n;
            if (res == 0) {
                sum += n;
            }
            return test(n - 1, t, sum);
        }
    }
}

public class perfect_number_variations extends Perfect { //parent

    public static Variations v = new Variations();

    public static void main(String[] args) {
        System.out.print("IF UR CHECKING VARIATIONS FOR PERFECT NUMBER NUMBER MAKE SURE 'n' VALUE is '0' \n");
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter the value of n: ");
            int n = sc.nextInt();
            System.out.println();

            int temp = n;
            int pos = 0;

            if (n >= 1) {
                //IS-a realtion so we can access parent properties
                int r = test(n, temp, 0);
                System.out.println(r == temp? temp+ " : is perfect number" : temp+ " : is not perfect number");
            }

            if (n == 0) {
                System.out.println("\nWelcome to the variations");
                System.out.print("enter the lower range: ");
                int l = sc.nextInt();
                System.out.print("enter the upper range: ");
                int u = sc.nextInt();
                System.out.print("\nALL THE CHOICES OF VARIATION \n1. acending order \n2. decending order \n3. biggest number \n4. smallest number \n5. all even numbers \n6. all odd numbers \n7. every even position \n8. every odd position \n9. every third position \n0. execute all variation \n\nenter your choice: ");
                int c = sc.nextInt();
                switch (c) {
                    case 1: v.aceOrder(n, l, u); // using object reference
                        break;
                    case 2: v.decOrder(n, l, u);
                        break;
                    case 3: v.biggestPerf(n, l, u);
                        break;
                    case 4: v.smallestPerf(n, l, u);
                        break;
                    case 5: v.allEvenPerf(n, l, u);
                        break;
                    case 6: v.allOddPerf(n, l, u);
                        break;
                    case 7: v.allEvenPos(n, l, u, pos);
                        break;
                    case 8: v.allOddPos(n, l, u, pos);
                        break;
                    case 9: v.allThirdPos(n, l, u, pos);
                        break;

                    case 0: v.aceOrder(n, l, u);
                            v.decOrder(n, l, u);
                            v.biggestPerf(n, l, u);
                            v.smallestPerf(n, l, u);
                            v.allEvenPerf(n, l, u);
                            v.allOddPerf(n, l, u);
                            v.allEvenPos(n, l, u, pos);
                            v.allOddPos(n, l, u, pos);
                            v.allThirdPos(n, l, u, pos);
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
                System.out.println("\nThank You, for using the perfect number program");
                return;

            } else {
                System.out.println("Invalid input, Exiting the program");
                return;
            }

        }while (true);
    }
}

class Variations extends perfect_number_variations{ //child

    public void aceOrder(int n , int l, int u) {
        System.out.println("\nperfect number in ascending order");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                System.out.println(temp+ " : is perfect number");
            }
        }
    }

    public void decOrder(int n, int l, int u) {
        System.out.println("\nperfect number in decending order");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                System.out.println(temp+ " : is perfect number");
            }
        }
    }

    public  void biggestPerf(int n, int l, int u) {
        System.out.println("\nbiggest perfect number number");
        for(int i = u; i >= l; i--) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                System.out.println(temp+ " : is perfect number");
                return;
            }
        }
    }

    public  void smallestPerf(int n, int l, int u) {
        System.out.println("\nsmallest perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                System.out.println(temp+ " : is perfect number");
                return;
            }
        }
    }

    public  void allEvenPerf(int n, int l, int u) {
        System.out.println("\nall even perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp && temp % 2 == 0) {
                System.out.println(temp+ " : is perfect number");
            }
        }
    }

    public  void allOddPerf(int n, int l, int u) {
        System.out.println("\nall odd perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp && temp % 2 != 0) {
                System.out.println(temp+ " : is perfect number");
            }
        }
    }

    public  void allEvenPos(int n, int l, int u, int p) {
        System.out.println("\nall even position perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                p++;
                if (p % 2 == 0) {
                  System.out.println(temp+ " : is perfect number");  
                }
                
            }
        }
    }

    public  void allOddPos(int n, int l, int u, int p) {
        System.out.println("\nall odd position perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                p++;
                if (p % 2 != 0) {
                  System.out.println(temp+ " : is perfect number");  
                }
                
            }
        }
    }

    public  void allThirdPos(int n, int l, int u, int p) {
        System.out.println("\nall third position perfect number number");
        for(int i = l; i <= u; i++) {
            n = i;
            int temp = n;
            int r = test(n - 1, temp, 0);
            if (r == temp) {
                p++;
                if (p % 3 == 0) {
                  System.out.println(temp+ " : is perfect number");  
                }
                
            }
        }
    }
}