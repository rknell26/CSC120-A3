
import java.util.Scanner;

class Conversation {



  public static void main(String[] arguments) {
    int rounds;
    Scanner in;
    int thisRound = 0;
    String line;
    //String[] words;

 
    in = new Scanner(System.in);
    System.out.print("How many rounds do you want to chat for? ");
    rounds = in.nextInt();
    System.out.println("Greetings, earthling! What's on your mind? ");

    
    while (rounds != thisRound) {
      //words = new String[0];
      line = in.nextLine();
      //words = line.split(" ");
      thisRound += 1;
    }
    
  

    }


    
  }


