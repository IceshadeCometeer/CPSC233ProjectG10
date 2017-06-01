import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

// class that generates and prints the random board as well
// as the main playing board
public class BoardGenerator{

	private int x = 0;
	
	public boolean endRandom(String [][] grid, String random){
		Random rand = new Random();
		int count = 0;
		String[] location = new String[x*x];
		
		// creating a list of location in the grid
		for (int row = 0; row < x; row++){
			for (int col = 0; col < x; col++){
				location[row] = (row + " " + col );
			}
		}
		
		// generating random locations
		int randomLoc1 = rand.nextInt(x*x);
		int randomLoc2 = rand.nextInt(x*x);
		
		//
		String coord1 = location[randomLoc1];
		String coord2 = location[randomLoc1];
		
		
		
		
			
		
		
		for (int row = 0; row < x; row++){
			for (int col = 0; col < x; col++){
				if (grid[row][col] == null){
					return false;
				}
			}
		}
		

	for (int i = 0; i < x - 1; i++) {
		  for (int j = i + 1; j < x; j++) {
			  if(grid[i][j-1] == grid[i][j]){
		       count += 1;
			  }
		  }    
		}
		
		if (count > 1){
			return false;
		}
			return true;	  
	}
	
	// method that generates the random number board
	public String[][] createRandom(){
		boolean makingRandom = false;
		String [][] randgrid = new String[x][x];
		Random rand = new Random();
		int count = 0;
		
		// continues to create a random board until there is only one duplicate
		// of a number
		while(!makingRandom){
				
			int random = rand.nextInt(x * 2) + 1;
			int randx1 = rand.nextInt(x);
			int randy1 = rand.nextInt(x);
			int randx2 = rand.nextInt(x);
			int randy2 = rand.nextInt(x);
			String randAsString = random + "";

			if(randgrid[randx1][randy1] == null){
				if(randgrid[randx2][randy2] == null){
					randgrid[randx1][randy1] = randAsString;
					randgrid[randx2][randy2] = randAsString;
				}
			}


			if (endRandom(randgrid, randAsString) == true){
				makingRandom = true;
			}
		} return randgrid;
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
			System.out.print(row + 1);
			for (int col = 0; col < x; col ++){
				System.out.print("[" + grid[row][col] + "]");
			}
			System.out.println(" ");
		}
		
		for (int col = 0; col < x; col ++){
			System.out.print("  " + (col + 1));
		}
		
		System.out.println(" ");
	}


	// creates the grid when user has selected a number
	public String[][] showGrid(String [][] grid, String [][] grid2, int x1 , int x2, int y1, int y2){

		grid [x1-1][y1-1] = grid2[x1-1][y1-1];
		grid [x2-1][y2-1] = grid2[x2-1][y2-1];
		printGrid(grid);

		if (grid2[x1 -1][y1-1] == grid2[x2-1][y2-1]){
			grid[x1-1][y1-1] = " ";
			grid[x2-1][y2-1] = " ";
		}else{
			grid[x1-1][y1-1] = "?";
			grid[x2-1][y2-1] = "?";
		}
		System.out.println("---------------------------------------");
		return grid;
	}

	// creates the instance where it sets the object's x value to
	public BoardGenerator(int x){
		this.x = x;
	
	}
}
