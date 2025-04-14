import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
     static int range=50;
   
    public static void main(String[] args) {
        System.out.print("Enter Dificulty Level 1/2/3 :");
        int level = sc.nextInt();
        
        if (level==1) {
            range = 50;
        }
        else if (level == 2){
            range = 100;
        }
        else if (level == 3){
            range = 500;
        }
        else{
            System.out.println("Please!enter level between 1 to 3");
            System.exit(0);
        }
   

        Random rand = new Random();
        int randNumber = rand.nextInt(range)+1;
      System.out.println("");
        System.out.println("====================================Enter a Random Number upto "+ range+ " ====================================");
       int attempts =0;
    while (true) {
       
        System.out.print("Enter your guess: ");
        int a = sc.nextInt();
     
        attempts++;
      

       if (randNumber == a) {
        System.out.println("");
        System.out.println("Hurray! you WON,You gussed in " +attempts+" attempts" );
        break;
       }
       else{
        if (a>randNumber) {
            System.out.println("guess is too high");
        }
        else
         System.out.println("guess is too low");
        
       }

      
       if (attempts>9) {
        System.out.println("");
        System.out.println("Oops! You've used all your attempts.You lost!");
        System.out.println("Thanks for playing!Hope you had fun!");  
        break;  
    }

    }
       
    }  
}
