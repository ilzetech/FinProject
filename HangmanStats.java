
/**
 * Instantiable class HangmanStats, add +1 to lost or won + sum total games
 */
public class HangmanStats {
    private int gamesLost;
    private int gamesWon;
    public int getGamesLost() {
        return gamesLost;
    }
    public void incrementGamesLost() {//add number of game lost
        this.gamesLost += 1;
    }
    public int getGamesWon() {
        return gamesWon;
    }
    public void incrementGamesWon() {//add number of game lost
        this.gamesWon += 1;
    }
    public int getGamesTotal(){
        return gamesLost + gamesWon;
    }
}