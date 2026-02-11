import java.util.Scanner;


public class array_1D {
    public static void main(String[] args) {
        int[] num ={10, 20, 30, 40, 50};
        System.out.println("The first element of the array is: " + num[0]);
        System.out.println("The second element of the array is: " + num[1]);    
        System.out.println("The third element of the array is: " + num[2]);
        System.out.println("The fourth element of the array is: " + num[3]);
        System.out.println("The fifth element of the array is: " + num[4]);

        }
    }


class array_1D2 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
       for(int i=0; i<num.length; i++) {
            System.out.println("The element at index " + i + " is: " + num[i]);
        }

    }
 }


 class array_enhanced_for_loop {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        for(int element : num) {
            System.out.println("The element is: " + element);
        }
    }
}


class array_max_element {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int max = 0;
        for(int element : num) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}


class accepting_input_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 integers:");
        for(int i=0; i<num.length; i++) {
            num[i] = scn.nextInt();
        }
        System.out.println("The elements you entered are:");
        for(int element : num) {
            System.out.println(element);

        }
    }
}

class array  {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        System.out.println("The first element of the array is: " + num[0]);
    }
}


class array1 {
    public static void main(String[] args) {
        int[][] num = {{10, 20}, {30, 40}};
        System.out.println("The first element of the array is: " + num[0][0]);
    }
}