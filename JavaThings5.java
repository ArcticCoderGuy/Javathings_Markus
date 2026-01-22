// Making an "securityscanner and small level checker" program

public class JavaThings5
{

    public static vooid main (String[] args ) {

        int securityLevel = 4;
        int accessCode = 1234;
        boolean systemOnline = true;

        // First check: is the system online ?

        if(systemOnline) {
            System.out.println("System is online");

            // Second check: is security level sufficient ?

            if(securityLevel >= 3) {
                System.out.println("Security level sufficient");

                // Third check: is access code correct ?

                if(accessCode == 1234) {
                    System.out.println("Access code correct. Access granted!");
                } else {
                    System.out.println("Access code incorrect. Access denied!");
                }

            } else {
                System.out.println("Security level insufficient. Access denied!");
            }

        } else {
            System.out.println("System is offline. Cannot proceed!");
        }


    }
}