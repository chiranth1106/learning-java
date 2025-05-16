package basic_programs;

public class swapping_number_onlyUsing_2digit {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a+ ", " +b);
    }
    
}
