package src.main.models;

import java.util.HashMap;

public class Game {

    private HashMap<Team, Integer> scoreboard;


    public Game(Team home, Team away){
        this.scoreboard = new HashMap<>();
        scoreboard.put(new Team(home), 0);
        scoreboard.put(new Team(away), 0);
    }

    public Integer getScore(Team team){
        return scoreboard.get(team);
    }
    

}
