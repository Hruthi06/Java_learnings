public class looping {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println("The value of i is: " + i);
        }
    }
    
}


class looping1{
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            System.out.println("The value of i is: " + i);
        }
    }
    
}

class even_numbers {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++) {
            if(i%2==0) {
                System.out.println(i + " is an even number.");
            }
        }
    
    }
}

class even_numbers2 {
    public static void main(String[] args) {
        int i=1;
        while(i<=50) {
            if(i%2==0) {
                System.out.println(i + " is an even number.");
            }
            i++;
        }
    }
}


class sum_of_numbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}


class do_while_example {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while(i <= 5);
    }

}


