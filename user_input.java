import java.lang.System;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       System.out.println("The value of a is: " + a);
    }
    
}
class user_input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

class user_input3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       float c = scanner.nextFloat();
       System.out.println("The value of c is: " + c);
    }
}

class user_input4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:" );
       int a = scanner.nextInt();
       int b = scanner.nextInt();
         System.out.println("The sum of a and b is: " + (a + b));
    }
}

class user_input5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double d = scanner.nextDouble();
       System.out.println("The value of d is: " + d);
    }
}