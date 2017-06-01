public class Condition{

  public int count = 0;

  public boolean winCondition(String[][] grid, int x){
    for (int row = 0; row < x; row ++){
      for (int col = 0; col < x; col ++){
        //if (grid == " "){
        if((grid[row][col] == " ") && (grid[row][col++] == " ")
        && (grid[row++][col] == " ")){
          count += 1;
        }
      }
    }
    if (count == x*x){
      return true;
    }else{
      return false;
    }
  }
}
