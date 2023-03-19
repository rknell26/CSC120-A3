import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * Contains all code for the chatbot
 */

class Conversation {

  /**
   * Iniates, controls, and terminates a chatbot conversation
   * @param args The command line arguments (ignored)
   */

  public static void main(String[] arguments) {
    int rounds;
    Scanner in ;
    Scanner in2;
    int thisRound = 0;
    String line;
    String[] words;
    String[] transcript;
    ArrayList < String > responses = new ArrayList < String > ();
    String newLine;
    int thisLine = 0;
    Random randResponse;
    int index;
    int mirrorNum = 0;

    responses.add("Ah");
    responses.add("Mm-hm");
    responses.add("Hmm");
    responses.add("Yeah?");
    responses.add("Yeah");

    in = new Scanner(System.in);
    in2 = new Scanner(System.in);
    System.out.print("How many rounds do you want to chat for? ");
    rounds = in.nextInt();
    transcript = new String[2 * rounds];
    System.out.println("Greetings, earthling! What's on your mind?");

    while (rounds != thisRound) { //START WHILE LOOP
      newLine = new String(""); // the line that the computer responds with (includes mirrored words)
      words = new String[0]; // empty array to hold the words in user's line
      line = in2.nextLine();
      transcript[thisLine] = line; // adds user's current line to the transcript (starting from line 0)
      thisLine += 1; // increases the current line number by 1
      words = line.split(" "); // splits the line into words, adds those words to the words array
      mirrorNum = 0;

      for (String item: words) { // if any keywords are in user's line, mirrorNum becomes > 0
        if (item.equals("I") || item.equals("me") || item.equals("am") ||
          item.equals("you") || item.equals("my") || item.equals("your")) {
          mirrorNum += 1;
        }
      }

      if (mirrorNum > 0) { //Start if statement
        // changes every keyword, creates mirrored response to user
        for (String word: words) { //Start for loop
          if (word.equals("I")) {
            System.out.print("you ");
            newLine += "you ";
          } else if (word.equals("me")) {
            System.out.print("you ");
            newLine += "you ";
          } else if (word.equals("am")) {
            System.out.print("are ");
            newLine += "are ";
          } else if (word.equals("you")) {
            System.out.print("I ");
            newLine += "I ";
          } else if (word.equals("my")) {
            System.out.print("your ");
            newLine += "your ";
          } else if (word.equals("your")) {
            System.out.print("my ");
            newLine += "my ";
          } else {
            System.out.print(word + " ");
            newLine += word + " ";
          }

        } //End for loop
      } //End if statement
      else { // if no key words in user's line (MirrorNum=0):

        randResponse = new Random();
        index = randResponse.nextInt(responses.size());
        System.out.print(responses.get(index));
        newLine += responses.get(index);
      }

      thisRound += 1;
      transcript[thisLine] = newLine;

      thisLine += 1;
      System.out.println("");

    } //END WHILE LOOP

    System.out.println("Goodbye now!");

    System.out.println("");
    System.out.println("");
    System.out.println("TRANSCRIPT:");
    System.out.println("Greetings, earthling! What's on your mind?");
    printScript(transcript);
    System.out.println("Goodbye now!");

    in.close();
    in2.close();

  }

  /**
   * Prints the text inside the transcript array
   * @param transcript
   */

  public static void printScript(String[] transcript) {
    int thisScriptLine = 0;
    while (thisScriptLine != transcript.length) {
      System.out.println(transcript[thisScriptLine]);
      thisScriptLine += 1;
    }
  }

}