import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        float b = a; // Implicit type casting (widening)
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);      
    }   
}

class type_casting2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        int b =  (int)a; // Explicit type casting (narrowing)
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);      
    }   
}