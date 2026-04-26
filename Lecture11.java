public class Lecture11 {
    // LOOPS IN JAVA - WHAT? WHY? //
     public static void main(String[] args) {
        // for loop //
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("DEEPAK MISHRA");
        }
        // print first 10 natural numbers //
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // print first 10 even numbers //
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println();
        // print first 10 odd numbers //
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print(2*i - 1 + " ");   
        }
        System.out.println();

        for (int i=1 ; i<=20; i=i+2) {
            System.out.println(i);


        }
        System.out.println();
        for (int i=2 ; i<=20; i=i+2) {
            System.out.println(i);
        }
        System.out.println();
        //NESTED LOOP //
        for (int i=1 ; i<=4 ; i++) {
            for (int j=1 ; j<=3 ; j++) {
                System.out.print("***" );
            }
            System.out.println();
        }
        System.out.println();
            for (int i=1 ; i<=3 ; i++) {
                for (int j= 1; j<=4 ; j++) {
                    for (int k= 1; k<=5 ; k++) {
                        System.out.print("* ");
                    
                    
                }
                System.out.println();
            }
        }
        System.out.println();
        //BREAK AND CONTINUE KEYWORDS//
        for (int i = 1 ; i <= 10 ; i++) {
            if (i==5) {
                break; // it will break the loop when i is 5 and it will not print 5
            }
            System.out.println(i );
        }
        //CONTINUE KEYWORD //
        System.out.println();

        
    
        for (int i = 1 ; i <= 10; i++) {
            if (i==1 || i==4 || i==7 || i==9) {
                continue; // it will skip the iteration when i is 1, 4, or 7 and it will not print those numbers
            }
            System.out.println(i);
        }

        System.out.println();
        //WHILE LOOP //
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    
            System.out.println();
    }
         
        }
    

            





        
         

        
    
        
        
    
     

                   
            




     
        
        