// The launch of Vojker-method (v1.0): Contracts -> Guards-> Tests -> Audits

// The purpose of this directory is to experiment with De Morgan's Laws in Java

public class DeMorgan
{
    public static void main (String [] args) {

    String text = "Welcome to the Vojker-method demo directory";

    // Guard clause: Check if text is not null and not empty and "fail fast"

    if(text == null || text.isEmpty()) 
        { 
            return;
        }

        System.out.println(text);
    }
}


/**
 * Checks the user's access to the system.
 *
 * VOJKER-method sequence:
 * 1. Contracts    – clear assumptions and constraints
 * 2. Guards       – early exit on failing cases (fail fast)
 * 3. Tests        – each guard is its own test case
 * 4. Audits       – precise failure reason message
 * 5. Logging      – logging for debugging and monitoring
 */


