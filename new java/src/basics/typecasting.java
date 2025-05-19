package basics;
public class typecasting {
    
    public static void main(String[] args) {

        //wideing
        byte b = 10;
        int i = b;
        System.out.println(i);

        System.out.println("----------------------------");

        //narrowing
        int j = 10;
        byte p = (byte) j;
        System.out.println(p);
        
    }
}

/* typecasting */
//primmitive typecasting => (wideing, narrowing)
//wideing is explicit as well as impliciet
// narrowing is only explicit (oversize data converstion can cause data-loss)

//non-primmitive typecasting(object)
//upcasting is explicit as well as impliciet
//downcasting is only explicit
