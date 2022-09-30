public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    public int getScore()
    {
        return score;
    }

    public int addPlayer()
    {
        players = players + 1;
        return players;
    }

    public int increaseScore(int increase)
    {
        score = score + increase;
        return score;
    }

    public double averageScorePerPlayer()
    {
        double averageScorePerPlayer = (double)getScore() / getPlayers();
        return averageScorePerPlayer;
    }

    public void end()
    {
        gameOver = true;
    }
}
