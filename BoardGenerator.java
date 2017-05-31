import java.util.Random;

// class that generates and prints the random board as well
// as the main playing board
public class BoardGenerator{

    public int x = 0;
    public int count = x*x/2;



// method that generates the random number board
    public String[][] createRandom(){
      Random rand = new Random();
      String [][] randgrid = new String[x][x];

      for (int row = 0; row < count; row++){
        for (int col = 0; col < count; col++){
            int random = rand.nextInt(x*x/2) + 1;
            int x1 = rand.nextInt(x);
            int y1 = rand.nextInt(x);
            int x2 = rand.nextInt(x);
            int y2 = rand.nextInt(x);
            String randAsString = random + "";
            randgrid[x1][y1] = randAsString;
            randgrid[x2][y2] = randAsString;
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
      BoardGenerator print = new BoardGenerator();

      grid [x1][y1] = grid2[x1][y1];
      grid [x2][y2] = grid2[x2][y2];
      print.printGrid(grid);

      if (grid2[x1][y1] != grid2[x2][y2]){
        grid1[x1][y1] = "?";
        grid[x2][y2] = "?";
      }else{
        grid1[x1][y1] = " ";
        grid[x2][y2] = " ";
      }
      print.printGrid(grid);
      return grid;
  }

// creates the instance where it sets the object's x value to
  public BoardGenerator(int x){
    this.x = x;
  }
}
