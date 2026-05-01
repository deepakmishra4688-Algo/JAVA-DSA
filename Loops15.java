

import java.util.Scanner;



public class Loops15 {
    public static void main(String[] args) {
        // Q: print number from 1 to 5
        
        // Syntax of for loop:

        // for (initialization; condition; update/increment/decrement) {
        //     // body
        // }

         // Q: print number from 1 to 5

        //  for (int num = 1 ; num <= 5 ; num++) {
        //     System.out.println(num);
            


        //  }

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temp in C: ");
        float tempC = in.nextFloat();


        float tempF = (tempC * 9/5) + 32;
        System.out.println( tempF);



        


        
    }

    
}
