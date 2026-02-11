import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Two number:");
        int num = scn.nextInt();
        int num2 = scn.nextInt();

        if(num > num2) {
            System.out.println(num +" is greater than "+num2);
        } else if (num < num2) {
            System.out.println(num +" is less than "+num2);
        } else {
            System.out.println(num +" is equal to "+num2);
        }
    }
}
