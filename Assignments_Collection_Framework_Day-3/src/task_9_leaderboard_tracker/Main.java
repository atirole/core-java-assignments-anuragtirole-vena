package task_9_leaderboard_tracker;

public class Main
{
    public static void main(String[] args)
    {
        // Create leaderboard tracker
        LeaderboardTracker leaderboard = new LeaderboardTracker();

        // Create players
        Player player1 = new Player("Anurag", 1200);
        Player player2 = new Player("Vijay", 1500);
        Player player3 = new Player("Mahesh", 1000);

        // Add players to the leaderboard
        leaderboard.addPlayer(player1);
        leaderboard.addPlayer(player2);
        leaderboard.addPlayer(player3);

        // Display leaderboard
        leaderboard.displayLeaderboard();

        // Update score of a player
        System.out.println("\nUpdating Anurag score...");
        leaderboard.updateScore(player1, 1700);

        // Display leaderboard after score update
        leaderboard.displayLeaderboard();
    }
}
