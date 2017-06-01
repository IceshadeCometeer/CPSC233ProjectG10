public class validation{



  public boolean userValidStart(String input){
    if (input.length() > 1 || input.length() < 1){
      System.out.println("Please enter a valid number");
      }
    for(int count = 0; count < input.length();count++){
      if (Character.isDigit(input.charAt(count))){
        int num = Integer.parseInt(input);
          if (num < 4 && num > 0){
          return true;
        }
      }
    }
    return false;
  }



  public boolean userValidMenu(String input, int x){
    if(input.length() == 1){
      if (Character.isDigit(input.charAt(0))){
        int num = Integer.parseInt(input);
        if (num <= x && num > 0){
            return true;
          }else{
        System.out.println("Can you just enter some in-bound numbers?");
        }
      }else{
      System.out.println("Why don't you just enter a number like I kindley asked you to");
      }
    }
    return false;
  }

  public boolean checkForBlanks(String[][] grid, int x, int y){
    if (grid[x-1][y-1] == " "){
    	System.out.println("The box is gone!");
    	return false;
    }
    return true;
  }
}