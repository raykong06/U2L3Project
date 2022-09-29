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

    public int addScore()
    {
        score = score + 1;
        return score;
    }

    public int increaseScore(int increase)
    {
        score = score + increase;
        return score;
    }

    public double averageScorePerPlayer()
    {
        int averageScorePerPlayer = getScore() / getPlayers();
        return averageScorePerPlayer;
    }

    public void end()
    {
        gameOver = true;
    }
}
