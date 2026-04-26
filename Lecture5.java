
//Taking input in java//
import java.math.BigInteger;
import java.util.Scanner;

public class Lecture5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum:");

        int firstNum = sc.nextInt();

        System.out.println("Enter the value of secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is: " + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger: " + bg);

        System.out.print("Enter the value of flag:");
        boolean flag = sc.nextBoolean();
        System.out.print("Enter the value of shortval:");
        short shortVal = sc.nextShort();
        System.out.print("Enter the value of floatValue:");
       
        float floatVal = sc.nextFloat();

        System.out.println("flag is: " + flag);
        System.out.println("shortVal is: " + shortVal);
        System.out.println("floatVal is: " + floatVal);
        
       sc.close();

     
        

        
    }
}

