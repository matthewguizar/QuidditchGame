package src.main.models;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Game {

    private HashMap<Team, Integer> scoreboard;
    private static int gameCount;
    private static final int QUAFFLE_POINTS = 10;


    public Game(Team home, Team away){
        this.scoreboard = new HashMap<>();
        scoreboard.put(new Team(home), 0);
        scoreboard.put(new Team(away), 0);
        gameCount++;
    }
    public static int getGameCount() {
        return gameCount;
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
    public static int getQuafflePoints() {
        return QUAFFLE_POINTS;
    }

    public String getPlaceholder(String play){
        //substring takes in two arguments (beginning index and ending index - 1)
        return play.substring(play.indexOf("<") + 1, play.indexOf(">"));

    }

    public String replacePlaceholder(String play, String placeholder, String value){
        return play.replace("<" +placeholder+ ">", value);
    }
    
    //scoring a quaffle is 10 points 
    public void quaffleScore(Team team){
        this.setScore(team, this.getScore(team) + QUAFFLE_POINTS);
    }

}
