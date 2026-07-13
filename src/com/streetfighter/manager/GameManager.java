package com.streetfighter.manager;

/**
 * Singleton Pattern
 * ------------------
 * Only one GameManager should ever exist, since it holds the single
 * source of truth for match state (round number, scores, game phase).
 * Any class that needs this info gets it through GameManager.getInstance()
 * instead of passing a GameManager object around everywhere.
 */
public class GameManager {

    // The one and only instance — created lazily, on first request
    private static GameManager instance;

    // Match state this Singleton is responsible for
    private int roundNumber;
    private int player1Score;
    private int player2Score;
    private GameState currentState;

    public enum GameState {
        MENU,
        FIGHTING,
        ROUND_OVER,
        MATCH_OVER
    }

    // Private constructor — nobody outside this class can call "new GameManager()"
    private GameManager() {
        roundNumber = 1;
        player1Score = 0;
        player2Score = 0;
        currentState = GameState.MENU;
    }

    // The single global access point
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void nextRound() {
        roundNumber++;
    }

    public void addPlayer1Point() {
        player1Score++;
    }

    public void addPlayer2Point() {
        player2Score++;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameState state) {
        this.currentState = state;
    }

    public void resetMatch() {
        roundNumber = 1;
        player1Score = 0;
        player2Score = 0;
        currentState = GameState.MENU;
    }
}
