public class Lecture9 {
    public static void main(String[] args) {

        // switch case statement//
         
         int day = 3;

         switch (day) {

             case 1:

                 System.out.println("Monday");

                 break;
             case 2:

                 System.out.println("Tuesday");

                 break;

             case 3:

                 System.out.println("Wednesday");

                 break;

             default:

                 System.out.println("Invalid day");
         

            }
        




        // nested switch case statement//
        int month = 2;
        int year = 2020;

        switch (month) {
            case 2:
                if (year % 4 == 0) {
                    System.out.println("February has 29 days");
                } else {
                    System.out.println("February has 28 days");
                }
                break;
            default:
                System.out.println("Invalid month");
        }


       





    }



}