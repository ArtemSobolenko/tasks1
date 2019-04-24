package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String getDataFromConsole(){
        String str = null;
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void print(String msg){
        System.out.println(msg);
    }
}
