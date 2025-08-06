/*
15. Create a `VotingSystem` class where users can vote for candidates.
Implement exception handling for invalid votes (e.g., voting for non-existent candidates or double voting).
 */

import java.util.*;

class Voting{
    String[] candidates = {"c1", "c2", "c3"};
    int[] votes = new int[candidates.length];
    String[] voters = new String[3];
    int voterCount = 0;

    public static void main(String[] args) {
        Voting votingSystem = new Voting();
        Scanner ob = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Enter voter ID:");
                String voterID = ob.nextLine();

                System.out.println("Vote for? :");
                String candidate = ob.nextLine();

                votingSystem.castVote(voterID, candidate);

            } catch (InvalidVoteException e) {
                System.out.println("Invalid candidate.");
            } catch (DoubleVotingException e) {
                System.out.println("You have already voted.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid data.");
                break;
            }
        }
    }

    void castVote(String voterID, String candidate) throws InvalidVoteException, DoubleVotingException {
        if (findVoterIndex(voterID) != -1) {
            throw new DoubleVotingException("Already voted.");
        }

        int candidateIndex = findCandidateIndex(candidate);
        if (candidateIndex == -1) {
            throw new InvalidVoteException("Invalid candidate.");
        }

        votes[candidateIndex]++;
        voters[voterCount++] = voterID;
        System.out.println("Vote cast successfully for " + candidate);
    }

    int findCandidateIndex(String candidate) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].equalsIgnoreCase(candidate)) {
                return i;
            }
        }
        return -1;
    }

    int findVoterIndex(String voterID) {
        for (int i = 0; i < voterCount; i++) {
            if (voters[i].equalsIgnoreCase(voterID)) {
                return i;
            }
        }
        return -1;
    }
}

class InvalidVoteException extends Exception {
    InvalidVoteException(String message) {
        super(message);
    }
}

class DoubleVotingException extends Exception {
    DoubleVotingException(String message) {
        super(message);
    }
}
