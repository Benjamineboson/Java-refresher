package se.lexicon.data;

public class PersonSequencer {
    private static int personId;


    public static int nextPersonid(){
        return personId++;
    }

    public static void reset(){
        personId = 0;
    }


}
