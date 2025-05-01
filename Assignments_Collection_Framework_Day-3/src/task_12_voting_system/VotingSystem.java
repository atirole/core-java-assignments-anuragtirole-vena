package task_12_voting_system;

import java.util.*;

public class VotingSystem
{
    private Map<String, Integer> voteMap = new HashMap<>();

    // Add a vote for a candidate
    public void castVote(String candidate)
    {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
    }

    // Display vote tally sorted by descending votes
    public void displayResults()
    {
        List<Map.Entry<String, Integer>> sortedVotes = new ArrayList<>(voteMap.entrySet());

        sortedVotes.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); // Descending sort

        System.out.println("🗳️ Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedVotes)
        {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }
}
