import java.util.Scanner;

public class Input{
	
	

String[][] grid;
Scanner keyboard = new Scanner(System.in);

private String difficulty = "Please select your dificulty for the Memory Game";
private String startMenu = "1) Easy\n2) Medium\n3) Hard";
private String menu1 = "Please select the first row and column you would like to flip";
private String menu2 = "Please select the second row and column you would like to flip";
public int[] values = new int[4];
public int x;


public Input(){
	this.x = 0;
}

public Input(String[][] grid,int x){
	this.grid = grid;
	this.x = x;
}

public String startInput(){

  System.out.println(difficulty);
  System.out.println(startMenu);
  System.out.print("Choice: ");
  String difficulty = keyboard.nextLine();

  return difficulty;
}



public void menuInput1(String[][] grid){
  boolean validity = true;
  int x1 = 0;
  int y1 = 0;
  validation valid = new validation();
  // method to recieve the FROM values
  // until the user enters a valid coordinate, the loop will continue
  while(validity){
  System.out.println(menu1);
  System.out.print("Row 1: ");
  String a = keyboard.nextLine();
  if (valid.userValidMenu(a,x) == true){
     x1 = Integer.parseInt(a);
    System.out.print("Col 1: ");
    String b = keyboard.nextLine();
    if (valid.userValidMenu(b,x) == true){
      y1 = Integer.parseInt(b);
      if(valid.checkForBlanks(grid, x1, y1) == true){
      validity = false;
      }
    }
  }
 } 
    values[0] = x1;
    values[1] = y1;
}




// method to recieve the TO values
public void menuInput2(){
  boolean validity = true;	
  validation valid = new validation();
  int x2 = 0;
  int y2 = 0;
  while(validity){
  System.out.println(menu2);
  System.out.print("Row 2; ");
  String row2 = keyboard.nextLine();
  if (valid.userValidMenu(row2,x) == true){
    x2 = Integer.parseInt(row2);
    System.out.print("Col 2; ");
    String col2 = keyboard.nextLine();
    if (valid.userValidMenu(col2,x) == true){
    y2 = Integer.parseInt(col2);
    validity = false;
    }
  }
 }



// encapsulating the coordinates of the first and second cards flipped
  values[2] = x2;
  values[3] = y2;
}


	public int[] getList(){
		menuInput1(grid);
		menuInput2();
		return values;
	}


  // method to get the difficulty from the user
  public int getValue(String difficult){
    if (difficult == "1"){
      return 2;
    }else if(difficult == "2"){
      return 4;
    }else if(difficult == "3"){
      return 6;
    }else{
    	return 0;
    }
  }
}
