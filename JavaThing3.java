public class JavaThing3
{
    public static void main (String [] args)
    {
        java.util.Scanner s = new java.util.Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = s.nextLine();
        System.out.println("Welcome, "+ name + "!");

        s.close();

    }
}
