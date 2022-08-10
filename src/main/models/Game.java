package src.main.models;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public void setScore(Team team, Integer score){
        scoreboard.put(team, score);
    }

    public Team getTeam(String name){
        return  this.scoreboard.keySet().stream()
        .filter((key) -> key.getHouse().equals(name))
        .collect((Collectors.toList()))
        .get(0);

        // this.scoreboard.entrySet().stream()
        // .filter((entry) -> entry.getKey().getHouse().equals(name))
        // .collect((Collectors.toList()))
        // .get(0)
        // .getKey();

        // this.scoreboard.keySet().stream()
        // .filter((key) -> key.getHouse().equals(name))
        // .findFirst()
        // .orElse(null);
        
        
        // this.scoreboard.entrySet().stream()
        // .filter((entry) -> entry.getKey().getHouse().equals(name))
        // .findFirst()
        // .orElse(null)
        // .getKey();
        
        
       
    }
    

}
