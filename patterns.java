import  java.lang.System;


public class patterns {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}

class rectangle_pattern {
    public static void main(String[] args) {

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

class  inverted_triangle_pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}


class hollow_square_pattern {
    public static void main(String[] args) {
        int n = 5; // Size of the square

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

class dimond_pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the diamond

        // Upper half of the diamond
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  "); // Print space
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the diamond
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  "); // Print space
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


class pascal_triangle_pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for(int i=0; i<n; i++) {
            // Print leading spaces
            for(int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }

            int number = 1; // First number in each row is always 1
            for(int k=0; k<=i; k++) {
                System.out.print(number + "   "); // Print the number with spaces
                number = number * (i - k) / (k + 1); // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}