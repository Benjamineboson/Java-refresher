package se.lexicon.data;

public class TodoSequencer {

    private static int todold;

    public static int nextTodol(){
        return todold++;
    }

    public static void reset(){
        todold = 0;
    }

}
