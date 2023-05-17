package by.bsu.lab3a.util;

public class IdGenerator {
    private static long trainId=0;
    private IdGenerator(){
    }

    public static long getTrainId(){
        return ++trainId;
    }
}
