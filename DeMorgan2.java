// A longer version of the De Morgan's laws

/**
 * Checks the user's access to the system.
 *
 * VOJKER-method sequence:
 * 
 * 1. Contracts    – clear assumptions and constraints
 * 2. Guards       – early exit on failing cases (fail fast)
 * 3. Tests        – each guard is its own test case
 * 4. Audits       – precise failure reason message
 * 5. Logging      – logging for debugging and monitoring
 */


public class DeMorgan2
{
    public static void main (String [] args) 
    {
        String text = "Welcome to the Vojker-method demo directory";

        demoMinimal(text);
        System.out.println("-----");
        demoAudit(text);
               
    }

     // 1) Minimal guard clause demo (silent fail-fast
     static void demoMinimal(String text) 
     {
        if(text == null || text,isBlank()){
            return:
        }
        System.out.println(text);

        


     }
    )

}