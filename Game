import java.util.Random;
import java.util.Scanner;

public class Lab6 {

 public static void main (String[] args){ 
    rules();
    
    //Define variable for rounds played
    int rounds = 0;
    roundPlayed(rounds);

    //Define variable for rounds that user won
    int user_win = 0;
    userPlayed(user_win);

    //Define variable for rounds that computer won
    int cpu_win = 0;
    cpuPlayed(cpu_win);
   
    Scanner input = new Scanner(System.in);
    
    System.out.println("\nLet's start!! Enter y to play and n to quit the game.");

    //Use boolean variable: True is continue, False is quit
    boolean gameChoice = choice(input);
    
    
    while (gameChoice == true) {
        
        //While true, enter the move
        System.out.print("Enter your move Skadis (s), Tjusig (t), Klyket (k), Hovolm (h), or Pershult (p): ");  
        char user_move = playMove(input); 
        char cpu_move = cpuMove();


        //Comparison
        if (user_move == cpu_move) {
          System.out.println("Both play " + user_move);
          System.out.println("It's a tie. Computer won.\n");
          cpu_win++;
        }
        else if (user_move == 's' && (cpu_move == 'h' || cpu_move == 'k')) {
          System.out.println("\n" + user_move + " beats " + cpu_move);      
          System.out.println("Congratulation. You won!\n");
          user_win++;
        }
        else if (user_move == 'p' && (cpu_move == 'k' || cpu_move == 's')) {
          System.out.println("\n" + user_move + " beats " + cpu_move); 
          System.out.println("Congratulation. You won!\n");
          user_win++;
        }
        else if (user_move == 'k' && (cpu_move == 'h' || cpu_move == 'h')) {
          System.out.println("\n" + user_move + " beats " + cpu_move);
          System.out.println("Congratulation. You won!\n");
          user_win++;
        }
        else if (user_move == 't' && (cpu_move == 'p' || cpu_move == 's')) {
          System.out.println("\n" + user_move + " beats " + cpu_move);
          System.out.println("Congratulation. You won!\n");
          user_win++;
        }
        else if (user_move == 'h' && (cpu_move == 'p' || cpu_move == 't')) {
          System.out.println("\n" + user_move + " beats " + cpu_move);
          System.out.println("Congratulation. You won!\n");
          user_win++;
        }
        else {
          System.out.println("\n" + cpu_move + " beats " + user_move);
          System.out.println("Computer won\n");
          cpu_win++;
        }
        
      //Return another rounf
      System.out.println("Would you like to play another round? Enter y to play and n to quit the game.");
      gameChoice = choice (input);
      rounds++;      
    }   
        
    //While loop decide to quit
    while (gameChoice == false) {
      System.out.println("Total rounds played: " + rounds);
      System.out.println("User won: " + user_win);
      System.out.println("Computer won: " + cpu_win);
      System.out.println("GOODBYE!");
      break;
    } 
    
 input.close();
 }
 
 //Print out the rules
 public static void rules() {
   System.out.println ("Welcome to Uppföra\n");
   System.out.println ("Game Rules:");
   System.out.print("- During each round, players choose a move which may be either: ");
   System.out.println ("Skadis (s), Tjusig (t), Klyket (k), Hovolm (h), or Pershult (p).");
   System.out.println("- Please note that you only enter the first letter of the move!");
   System.out.println ("\tPershult beats Klyket, Skadis");
   System.out.println ("\tKlyket beats Tjusig, Hovolm");
   System.out.println ("\tTjusig beats Pershult, Skadis");
   System.out.println ("\tSkadis Beats Hovolm, Klyket");
   System.out.println ("\tHovolm beats Pershult, Tjusig");
   System.out.println("- The computer wins in the event of a tie.");
 }

 //Total rounds played
 public static void roundPlayed(int a) {
   a++;
 }

 //Rounds that user won
 public static void userPlayed(int u) {
   u++;
 }

 //Rounds that computer won
 public static void cpuPlayed(int c) {
   c++;
 }
 
 //Boolean variable choice to start orr quit game
 public static boolean choice(Scanner start_game) {
     
   String choice_play_quit = start_game.nextLine().toLowerCase();

   //While loop: do not runs game until enter y/n, otherwise error
   while ((!choice_play_quit.equals("y")) && (!choice_play_quit.equals("n"))) {
     System.out.println("!!ERROR!! Please enter y or n.");
       choice_play_quit = start_game.nextLine().toLowerCase();
   }
     
   if (choice_play_quit.equals("y")) {
       return true;
   }

   else if (choice_play_quit.equals("n")) {
    return false;
   }
      
   return false;
 }

 

 //Play the move 
 private static char playMove(Scanner input) {
   String user_input = input.nextLine(); 
   //Print the first letter of the move
   char user_move = user_input.toLowerCase().charAt(0);
   //Using If Else for validate move
   if (move_validate(user_move)) {
     return user_move;
   }
   else {
     System.out.println("Invalid move. Try again");
     System.out.print("Enter your move Skadis (s), Tjusig (t), Klyket (k), Hovolm (h), or Pershult (p): ");
     playMove(input);
   }
   return user_move;
 }

 //Boolean variable move_validate: True = validate, False = invalidate
 public static boolean move_validate(char i) {
   while (i=='s' || i=='t' || i=='k' || i=='h' || i=='p') {
      if (i=='s') {
         System.out.println("\nUser's move: skadis");
      }
      else if (i=='t') {
         System.out.println("\nUser's move: tjusig");
      }
      else if (i=='k') {
         System.out.println("\nUser's move: klyket");
      }
      else if (i=='h') {
         System.out.println("\nUser's move: hovolm");
      }
      else if (i=='p') {
         System.out.println("\nUser's move: pershult");
      }
    return true;
      
   }
   return false;
 }


 //Generate computer randomly move
 public static char cpuMove() {
   String computerMove ="";
   Random move = new Random();
   int number = move.nextInt(4);
   switch(number){ 
	         case 0 :
	        	 computerMove = "skadis";
	        	 break;
	         case 1 :
	        	 computerMove = "tjusig";
	        	 break;
	         case 2 :
	        	 computerMove = "klyket";
	        	 break;
	         case 3 :
	        	 computerMove = "hovolm";
	        	 break;
	         case 4 :
	        	 computerMove = "pershult";
	        	 break;    
	  }

   char cpu_move = computerMove.charAt(0);

    if (cpu_move == 's') {
     System.out.println("Computer's move: skadis");
    }
    else if (cpu_move == 't') {
     System.out.println("Computer's move: tjusig");
    }
    else if (cpu_move == 'k') {
     System.out.println("Computer's move: klyket");
    }
    else if (cpu_move == 'h') {
     System.out.println("Computer's move: hovolm");
    }
    else if (cpu_move == 'p') {
     System.out.println("Computer's move: pershult");
    }

   return cpu_move;
 } 
}

