// author Teddy Kalp
// Team 20

import java.util.Scanner;

public class board {
  private static int x;
  private static int y;

  public static void choice(){
    // asking user for difficulty level
    System.out.println("Please select the difficulty you would like play at?");
    System.out.println("1) Easy");
    System.out.println("2) Medium");
    System.out.println("3) Hard");
    Scanner keyboard = new Scanner(System.in);
    int choice = keyboard.nextInt();

    if (choice == 1){
      x = 5;
      y = 5;
    }else if(choice == 2){
      x = 6;
      y = 6;
    }else if(choice == 3){
      x = 7;
      y = 7;
    }else{
      System.out.println("Please select a valid choice");
      choice();
    }
}
    public static void main(String [] args){
      choice();
      String[][] grid = new String[x][y];
      System.out.println("----------------------------");
      for (int row = 0; row < x; row++){
        System.out.print(row + 1);
        for (int col = 0; col < y; col++){
          grid[row][col] = "?";
          System.out.print("[" + grid[row][col] + "]");
        }
        System.out.println(" ");
    }
    for (int row = 0; row < y;row++){
    	  System.out.print("  " + (row + 1));
      }
      System.out.println(" ");
}

}
