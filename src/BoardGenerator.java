import java.util.Random;

// class that generates and prints the random board as well
// as the main playing board
public class BoardGenerator{

    private int x = 0;
    private int y = 0;
    public int count = x*x/2;



// method that generates the random number board
    public String[][] createRandom(){

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

        return randgrid;
    }
// creates the playing board
    public String[][] createGrid(){
      String [][] grid = new String[x][x];
      for (int row = 0; row < x; row++){
        for (int col = 0; col < x; col++){
          grid[row][col] = "?";
        }
    }  return grid;
  }


// common method to just print out the grid array
   public void printGrid(String[][] grid){
     for (int row = 0; row < x; row ++){
        for (int col = 0; col < x; col ++){
          System.out.print("[" + grid[row][col] + "]");
        }
        System.out.println(" ");
      }
    }


// creates the grid when user has selected a number
public String[][] showGrid(String [][] grid, String [][] grid2, int x1, int x2, int y1, int y2){
  //boolean wincondition = false;

      //while (wincondition){
        grid [x1][y1] = grid2[x1][y1];
        grid [x2][y2] = grid2[x2][y2];
        printGrid(grid);

        if (grid2[x1][y1] != grid2[x2][y2]){
          grid[x1][y1] = "?";
          grid[x2][y2] = "?";
        }else{
          grid[x1][y1] = " ";
          grid[x2][y2] = " ";
        }
        System.out.println("---------------------------------------");
        printGrid(grid);

      return grid;
  }

// creates the instance where it sets the object's x value to
  public BoardGenerator(int x){
    this.x = x;
    this.y = x;
  }
}
