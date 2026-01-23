public class VoterCheck {
  public static void main(String[] args) {
    int age = 0;
    boolean isCitizen = true;
    boolean isRegistered = true;
    boolean hasID = true;
    boolean pollingStationOpen = true;

    System.out.println("Voting eligibility check started.");

    // Fail fast on impossible ages
    if (age <= 0) {
      System.out.println("AUDIT: NO-GO | Invalid age value");
      return;
    }

    // Environment guard
    if (!pollingStationOpen) {
      System.out.println("AUDIT: NO-GO | Polling station is closed");
      return;
    }

    // Gate 1: age requirement
    if (age >= 18) {
      System.out.println("Gate passed: old enough to vote.");

      // Gate 2: citizenship
      if (isCitizen) {
        System.out.println("Gate passed: citizen confirmed.");

        // Gate 3: registration
        if (isRegistered) {
          System.out.println("Gate passed: voter is registered.");

          // Gate 4: identification
          if (hasID) {
            System.out.println("ACTION: Allowed to vote.");
            System.out.println(
              "AUDIT: GO | age=" + age +
              ", citizen=" + isCitizen +
              ", registered=" + isRegistered +
              ", hasID=" + hasID
            );
          } else {
            System.out.println("AUDIT: NO-GO | Missing identification");
          }
        } else {
          System.out.println("AUDIT: NO-GO | Voter not registered");
        }
      } else {
        System.out.println("AUDIT: NO-GO | Not a citizen");
      }
    } else {
      System.out.println("AUDIT: NO-GO | Not old enough to vote");
    }
  }
}
