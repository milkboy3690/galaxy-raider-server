package com.example.demo;

import java.io.Serializable;

public class ScoreRequest implements Serializable {
    private String playerName;
    private int score;

    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
}