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
       System.out.println("Pick your choice: ");

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
              System.out.println("Invalid choice. Try again.");
       }

       scanner.close();

       }

       public static void newGame() {
              System.out.println();
              System.out.println("Let me start from the beginning...");
              System.out.println();
       }

       public static void continueGame() {
              System.out.println();
              System.out.println("As I left off...");
              System.out.println();
       }

       public static void loadGame() {
              System.out.println();
              System.out.println("Where do I need to strt from?");
              System.out.println();
       }

       public static void quitGame() {
              System.out.println();
              System.out.println("Take a break");
              System.out.println();
       }
}
