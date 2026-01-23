

public class Main {
  public static void main(String[] args) {

    // ==============================
    // CONTRACT (Input data)
    // ==============================
    // These variables represent the "contract":
    // the system assumes this data exists and is correctly typed.
    int age = 0;
    boolean isCitizen = true;
    boolean isRegistered = true;
    boolean hasID = true;
    boolean pollingStationOpen = true;

    System.out.println("Voting eligibility check started.");

    // ==============================
    // GUARD CLAUSE 1: basic sanity check
    // ==============================
    // WHY:
    // A system should fail fast if input data is clearly invalid.
    // Negative age makes no sense, so we stop immediately.
    if (age < 0) {
      System.out.println("AUDIT: NO-GO | Invalid age value");
      return;
    }

    // ==============================
    // GUARD CLAUSE 2: environment check
    // ==============================
    // WHY:
    // Even a valid voter cannot vote if the polling station is closed.
    // There is no reason to check other conditions if this fails.
    if (!pollingStationOpen) {
      System.out.println("AUDIT: NO-GO | Polling station is closed");
      return;
    }

    // ==============================
    // DECISION GATE 1: age requirement
    // ==============================
    // WHY:
    // Voting eligibility always starts with age.
    // If this fails, citizenship or registration does not matter.
    if (age >= 18) {
      System.out.println("Gate passed: old enough to vote.");

      // ==============================
      // DECISION GATE 2: citizenship
      // ==============================
      // WHY:
      // Only citizens are allowed to vote.
      // This condition depends on passing the age check.
      if (isCitizen) {
        System.out.println("Gate passed: citizen confirmed.");

        // ==============================
        // DECISION GATE 3: registration
        // ==============================
        // WHY:
        // Even eligible citizens must be registered to vote.
        if (isRegistered) {
          System.out.println("Gate passed: voter is registered.");

          // ==============================
          // DECISION GATE 4: identification
          // ==============================
          // WHY:
          // Identification is required to prevent fraud
          // and ensure the correct person is voting.
          if (hasID) {

            // ==============================
            // ACTION
            // ==============================
            // All conditions have passed.
            // The system now performs the real-world action.
            System.out.println("ACTION: Allowed to vote ✅");

            // ==============================
            // LOG / AUDIT
            // ==============================
            // WHY:
            // Every decision must be traceable and explainable.
            System.out.println(
              "AUDIT: GO | age=" + age +
              ", citizen=" + isCitizen +
              ", registered=" + isRegistered +
              ", hasID=" + hasID
            );

          } else {
            // Missing identification blocks the action
            System.out.println("AUDIT: NO-GO | Missing identification");
          }

        } else {
          // Registration is mandatory
          System.out.println("AUDIT: NO-GO | Voter not registered");
        }

      } else {
        // Citizenship requirement failed
        System.out.println("AUDIT: NO-GO | Not a citizen");
      }

    } else {
      // Age requirement failed
      System.out.println("AUDIT: NO-GO | Not old enough to vote");
    }
  }
}
