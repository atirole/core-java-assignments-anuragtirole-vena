package task_9_leaderboard_tracker;

import java.util.Comparator;
import java.util.TreeSet;

public class LeaderboardTracker
{
    // TreeSet to store players, sorted by score in descending order
    private TreeSet<Player> leaderboard;

    // Constructor
    public LeaderboardTracker()
    {
        leaderboard = new TreeSet<>(Comparator.comparingInt(Player::getScore).reversed());
    }

    // Add a new player to the leaderboard
    public void addPlayer(Player player)
    {
        leaderboard.add(player);
    }

    // Update a player's score
    public void updateScore(Player player, int newScore)
    {
        // Remove the player first
        leaderboard.remove(player);

        // Update player's score
        player.setScore(newScore);

        // Re-add the player with updated score
        leaderboard.add(player);
    }

    // Display the leaderboard
    public void displayLeaderboard()
    {
        System.out.println("Leaderboard:");
        for (Player player : leaderboard)
        {
            System.out.println(player);
        }
    }
}
