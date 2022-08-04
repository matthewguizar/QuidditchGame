package src.main.models;

import java.util.Arrays;

public class Team {
    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;
    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";
    

/* FREQUENTLY ASKED QUESTIONS:
    
Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
  Answer: Even if the constant is final, I prefer to expose a method instead of the variable. But if you want to expose the variable, that's also correct.

*/

    public Team(String house, String keeper, String seeker, String[] chasers){
        if (house == null || keeper == null || seeker == null) {
            throw new IllegalArgumentException("Field values cannot be null");
        }

        if (house.isBlank() || keeper.isBlank()|| seeker.isBlank()){
            throw new IllegalArgumentException("Field values cannot be blank");
        }

        if (chasers.length != 3){
            throw new IllegalArgumentException("Must have three chasers");
        }

        if (hasNull(chasers) || hasBlank(chasers)){
            throw new IllegalArgumentException("Illegal elements");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public Team(Team team){
        this.house = team.house;
        this.keeper = team.keeper;
        this.seeker = team.seeker;
        this.chasers = Arrays.copyOf(team.chasers, team.chasers.length);
    }

    public String getHouse() {
        return this.house;
    }

    public void setHouse(String house) {
        checkArgument(house);
        this.house = house;
    }

    public String getKeeper() {
        return this.keeper;
    }

    public void setKeeper(String keeper) {
        checkArgument(keeper);
        this.keeper = keeper;
    }

    public String getSeeker() {
        return this.seeker;
    }

    public void setSeeker(String seeker) {
        checkArgument(seeker);
        this.seeker = seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(chasers, chasers.length);
    }

    public void setChasers(String[] chasers) {
       if(chasers.length !=3 || hasNull(chasers) || hasBlank(chasers)){
            throw new IllegalArgumentException("Illegal chaser arguments");
       }
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public void checkArgument(String argument){
        if (argument == null || argument.isBlank()){
            throw new IllegalArgumentException("Argument cannot be null or blank");
        }
    }
    

     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

    public static boolean hasNull(String[] array) {
        return Arrays.stream(array).anyMatch((element) -> element == null);
        
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == null){
        //         return true;
        //     } 
        // }
        // return false;
    } 

    public static boolean hasBlank(String[] array) {
        return Arrays.stream(array).anyMatch((element) -> element.isBlank());
    }


    @Override
    public String toString() {
        return 
              "House: " + this.house + "\n" +
            "Keeper: " + this.keeper + "\n" +         
            "Seeker: "  + this.seeker + "\n" +         
            "Chasers: " + Arrays.toString(this.chasers) + "\n"; 
    }
    

}
