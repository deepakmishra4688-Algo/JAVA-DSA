import java.util.Scanner;

public class Lecture10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        //conditional hommework//

        int Age = 25; 
        if (Age >= 19) {
            System.out.println("You are eligible for voting.");
        } else { 
            System.out.println("You are not eligible for voting.");
        }

     
        // Take input of 5 subjects marks and print the average marks.
        
         System.out.print("Enter marks for subject 1: ");
            int subject1 = sc.nextInt();
            System.out.print("Enter marks for subject 2: ");
            int subject2 = sc.nextInt();
            System.out.print("Enter marks for subject 3: ");
            int subject3 = sc.nextInt();
            System.out.print("Enter marks for subject 4: ");
            int subject4 = sc.nextInt();
            System.out.print("Enter marks for subject 5: ");
            int subject5 = sc.nextInt();    
             // Calculate total marks
             int total = subject1 + subject2 + subject3 + subject4 + subject5;
                // // Calculate percentage
                double percentage = (total / 5.0);
                  // Print percentage
                System.out.println("Overall Percentage = " + percentage + "%");
                   
    


       //take character input//

       System.out.println("Enter the Uppercase character: ");
         char ch = sc.next().charAt(0);
         //check if character is Uppercase
            if(ch >= 'A' && ch <= 'Z') {
                // covert by bulit in method//
                char lower = Character.toLowerCase(ch);
                System.out.println("Lowercase character: " + lower);
            }
            else {
                System.out.println("Please enter an uppercase character."); 
            }
            sc.close();
        }
    }


    













    

