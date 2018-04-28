import java.util.*;

class Movies {
  public void display_movies() {
    System.out.println ( "1) Watch a movie \n2) My Favorites \n3) Search a movie \n4) Add movie to favorites" );
    System.out.print ( "Selection: " );
  }
  
  
  public Movies() {
  
  
    Scanner in = new Scanner ( System.in );
    
    display_movies();
    switch (in.nextInt()) {
      case 1:
        System.out.println ( "1) Titanic \n 2) Interstellar \n 3) Brave heart \n 4) No Country For Old Man:" );
        new Options();
        break;
      case 2:
        System.out.println (" 1) Seven \n 2) Silence \n 3) The Last Kingdom \n 3) ");
        new Options();
        break;
      case 3:
        System.out.println ( "" );
        new Options();
      case 4:
       System.out.println ( "" );
       new Options();
      default:
        System.err.println ( "" );
        new Movies();
        break;
    
  }
  
}
 
    public class Options{
    
    public void display_options() {
      // System.out.println ( "1) Titanic \n2) Interstellar \n3) Brave heart \n4) No Country For Old Man" );
       //System.out.print ( "Selection: " );    
     }
     
        public Options() {
          Scanner in = new Scanner (System.in);
          
          display_options();
          switch (in.nextInt()) {
            case 1:
              System.out.println ( "Movies:" ); 
              break;
            case 2:
              System.out.println ( "ded" );
              break;
            case 3:
              System.out.println ( "You picked option 3" );
            case 4:
             System.out.println ( "You picked option 4" );
            default:
              System.err.println ( "Unrecognized option" );
              
              new Options();
              break;
          }
        }
   
   
   
   }
    } 