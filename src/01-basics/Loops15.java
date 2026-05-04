

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

        // System.out.print("Please enter the temp in C: ");
        // float tempC = in.nextFloat();


        // float tempF = (tempC * 9/5) + 32;
        // System.out.println( tempF);


        // multiple if- else statements:
        // int salary = 25400;

        // if (salary > 10000) {
        //     salary += 2000; // salary = salary +2000
        // } else if (salary > 20000) {
        //     salary += 3000;


        // } else {
        //     salary += 1000;
        // }

        // System.out.println(salary);
        
    //     int a = in.nextInt();
    //     int b = in.nextInt();  
    //     int c = in.nextInt();
    //      // find the largest of the 3 
    //      int max = a;
    //         if (b > max) {
    //             max = b;

    //         }
    //         if (c > max) {
    //             max = c;
    //         }
    //         System.out.println(max);

            


        






        


        
    
    // in.close();


    // char ch = in.next().trim().charAt(0);
    // String word = "hello";
    // System.out.println(word.charAt(2));
    // System.out.println(ch);

    char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }



  
     




     




        






        
    
    in.close();



     




        }


    
}
