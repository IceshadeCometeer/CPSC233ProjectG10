// author Teddy Kalp
// Team 20

import java.util.Scanner;
import java.util.Random;

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
      x = 4;
      y = 4;
    }else if(choice == 2){
      x = 6;
      y = 6;
    }else if(choice == 3){
      x = 8;
      y = 8;
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


      // creating a random board
      String [][] randgrid = new String[x][y];
      Random rand = new Random();
      boolean wincondition = false;

      for (int row = 0; row < x*x/2; row++){
        for (int col = 0; col < y*y/2; col++){
            int random = rand.nextInt(x*x/2) + 1;
            int randx1 = rand.nextInt(x);
            int randy1 = rand.nextInt(y);
            int randx2 = rand.nextInt(x);
            int randy2 = rand.nextInt(y);
            String randAsString = random + "";
            randgrid[randx1][randy1] = randAsString;
            randgrid[randx2][randy2] = randAsString;
        }
      }


      while (!wincondition){
      System.out.println("Please enter the first box you would like to flip");
      System.out.print("Row 1: ");
      Scanner keyboard = new Scanner(System.in);
      int x1 = keyboard.nextInt() - 1;
      System.out.print("Column 1: ");
      int y1 = keyboard.nextInt() - 1;
      System.out.println("Please enter the second box you would like to flip");
      System.out.print("Row 2: ");
      int x2 = keyboard.nextInt() - 1;
      System.out.print("Column 2: ");
      int y2 = keyboard.nextInt() - 1;

      grid[x1][y1] = randgrid[x1][y1];
      grid[x2][y2] = randgrid[x2][y2];

      for (int row = 0; row < x; row++){

        System.out.print(row + 1);
        for (int col = 0; col < y; col++){
          System.out.print("[" + grid[row][col] + "]");
        }
        System.out.println(" ");
      }

      for (int row = 0; row < y;row++){
    	  System.out.print("  " + (row + 1));
      }
      System.out.println(" ");

      if (grid[x1][y1].equals(grid[x2][y2])){
      grid[x1][y1] = " ";
      grid[x2][y2] = " ";
      }
      else{
      grid[x1][y1] = "?";
      grid[x2][y2] = "?";
      }


    System.out.println("------------------------------");

    for (int row = 0; row < x; row++){
      System.out.print(row + 1);
      for (int col = 0; col < y; col++){
        System.out.print("[" + grid[row][col] + "]");
      }
      System.out.println(" ");
  }

  for (int row = 0; row < y;row++){
      System.out.print("  " + (row + 1));
    }
    System.out.println(" ");



    int count = 0;
    // win condition
    for (int row = 0; row < x; row++){
      for (int col = 0; col < y; col++){
        if (grid[row][col] == " "){
          count += 1;
          }
        }

      }
      if (count == x*x){
        System.out.println("You win!");
        wincondition = true;
    }
  }

}

}
