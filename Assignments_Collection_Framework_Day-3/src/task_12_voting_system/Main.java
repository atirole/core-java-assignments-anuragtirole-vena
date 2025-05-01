package task_12_voting_system;

public class Main
{
    public static void main(String[] args)
    {
        VotingSystem system = new VotingSystem();

        // Casting votes
        system.castVote("Anurag");
        system.castVote("Sandeep");
        system.castVote("Vijay");
        system.castVote("Mahesh");
        system.castVote("Sanskar");
        system.castVote("Sarthak");

        // Display sorted results
        system.displayResults();
    }
}

