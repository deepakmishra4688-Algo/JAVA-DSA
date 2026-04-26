  // Arthematic operators//
public class Lecture4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    
    
    //relational operators//
    int x = 10;
    int y = 20;
    boolean isEqual = (x==y);
    
    System.out.println("Is x equal to y? " + isEqual);
    
    boolean isNotEqual = (x != y);
    System.out.println("Is x not equal to y? " + isNotEqual);
    boolean isGreaterThan = (x > y);
    System.out.println("Is x greater than y? " + isGreaterThan);
    boolean isLessThan = (x < y);
    System.out.println("Is x less than y? " + isLessThan);
    boolean isGreaterThanOrEqual = (x >= y);
    System.out.println("Is x greater than or equal to y? " + isGreaterThanOrEqual);
    boolean isLessThanOrEqual = (x <= y);
    System.out.println("Is x less than or equal to y? " + isLessThanOrEqual);
    }


}