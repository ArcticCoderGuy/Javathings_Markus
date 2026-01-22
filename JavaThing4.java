// In here I will create a Java program that asks for a user's name and then prints a welcome message.

public class JavaThing4
{
    public static void main (String [] args)
    {
        int a = 200;
        int b= 150;
        int c = 500;

        // I want to use AND operator to check if a is greater than b and c is greater than a

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }
    


        // Then I will test OR (||) operator

        if(a > b || a > c) {
            System.out.println("At least one condition is right");

        }

        // This is testing the NOT (!) operator

        if(!(a < b) ) {
            System.out.println("a is not greater than b");
        }


        
    }
}
