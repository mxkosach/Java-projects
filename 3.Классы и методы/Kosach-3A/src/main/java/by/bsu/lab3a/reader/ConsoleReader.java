package by.bsu.lab3a.reader;

import java.util.Scanner;

public class ConsoleReader {
    private ConsoleReader(){
    }
    public static String readStringFromConsole(){
        Scanner in=new Scanner(System.in);
        String strValue=in.next();
        return strValue;
    }

    public static int readNumberFromConsole(){
        String strValue=readStringFromConsole();
        int numberValue=Integer.parseInt(strValue);
        return numberValue;
    }
}
