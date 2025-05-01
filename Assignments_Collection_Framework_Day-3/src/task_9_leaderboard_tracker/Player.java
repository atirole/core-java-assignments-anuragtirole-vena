package task_9_leaderboard_tracker;

import java.util.Objects;

public class Player
{
    private String name;
    private int score;

    // Constructor
    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    // Getter and Setter methods
    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "Player{name='" + name + "', score=" + score + "}";
    }

    // Override equals and hashCode to ensure proper comparisons in TreeSet
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name); // Players are equal if their names are the same
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}

