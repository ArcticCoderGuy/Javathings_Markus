
public class VotingEngine {

    public static void main(String[] args) {

        int age = 20;
        boolean isCitizen = true;
        boolean isRegistered = true;
        boolean hasVotedBefore = false;

        // 1️⃣ Contract check – is there even a valid request?
        if (!isRegistered) {
            log("REJECTED: Person is not registered.");
            return;
        }

        // 2️⃣ Age gate – legal requirement
        if (age < 18) {
            log("REJECTED: Under legal voting age.");
            return;
        }

        // 3️⃣ Citizenship gate – policy requirement
        if (!isCitizen) {
            log("REJECTED: Not a citizen.");
            return;
        }

        // 4️⃣ Duplicate vote gate – system integrity
        if (hasVotedBefore) {
            log("REJECTED: Duplicate voting attempt.");
            return;
        }

        // ✅ All gates passed
        recordVote();
        log("APPROVED: Vote recorded successfully.");
    }

    private static void recordVote() {
        System.out.println("Vote has been recorded.");
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
