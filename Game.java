
import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
      public static void main(String arg[])
      {
      System.out.print("\u000C");
      //Intialize an input scanner
      Scanner user_input = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Stranger: Welcome to your adventure, Mr um. Tell me, what is your name, son?");
      // define variables
      String name;
      String answer1;
      String Riddle1;
      String Riddle2;
      String Riddle3;
      String Decoder1;
      String FinalStage;
      name = user_input.next();
      System.out.println("You: My name is " + name);
      System.out.println("Stranger: Ah of course how could I forget such a nice name as " + name + "!");
      System.out.println("Stranger: Well Mr. " + name + ". " + "Would you like to go on a quest?");
      System.out.println("Narrator: Type yes to continue or anything else to stop playing!");
      // define intergers as input variable
      answer1 = user_input.next();
      System.out.println("Narrator: You have chosen " + answer1);
     if (answer1.equals("yes") || (answer1.equals("Yes")))
     {
     System.out.println("Stranger: Fantastic! We are going to fight the Ice Wizard at the Snow Castle! Let's head off!");
     System.out.println("Stranger: *4 hours later* Whew! That was a long walk! Glad no one else is here to watch that!");
     System.out.println("Stranger: But here we are Mr. " + name + "! The Snow Castle!");   
     System.out.println("Ice Wizard: Well well well, if it isn't my brother, The Nice Wizard? Come to try and stop me again? I see you've brought another soul for me to consume in the ice. How thoughtful.");
     System.out.println("Nice Wizard: Brother, me and " + name + " have come to put an end to your evil ways! We will destroy you!");
     System.out.println("Ice Wizard: Well if you want to kill me, then you better go through my 3 stages to get to me");
     System.out.println("Nice Wizard: Well ok then! Come on " + name + "! Let's go kill my evil brother!");
     System.out.println("Narrator: You walk into the castle and stage 1 appears!");
     System.out.println("Ice Wizard: The first stage is a series of riddles! The first riddle is \"What word of five letters has only one left when two letters are removed?\"");
     Riddle1 = user_input.next();
        while (!Riddle1.equals("stone"))
        {
              System.out.println("That is not the correct answer. Please try again.");
              Riddle1 = user_input.next();
            }
        if (Riddle1.equals("stone"))
            {
              System.out.println("CORRECT! You may move on.");
              System.out.println("Ice Wizard: So you're smarter than you look! Only a small number of people have been able to get through my first riddle! Well, I'll leave you for the rest of the stage. If you die, well, I don't care.");
              System.out.println("Narrator: The second riddle is \"Where can you finish a book without finishing a sentence\"");
              Riddle2 = user_input.next();
            
        while (!Riddle2.equals("prison"))
          {
             System.out.println("That is not the correct answer. Please try again.");
             Riddle2 = user_input.next();
          }
          if (Riddle2.equals("prison"))
          {
              System.out.println("CORRECT! You may move on.");
              System.out.println("Narrator: The third riddle is \"What spends all the time on the floor but never gets dirty?\"");
              Riddle3 = user_input.next();
          while (!Riddle3.equals("your_shadow"))
          {
              System.out.println("That is not the correct answer. Please try again.");
              Riddle3 = user_input.next();
          }
              
            if (Riddle3.equals("your_shadow"))
            {
              System.out.println("CORRECT! You have passed stage 1.");
              System.out.println("Nice Wizard: Congratulations, you are the first person to pass stage 1! Now we have moved on to stage 2, " + name);
                  System.out.println("Nice Wizard: Now, stage 2 is a decoder! We must decode this sign and then type in the correct answer! But if you need a hint, I can cast a spell to give us a hint on how to solve it");
                  System.out.println("Narator: The sign states: 5|20|8|1|25|_|1|18|20|1|25|_|9|20|19|8|1|25|");
                  Decoder1 = user_input.next();
             while (!Decoder1.equals("the_dart_hits"))
             {
                  if (Decoder1.equals("hint"))
                  {
                      System.out.println("Don't feel bad you had to use the hint. It was probably impossible for you to get it without the hint");
                      System.out.println("Translate the numbers to letters then translate those letters from pig latin to english");
                      Decoder1= user_input.next();
                  } else
                  {
                  System.out.println("Wrong answer");
                  Decoder1 = user_input.next();
                  }
             }
             System.out.println("CORRECT! You have passed stage 2.");
                } 
                }
            }
        }else
        {
         System.out.println("Narrator: Since you didn't type yes, guess the adventure is over! Until we meet again Mr. " + name);
         System.out.println("GAME OVER!");
        }
    

}
}



        
    




