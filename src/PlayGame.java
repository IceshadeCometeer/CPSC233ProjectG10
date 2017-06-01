public class PlayGame{


private int size;
public int x1;
public int x2;
public int y1;
public int y2;
private String[][] randomGrid;
private String[][] gameGrid;



public void initBoard(){
  validation valid = new validation();
  Input user = new Input();
  Condition win = new Condition();

  String difficult = user.startInput();
  if (valid.userValidStart(difficult) == true){
    size = user.getValue(difficult);
  }else{
    initBoard();
  }
  BoardGenerator grid = new BoardGenerator(size);

  randomGrid = grid.createRandom();
  gameGrid = grid.createGrid();

do{
  int [] coords = user.menuInput2();
  x1 = coords [0];
  y1 = coords [1];
  x2 = coords [2];
  y2 = coords [3];

  grid.showGrid(gameGrid,randomGrid, x1, x2, y1, y2);
}  while (win.winCondition(gameGrid,size )== false);


}
}
