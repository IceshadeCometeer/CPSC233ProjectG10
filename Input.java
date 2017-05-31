import java.util.Scanner;

public class Input{

Scanner keyboard = new Scanner(System.in);

private String difficulty = "Please select your dificulty for the Memory Game";
private String startMenu = "1) Easy\n2) Medium\n3) Hard";
private String menu1 = "Please select the first row and column you would like to flip";
private String menu2 = "Please select the second row and column you would like to flip";
public int[] values = new int[4];

public String startInput(){

  System.out.println(difficulty);
  System.out.println(startMenu);
  System.out.print("Choice: ");
  String difficulty = keyboard.nextLine();

  return difficulty;
}



public void menuInput1(){
  validation valid = new validation();
  // method to recieve the FROM values
  System.out.println(menu1);
  System.out.print("Row 1: ");
  String a = keyboard.nextLine();
  if (valid.userValidMenu(a) == true){
    int x1 = user.parseInt(a);
    System.out.print("Col 1: ");
    String b = keyboard.nextLine();
    if (valid.userValidMenu(b) == true){
      int y1 = Integer.parseInt(b);
    }else{
      menuInput();
    }
  } else{
    menuInput1();
  }
    values[0] = x1;
    values[1] = x2;
}




// method to recieve the TO values
public int [] menuInput2(){
  menuInput1();
  System.out.println(menu2);
  System.out.print("Row 2; ");
  String cat = keyboard.nextLine();
  if (valid.userValidMenu(cat) == true){
    int x2 = user.parseInt(a);
    System.out.print("Col 2; ");
    String d = keyboard.nextLine();
    if (valid.userValidMenu(d) == true){
    int x1 = user.parseInt(d);
  }else{
    menuInput2();
    }
  }else{
    menuInput2();
  }




// encapsulating the coordinates of the first and second cards flipped
  values[2] = x2;
  values[3] = y2;
  return values;
}


  // method to get the difficulty from the user
  public int getValue(String difficult){
    if (difficult == "1"){
      return 2;
    }else if(difficult == "2"){
      return 4;
    }else{
      return 6;
    }
  }
}
