package ua.lviv.iot;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
    
    	Scanner in = new Scanner(System.in);
    	String input = in.nextLine();
    	System.out.println(replace(input));
    }
    public static String replace(String text) {
        return text.replaceAll("(0\\s800\\s[0-9]{3}\\s[0-9]{3}|0800[0-9]{3}\\s[0-9]{3}|0\\s\\(800\\)\\s[0-9]{3}\\s[0-9]{3})", "HOT_LINE");
    }
}
