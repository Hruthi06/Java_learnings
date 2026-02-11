public class conditional {
    public static void main(String[] args) {
        int age = 19;

        if(age>=18) {
            System.out.println("You are eligible to vote.");
        } 
    
}}

class conditional2 {
    public static void main(String[] args) {
        int number = 5;

       if  (number%2==0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}

class conditional3 {
    public static void main(String[] args) {
        int marks = 85;

        if(marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

class conditional4 {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }
}