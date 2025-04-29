package armstrong_number;

import java.util.Scanner;

public class armstrong_variations {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int u = sc.nextInt();
        int p = 0;

        // ascendingOrder(l, u);
        // decendingOrder(l, u);
        // biggest(l, u);
        // smallest(l, u);
        // allEven(l, u);
        // allOdd(l, u);
        // allEvenPos(l, u, p);
        // allOddPos(l, u, p);
        // allThridPos(l, u, p);

        sc.close();
    }

    public static void ascendingOrder(int l, int u) {
        System.out.println();
        System.out.println("armstrong numbers is ascending order");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
                System.out.println(temp+ " : armstrong number");
            }
        }
    }

    public static void decendingOrder(int l, int u) {
        System.out.println();
        System.out.println("armstrong numbers is decending order");
        for(int i = u; i >= l; i--) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
                System.out.println(temp+ " : armstrong number");
            }
        }
    }

    public static void biggest(int l, int u) {
        System.out.println();
        System.out.println("biggest armstrong number");
        for(int i = u; i >= l; i--) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
                System.out.println(temp+ " : is biggest armstrong number");
                return;
            }
        }
    }

    public static void smallest(int l, int u) {
        System.out.println();
        System.out.println("smallest armstrong number");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
                System.out.println(temp+ " : is smallest armstrong number");
                return;
            }
        }
    }  
    
    public static void allEven(int l, int u) {
        System.out.println();
        System.out.println("all even armstrong numbers");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum && temp % 2 == 0) {
                System.out.println(temp+ " : even armstrong number");
            }
        }
    }  

    public static void allOdd(int l, int u) {
        System.out.println();
        System.out.println("all odd armstrong numbers");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum && temp % 2 == 1) {
                System.out.println(temp+ " : odd armstrong number");
            }
        }
    } 
    
    public static void allEvenPos(int l, int u, int pos) {
        System.out.println();
        System.out.println("all even position of armstrong numbers");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
               pos++;
               if (pos % 2 == 0) {
                System.out.println(temp+ " : all even position armstrong number and position is: " +pos);
               }
            }
        }
    }  

    public static void allOddPos(int l, int u, int pos) {
        System.out.println();
        System.out.println("all odd position of armstrong numbers");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
               pos++;
               if (pos % 2 == 1) {
                System.out.println(temp+ " : all odd position armstrong number and position is: " +pos);
               }
            }
        }
    }  

    public static void allThridPos(int l, int u, int pos) {
        System.out.println();
        System.out.println("all Thrid position of armstrong numbers");
        for(int i = l; i <= u; i++) {
            int n = i;
            int temp = n;

            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }

            n = temp;
            int sum = 0;
            while(n > 0) {
                int r = n % 10;
                sum += (int) Math.pow(r, count);
                n /= 10;
            }
            
            if (temp == sum) {
               pos++;
               if (pos % 3 == 0) {
                System.out.println(temp+ " : all Third position armstrong number and position is: " +pos);
               }
            }
        }
    } 
    
}
