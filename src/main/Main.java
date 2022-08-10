package src.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import src.main.models.Game;
import src.main.models.Team;

public class Main {
    static Game game;
    static final String TEAMS_FILE = "src/main/teams.txt";
    static final String PLAYS_FILE = "src/main/plays.txt";

    public static void main(String[] args) {

        

        
            
        
        
    }


    /**
     * Function name: getData
     * @return (String[][])
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Returns data from TEAMS_FILE as a String[][] array
     */
    public static String[][] getData() throws FileNotFoundException {
       FileInputStream fis = new FileInputStream(TEAMS_FILE); //connecting to file
       Scanner scanFile = new Scanner(fis); //reading data using scanner (fis)
       String[] lines = new String[] {scanFile.nextLine(), scanFile.nextLine()};
       scanFile.close();

       return new String[][] {lines[0].split(","), lines[1].split(",")};
    }


    /** Function name: startGame
     * 
     * Inside the function:
     *    1. Grabs each play from plays.txt and calls game.simulate(play);
     *    2. Prints the return from game.simulate(play)
     *        - println("\n" + <return> + "\n");
     */


    /** Function name: printResult()
     * 
     * Inside the function:
     *    1. Prints the final score: println("\nGRYFFINDOR: " + <gryffindor score> + " SLYTHERIN: " + <slytherin score>);
     *    2. Prints the winner: println("\n" + <winner team name> + " WINS!");
     *  
     */

    /**
     * Function name: wait
     * @param sec
     * 
     * Inside the function:
     *  1. Make the code sleep for X seconds.
     */


  }
