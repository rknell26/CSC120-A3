
import java.util.Scanner;

class Conversation {



  public static void main(String[] arguments) {
    int rounds;
    Scanner in;
    int thisRound = 0;
    String line;
    String[] words;

 
    in = new Scanner(System.in);
    System.out.print("How many rounds do you want to chat for? ");
    rounds = in.nextInt();
    System.out.println("Greetings, earthling! What's on your mind?");

    
    while (rounds + 1 != thisRound) {
      words = new String[0];
      line = in.nextLine();
      words = line.split(" "); 

      for (String word : words) {
        if (word.equals("I")) {
          System.out.print("you ");
        } 
        else if (word.equals("me")) {
          System.out.print("you ");
        } 
        else if (word.equals("am")) {
          System.out.print("are ");
        } 
        else if (word.equals("you")) {
          System.out.print("I ");
        } 
        else if (word.equals("my")) {
          System.out.print("your ");
        } 
        else if (word.equals("your")) {
          System.out.print("my ");
        }
        else {
          System.out.print(word + " ");
        }
            

        }
        
      System.out.println("");      
      thisRound += 1;
      
      }
    

    }


    
  }


