import java.util.Scanner;

public class wrapperclass {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =10;
        Integer b=a;

        Integer c=20;
        int d=c;
        System.out.println("the value of a is: " + a);
        System.out.println("the value of b is Wrapper class: " + b);
        System.out.println("the value of c is: " + c);
        System.out.println("the value of d is Wrapper class: " + d);
    }
}

class wrapperclass2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "123";
        int num = Integer.parseInt(str); // Converting String to int
        System.out.println("The string is: " + str);
        System.out.println("The integer value is: " + num);
    }
}