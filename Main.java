import java.util.*;
import java.io.*;


public class Main  {

  public void display_menu() {
    System.out.println ( "\n1) Login \n2) Sign up \n3) Exit" );
    System.out.print ( "Selection: " );
  }
  
  public Main() throws FileNotFoundException{
    Scanner in = new Scanner ( System.in );
    
    display_menu();
    switch ( in.nextInt() ) {
      case 1:
        System.out.println ( "Please log in" );
        new Login();
        break;
      case 2:
        System.out.println ( "" );
        break;
      default:
        System.err.println ( "Unrecognized option" );
        new Main();
        break;
    }
  }
  
  public static void main (String[] args) throws FileNotFoundException  {
    new Main();

  }
  

}