public class PlayGame{
	
	

private String[][] randomGrid;
private String[][] gameGrid;



public void initBoard(){
	ConditionWon win = new ConditionWon();
	validation valid = new validation();
	Input start = new Input();
	int size = 0;
	boolean gameWon = false;
  

	
	
  String difficult = start.startInput();
  if (valid.userValidStart(difficult) == true){
	  size = 2 * Integer.parseInt(difficult);
  }else{
    initBoard();
  }
  
  
  CPUmove ai = new CPUmove(size);
  BoardGenerator grid = new BoardGenerator(size);
  randomGrid = grid.createRandom();
  gameGrid = grid.createGrid();
  Input user = new Input(gameGrid,size);
  
  
  
  System.out.println("Welcome to Matching Game!");
  grid.printGrid(gameGrid);
  
  

  while(!gameWon){
  
  System.out.println("HUMAN MOVE");
	  
  int [] coords = user.getList();
  int x1 = coords[0];
  int y1 = coords[1];
  int x2 = coords[2];
  int y2 = coords[3];
  
  
  
  
  gameGrid = grid.showGrid(gameGrid,randomGrid, x1, x2, y1, y2);
  grid.printGrid(gameGrid);
  
  
   if (win.winCondition(gameGrid, size)){
	  gameWon = true;
	  System.out.println("You win!");
  }
  
 // int [] cpucoords = ai.computerRandom();
  //x1 = cpucoords[0];
  //y1 = cpucoords[1];
  //x2 = cpucoords[2];
  //y2 = cpucoords[3];
  
  //System.out.println(" ");
  //System.out.println("CPU MOVE");
  //gameGrid = grid.showGrid(gameGrid,randomGrid, x1, x2, y1, y2);
  //grid.printGrid(gameGrid);
  
  //if (win.winCondition(gameGrid, size)){
	 // gameWon = true;
	//  System.out.println("You win!");
 // }
  
  
  		}
	}
}


