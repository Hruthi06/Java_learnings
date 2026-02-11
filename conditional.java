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


class logicaloperator {
    public static void main(String[] args) {
        int age = 25;
        boolean hasticket = true;

        if(age >= 18 && hasticket) {
            System.out.println("You can enter the concert.");
        } else {
            System.out.println("You cannot enter the concert.");
        }


        boolean isWeekend = true;
        boolean isHoliday = false;

        if(isWeekend || isHoliday) {
            System.out.println("You can relax.");
        } else {
            System.out.println("You cant relax .");
        }


        boolean isRaining = false;

        if (!isRaining) 
            {
            System.out.println("You can go outside.");
        } else {
            System.out.println("You should stay indoors.");
            
        }

    }
}


class positive_negative {
    public static void main(String[] args) {
        int number = -10;

        if(number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}


class largest_of_three {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        if(a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}


class vowel_consonant {
    public static void main(String[] args) {
        char[ ] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char ch = 'A';
        boolean isVowel = false;
        for(char vowel : vowels) {
            if(ch == vowel) {
                isVowel = true;
                break;
            }
        }
        if(isVowel) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }


}


class calculator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        char operator = '+';

        switch(operator) {
            case '+':
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0) {
                    System.out.println("The quotient is: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}


class demo1 {
    public static void main(String[] args) {
        String a = new String("apple");
        String b = new String("apple");
        System.out.println(a.equals(b));
    }
}