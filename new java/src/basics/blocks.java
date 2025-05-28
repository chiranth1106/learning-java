package basics;
public class blocks {
    
    public static void main(String[] args) {

        // System.out.println("main method");
        System.out.println(blocks.i);
        blocks b = new blocks(); // object created or the non-static block
        System.out.println(b.j);
        System.out.println(blocks.i);
        // System.out.println(b.i);
        
    }

    static int i = 100;
    static{
        // System.out.println("static blocks");
        i = 1000;
    }

    int j = 200;
    {
        j = 2000;
        i = 10000;
        // System.out.println("non-static block");
    }
}


//jvm will first loading the class(class loading) so the static block execute the static block then main method and then non-static block(when the object is created then the non-static block executes)

//object without any reference is called anonnmyus object or empty object

//non-static blocks will have "n" number of memory allocation cause we can create "n" number of objects