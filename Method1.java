import java.util.Scanner;

class Example {
    void hello() {
        System.out.println("Hello, this is a method in the Example class.");
    }

public class Method1 {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.hello();
    }
}
}

class example2 {
    void add(int a, int b) {
        System.out.println("The sum of a and b is: " + (a + b));
    }
        public static void main(String[] args) {
            example2 obj = new example2();
            obj.add(10, 20);
        }
    }


class example4 {
    int getnumber() {
        return 42;
    }
    public static void main(String[] args) {
        example4 obj = new example4();
        int number = obj.getnumber();
        System.out.println("The number is: " + number);
    }
}

class example5 {
    static void staticMethod() {
        System.out.println("This is a static method."); 
    }
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        staticMethod(); 
        example5 obj = new example5();
        obj.instanceMethod();
        
    }
}

class example6 {
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scn.nextLine();

        example6 obj = new example6();
        obj.greet(name);
    }
}