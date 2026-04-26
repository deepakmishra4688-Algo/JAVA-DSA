
 

public class Lecture8 {

    public static void main(String[] args) {

        //nested if else statement//

        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practise More Problems");
            }
        } else {
            System.out.println("Upgrade to Premium");
            }



        int age = 12;
        char gender = 'M';

        if (gender == 'M') {
            // true aaya , if block execute karo and else ko ignore karo 
           System.out.println("you are male");
           if (age > 18) {
            //false -> if ko ignore karo and else ko execute karo
            System.out.println("You are male and age > 18");
           }
           else {
            System.out.println("you are male and age <= 18");
           }
        }
        else{
            System.out.println("you are not a male");
            if(age > 18){
                System.out.println("you are not a male and age > 18");
            }
            else{
                System.out.println("you are not a male and age <= 18");

            }

        }


            int Age = 19;
        char Gender = 'F';

        if (Gender == 'M') {
            // true aaya , if block execute karo and else ko ignore karo 
           System.out.println("you are male");
           if (Age > 18) {
            //false -> if ko ignore karo and else ko execute karo
            System.out.println("You are male and age > 18");
           }
           else {
            System.out.println("you are male and age <= 18");
           }
        }
        else{
            System.out.println("you are not a male");
            if(Age > 18){
                System.out.println("you are not a male and age > 18");
            }
            else{
                System.out.println("you are not a male and age <= 18");

            }


        }
    

        int streakDays = 35;
        String status = (streakDays >= 30) ? "Pro" : "Noob";
        System.out.println(status);
    }
}


        
    

    




        

        
    
        
    

