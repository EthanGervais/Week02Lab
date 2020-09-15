package week02lab;

import java.util.Scanner;

/**
 * This code is garbage, is written sloppily, and does basically nothing!
 *
 * @author ethan
 */
public class Week02Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amtHowdy;

        System.out.println("I can say \"Howdy!\" as many times as you would like (within reason, don't be ridiculous).");
        System.out.print("Please enter any number from 1 to 10,000: ");

        amtHowdy = in.nextInt();

        if (amtHowdy > 0 && amtHowdy <= 10000) { //Assuring the amount of Howdy's is from 1 to 10,000
            for (int i = 0; i < amtHowdy; i++) {
                System.out.println("Howdy!");
            }
            if (amtHowdy > 1) { //Checking if console should say "time" or "times" depending on how many Howdy's there are
                System.out.println("\nYou asked and I delivered... I really just said \"Howdy\" " + amtHowdy + " times!");
            } else {
                System.out.println("\nYou asked and I delivered... I really just said \"Howdy\" " + amtHowdy + " time!");
            }
        } else {
            System.out.println("\nThis is awkward... I said any number from 1 to 10,000 and you really chose " + amtHowdy + "...");
            System.out.println("You kinda just ruined the fun for everyone here...");
        }
    }

}
