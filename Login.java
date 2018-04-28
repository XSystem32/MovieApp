import java.io.*;
import java.util.Scanner; 

public class Login {


public Login() throws FileNotFoundException {


Scanner scan = new Scanner (new File("user.txt"));

    
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine();
    String pass = scan.nextLine(); 
    
    System.out.print("Username: ");
    String inpUser = keyboard.nextLine();
    System.out.print("password: ");
    String inpPass = keyboard.nextLine(); 

    if (inpUser.equals(user) && inpPass.equals(pass)) {
        System.out.print("Welcome " + user + "\n");
        new Movies();
    } else {
        System.out.print("Could not log in - Try again \n");
        new Login();
    }
    }

   



}