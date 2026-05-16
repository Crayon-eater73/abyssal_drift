package mainBackground;

import java.util.Scanner;

public class menu {
       public static void main(String[] args) {
           
       Scanner scanner = new Scanner (System.in);
       boolean running = true;

       System.out.println("New Game");
       System.out.println();
       System.out.println("Continue");
       System.out.println();
       System.out.println("Load Game");
       System.out.println();
       System.out.println("Settings");
       System.out.println();
       System.out.println("Quit");
       System.out.println();

       String player = scanner.nextLine();

       if(player.equals("New Game")) {
              newGame();
       } else if (player.equals("Continue")) {
              continueGame();
       } else if (player.equals("Load Game")) {
              loadGame();
       } else if (player.equals("Quit")) {
              quitGame();
       } else {
              System.out.println("Invalid choice. Tye again.");
       }

       scanner.close();

       }

       public static void newGame() {
              System.out.println("Let's start the journey...");
       }

       public static void continueGame() {
              System.out.println("Let's continue this journey...");
       }

       public static void loadGame() {
              System.out.println("Load you jorney from any saves");
       }

       public static void quitGame() {
              System.out.println("Take a break");
       }
}
