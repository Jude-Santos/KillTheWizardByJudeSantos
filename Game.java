
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
       String PlayAgain;
       PlayAgain = "game";
       while (PlayAgain.equals("game"))
       {
           System.out.print("\u000C");
           Scanner user_input = new Scanner(System.in);
           Random rand = new Random();
           System.out.println("Stranger: Welcome to your adventure, Mr um. Tell me, what is your name, son?");
           Random Dagger = new Random();
           Random Flame = new Random();
           Random Sword = new Random();
           Random Axe = new Random();
           int WizardHealth = 200;
           int PlayerHealth = 200;
           int Choose;
           int MaxNumber = 4;
           String Attack;
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
           answer1 = user_input.next();
           System.out.println("Narrator: You have chosen " + answer1);
           if (answer1.equals("yes") || (answer1.equals("Yes")))
           {
               System.out.println("Stranger: Fantastic! We are going to fight The Ice Wizard at the Snow Castle! Let's head off!");
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
                     System.out.println("If your answer is multiple words, please put a _ between each word.");
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
                                  System.out.println("Ice Wizard: The spell is saying to translate the numbers to letters then translate those letters from pig latin to english");
                                  Decoder1= user_input.next();
                              } 
                              else
                              {
                                  System.out.println("Wrong answer");
                                  Decoder1 = user_input.next();
                              }
                         }
                         } 
                  }
               }
                         PlayAgain = "wizard";
                         while (PlayAgain.equals("wizard"))
                         {
                             System.out.print("\u000C");
                             int RandomWizard = rand.nextInt(4);
                         System.out.println("CORRECT! You have passed stage 2.");
                         System.out.println("Now it is time for you to face The Ice Wizard! The Ice Wizard will have a different weapon and a type of armor. You will have the option to choose what armor and weapon you would like.");
                         System.out.println("You will both have 200 health and be dealing damage to one another using your weapons.");
                         System.out.println("To know what each weapon and armor does here is a list: Reinforced Steel Armor reduces damage by 80%");
                         System.out.println("Steel Armor reduces damage by 50%");
                         System.out.println("Picked Axes reduces damage by 30% and will deal 35-65 damage");
                         System.out.println("Offensive shields reduces damage by 20% and will deal 20-50 damage");
                         System.out.println("Dagger will deal 40-70 damage");
                         System.out.println("Sword will deal 60-90 damage");
                         System.out.println("Flamethrower will deal 70-100 damage"); 
                         System.out.println("Plasma gun will deal 90-120 damage");
                     
               if (RandomWizard == 1)
               {
                   System.out.println("The Ice Wizard has Reinforced Steel Armor and a dagger");
                   System.out.println("You have 4 options.");
                   System.out.println("Type 1 for Reinforced Steel Armor and a dagger");
                   System.out.println("Type 2 for a flamethrower");
                   System.out.println("Type 3 for Steel Armor and a sword");
                   System.out.println("Type 4 for 2 Picked Axes");
                   Choose = user_input.nextInt();
           while (Choose != 1 && Choose != 2 && Choose != 3 && Choose != 4) 
           {
              System.out.println("That is not a valid option. Please try again.");
              Choose = user_input.nextInt();
           }
           if (Choose == 1)
           {
               System.out.println("You have chosen package 1. You now get Reinforced Steel Armor and a dagger");
               System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
               Attack = user_input.next();
               while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response."); 
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinDagger = 40;
                  int RandomDD = rand.nextInt(30) + MinDagger;
                  int RandomWDD = rand.nextInt(30) + MinDagger;
                  WizardHealth -= RandomDD *.2;
                  PlayerHealth -= RandomWDD *.2;
                  System.out.println("You dealt " + RandomDD + " damage to The Ice Wizard! But with The Ice Wizard's Reinforced Steel Armor, he reduces the damage by 80%");
                  System.out.println("So now, with the damage reduction, you deal " + RandomDD*.2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWDD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 80%");
                  System.out.println("So now, with the damage reduction, he deals " + RandomWDD*.2 + " damage. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                     System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                     System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                     Attack = "yes";
                     PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again? Wanna play again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 2)
          {
              System.out.println("You have chosen package 2. You now get a flamethrower");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response."); 
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinFlame = 70;
                  int MinDagger = 40;
                  int RandomFlame = rand.nextInt(30) + MinFlame;
                  int RandomWiDamage = rand.nextInt(30) + MinDagger;
                  WizardHealth-=RandomFlame*.2;
                  PlayerHealth -= RandomWiDamage;
                  System.out.println("You dealt " + RandomFlame + " damage to The Ice Wizard! But with The Ice Wizard's Reinforced Steel Armor, he reduces the damage by 80%");
                  System.out.println("So now, with the damage reduction, you deal " + RandomFlame*.2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWiDamage + " damage to you. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                     System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                     System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                     Attack = "yes";
                     PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 3)
          {
              System.out.println("You have chosen package 3. You now get Steel Armor and a sword");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinSword = 60;
                int MinDagger = 40;
                int RandomSword = rand.nextInt(30) + MinSword;
                int RandomSwordD = rand.nextInt(30) + MinDagger;
                WizardHealth-=RandomSword*.2;
                PlayerHealth -= RandomSwordD/2;
                System.out.println("You dealt " + RandomSword + " damage to The Ice Wizard! But with The Ice Wizard's Reinforced Steel Armor, he reduces the damage by 80%");
                System.out.println("So now, with the damage reduction, you deal " + RandomSword*.2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomSwordD + " damage to you. But with your Steel Armor, you reduce the damage by 50%");
                System.out.println("So now, with the damage reduction, he deals " + RandomSwordD/2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                   Attack = user_input.next();
                }
              }
          }
          else if (Choose == 4)
          {
              System.out.println("You have chosen package 4. You now get 2 Picked Axes");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response."); 
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinAxe = 35;
                int MinDagger = 40;
                int RandomAxe = rand.nextInt(30) + MinAxe;
                int RandomAxeD = rand.nextInt(30) + MinDagger;
                PlayerHealth -= RandomAxeD *.7;
                WizardHealth-=RandomAxe*.2;
                System.out.println("You dealt " + RandomAxe + " damage to The Ice Wizard! But with The Ice Wizard's Reinforced Steel Armor, he reduces the damage by 80%");
                System.out.println("So now, with the damage reduction, you deal " + RandomAxe*.2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomAxeD + " damage to you. But with your Picked Axes, you reduce the damage by 30%");
                System.out.println("So now, with the damage reduction, he deals " + RandomAxeD*.7 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
              }
          }
    }
    else if (RandomWizard == 2)
    {
          System.out.println("The Ice Wizard has Steel Armor and a sword");
          System.out.println("You have 4 options.");
          System.out.println("Type 1 for Reinforced Steel Armor but a weak dagger");
          System.out.println("Type 2 for a flamethrower");
          System.out.println("Type 3 for Steel Armor and a decent sword");
          System.out.println("Type 4 for 2 Picked Axes");
          Choose = user_input.nextInt();
          while (Choose != 1 && Choose != 2 && Choose != 3 && Choose != 4) 
          {
              System.out.println("That is not a valid option. Please try again.");
              Choose = user_input.nextInt();
          }
          if (Choose == 1)
          {
              System.out.println("You have chosen package 1. You now get Reinforced Steel Armor and a dagger");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response."); 
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinDagger = 40;
                int MinSword = 60;
                int RandomDD = rand.nextInt(30) + MinDagger;
                int RandomWDD = rand.nextInt(30) + MinSword;
                WizardHealth -= RandomDD/2;
                PlayerHealth -= RandomWDD*.2;
                System.out.println("You dealt " + RandomDD + " damage to The Ice Wizard! But with The Ice Wizard's Steel Armor, he reduces the damage by 50%");
                System.out.println("So now, with the damage reduction, you deal " + RandomDD/2 + " damage. Now The Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWDD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 80%");
                System.out.println("So now, with the damage reduction, he deals " + RandomWDD*.2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                   Attack = user_input.next();
                }
              }
          }
          else if (Choose == 2)
          {
              System.out.println("You have chosen package 2. You now get a flamethrower");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinFlame = 70;
                int MinSword = 60;
                int RandomFlame = rand.nextInt(30) + MinFlame;
                int RandomWiDamage = rand.nextInt(30) + MinSword;
                WizardHealth-=RandomFlame/2;
                PlayerHealth -= RandomWiDamage;
                System.out.println("You dealt " + RandomFlame + " damage to The Ice Wizard! But with The Ice Wizard's Steel Armor, he reduces the damage by 50%");
                System.out.println("So now, with the damage reduction, you deal " + RandomFlame/2 + " damage. Now The Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWiDamage + " damage to you. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                   Attack = user_input.next();
                }
              }
          }
          else if (Choose == 3)
          {
              System.out.println("You have chosen package 3. You now get Steel Armor and a sword");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinSword = 60;
                int RandomSword = rand.nextInt(30) + MinSword;
                int RandomSwordD = rand.nextInt(30) + MinSword;
                WizardHealth-=RandomSword/2;
                PlayerHealth -= RandomSwordD /2;
                System.out.println("You dealt " + RandomSword + " damage to The Ice Wizard! But with The Ice Wizard's Steel Armor, he reduces the damage by 50%");
                System.out.println("So now, with the damage reduction, you deal " + RandomSword/2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomSwordD + " damage to you. But with your Steel Armor, you reduce the damage by 50%");
                System.out.println("So now, with the damage reduction, he deals " + RandomSwordD/2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                   Attack = user_input.next();
                }
              }
          }
          else if (Choose == 4)
          {
              System.out.println("You have chosen package 4. You now get 2 Picked Axes");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinAxe = 35;
                int MinSword = 60;
                int RandomAxe = rand.nextInt(30) + MinAxe;
                int RandomAxeD = rand.nextInt(30) + MinSword;
                PlayerHealth -= RandomAxe*.8;
                WizardHealth-=RandomAxeD/2;
                System.out.println("You dealt " + RandomAxe + " damage to The Ice Wizard! But with The Ice Wizard's Steel Armor, he reduces the damage by 50%");
                System.out.println("So now, with the damage reduction, you deal " + RandomAxe/2 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomAxe + " damage to you. But with your Picked Axes, you reduce the damage by 20%");
                System.out.println("So now, with the damage reduction, he deals " + RandomAxeD*.8 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                    System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
              }
          }
        }
        else if (RandomWizard == 3)
        {
            System.out.println("The Ice Wizard has a flamethrower! Not sure why an ICE Wizard is using a FLAMEthrower");
            System.out.println("You have 4 options.");
            System.out.println("Type 1 for Reinforced Steel Armor but a weak dagger");
            System.out.println("Type 2 for a flamethrower");
            System.out.println("Type 3 for Steel Armor and a decent sword");
              System.out.println("Type 4 for 2 Picked Axes");
              Choose = user_input.nextInt();
              while (Choose != 1 && Choose != 2 && Choose != 3 && Choose != 4) 
          {
             System.out.println("That is not a valid option. Please try again.");
             Choose = user_input.nextInt();
          }
          if (Choose == 1)
          {
              System.out.println("You have chosen package 1. You now get to have Reinforced Steel Armor and a dagger");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response."); 
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinDagger = 40;
                  int MinFlame = 70;
                  int RandomDD = rand.nextInt(30) + MinDagger;
                  int RandomWDD = rand.nextInt(30) + MinFlame;
                  WizardHealth -= RandomDD;
                  PlayerHealth -= RandomWDD *.2;
                  System.out.println("You dealt " + RandomDD + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWDD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 80%");
                  System.out.println("So now, with the damage reduction, he deals " + RandomWDD*.2 + " damage. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 2)
          {
              System.out.println("You have chosen package 2. You now get a flamethrower");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinFlame = 70;
                int RandomFlame = rand.nextInt(30) + MinFlame;
                int RandomWiDamage = rand.nextInt(30) + MinFlame;
                WizardHealth-=RandomFlame;
                PlayerHealth -= RandomWiDamage;
                System.out.println("You dealt " + RandomFlame + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWiDamage + " damage to you. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
              }
          }
          else if (Choose == 3)
          {
              System.out.println("You have chosen package 3. You now get Steel Armor and a sword");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response.");
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinSword = 60;
                int MinFlame = 70;
                int RandomSword = rand.nextInt(30) + MinSword;
                int RandomSwordD = rand.nextInt(30) + MinFlame;
                WizardHealth-=RandomSword;
                PlayerHealth -= RandomSwordD/2;
                System.out.println("You dealt " + RandomSword + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomSwordD + " damage to you. But with your Steel Armor, you reduce the damage by 50%");
                System.out.println("So now, with the damage reduction, he deals " + RandomSwordD/2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
              }
          }
          else if (Choose == 4)
          {
              System.out.println("You have chosen package 4. You now get 2 Picked Axes");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                 System.out.println("Narrator: Please type in a valid response."); 
                 Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                int MinAxe = 35;
                int MinFlame = 70;
                int RandomAxe = rand.nextInt(30) + MinAxe;
                int RandomAxeD = rand.nextInt(30) + MinFlame;
                PlayerHealth -= RandomAxe *.8;
                WizardHealth-=RandomAxe;
                System.out.println("You dealt " + RandomAxe + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomAxe + " damage to you. But with your Picked Axes, you reduce the damage by 20%");
                System.out.println("So now, with the damage reduction, he deals " + RandomAxe*.8 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
              }
          }
    }
     else if (RandomWizard == 4)
    {
        System.out.println("The Ice Wizard has 2 offensive shields");
        System.out.println("You have 4 options.");
        System.out.println("Type 1 for Reinforced Steel Armor but a weak dagger");
        System.out.println("Type 2 for a flamethrower");
        System.out.println("Type 3 for Steel Armor and a decent sword");
        System.out.println("Type 4 for 2 Picked Axes");
        Choose = user_input.nextInt();
        while (Choose != 1 && Choose != 2 && Choose != 3 && Choose != 4) 
        {
           System.out.println("That is not a valid option. Please try again.");
           Choose = user_input.nextInt();
        }
        if (Choose == 1)
        {
            System.out.println("You have chosen package 1. You now get to have Reinforced Steel Armor and a dagger");
            System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
            Attack = user_input.next();
            while (!Attack.equals("attack"))
            {
                System.out.println("Narrator: Please type in a valid response.");
                Attack = user_input.next();
            }
            while (Attack.equals("attack"))
            {
                int MinDagger = 40;
                int MinShield = 20;
                int RandomDD = rand.nextInt(30) + MinDagger;
                int RandomWDD = rand.nextInt(30) + MinShield;
                WizardHealth -= RandomDD*.8;
                PlayerHealth -= RandomWDD *.2;
                System.out.println("You dealt " + RandomDD + " damage to The Ice Wizard! But with The Ice Wizard's Offensive Shields, he reduces the damage by 20%");
                System.out.println("So now, with the damage reduction, you deal " + RandomDD*.8 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWDD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 80%");
                System.out.println("So now, with the damage reduction, he deals " + RandomWDD*.2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                    System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
            }
          }
          else if (Choose == 2)
          {
              System.out.println("You have chosen package 2. You now get a flamethrower");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinFlame = 70;
                  int MinShield = 20;
                  int RandomFlame = rand.nextInt(30) + MinFlame;
                  int RandomWiDamage = rand.nextInt(30) + MinShield;
                  WizardHealth-=RandomFlame*.8;
                  PlayerHealth -= RandomWiDamage;
                  System.out.println("You dealt " + RandomFlame + " damage to The Ice Wizard! But with The Ice Wizard's Offensive Shields, he reduces the damage by 20%");
                  System.out.println("So now, with the damage reduction, you deal " + RandomFlame*.8 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWiDamage + " damage to you. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 3)
          {
              System.out.println("You have chosen package 3. You now get Steel Armor and a sword");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinSword = 60;
                  int MinShield = 20;
                  int RandomSword = rand.nextInt(30) + MinSword;
                  int RandomSwordD = rand.nextInt(30) + MinShield;
                  WizardHealth-=RandomSword*.8;
                  PlayerHealth -= RandomSwordD/2;
                  System.out.println("You dealt " + RandomSword + " damage to The Ice Wizard! But with The Ice Wizard's Offensive Shields, he reduces the damage by 20%");
                  System.out.println("So now, with the damage reduction, you deal " + RandomSword*.8 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomSwordD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 50%");
                  System.out.println("So now, with the damage reduction, he deals " + RandomSwordD/2 + " damage. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 4)
          {
              System.out.println("You have chosen package 4. You now get 2 Picked Axes");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                   int MinAxe = 35;
                   int MinShield = 20;
                   int RandomAxe = rand.nextInt(30) + MinAxe;
                   int RandomAxeD = rand.nextInt(30) + MinShield;
                   PlayerHealth -= RandomAxe *.2;
                   WizardHealth-=RandomAxe*.8;
                   System.out.println("You dealt " + RandomAxe + " damage to The Ice Wizard! But with The Ice Wizard's Offensive Shields, he reduces the damage by 20%");
                   System.out.println("So now, with the damage reduction, you deal " + RandomAxe*.8 + " damage. Now Ice Wizard's health is at " + WizardHealth);
                   System.out.println("Now The Ice Wizard can attack you! He deals " + RandomAxe + " damage to you. But with your Picked Axes, you reduce the damage by 20%");
                   System.out.println("So now, with the damage reduction, he deals " + RandomAxe*.2 + " damage. Now your health is at " + PlayerHealth);
                   if (PlayerHealth <= 0 && WizardHealth <=0)
                   {
                       System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                       System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                       Attack = "yes";
                       PlayAgain = user_input.next();
                   }
                   else if (PlayerHealth <= 0)
                   {
                       System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                       System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                       Attack = "yes";
                       PlayAgain = user_input.next();
                    }
                    else if (WizardHealth <= 0)
                    {
                        System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                        System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                        System.out.println("Type in anything other than that and the game will end");
                        Attack = "yes";
                        PlayAgain = user_input.next();
                    }
                    else
                    {
                        Attack = user_input.next();
                    }
              }
          }
    }
    else
    {
        System.out.println("The Ice Wizard has a plasma gun. Not sure where he found that."); 
        System.out.println("You have 4 options.");
        System.out.println("Type 1 for Reinforced Steel Armor but a weak dagger");
        System.out.println("Type 2 for a flamethrower");
        System.out.println("Type 3 for Steel Armor and a decent sword");
        System.out.println("Type 4 for 2 Picked Axes");
        Choose = user_input.nextInt();
        while (Choose != 1 && Choose != 2 && Choose != 3 && Choose != 4) 
        {
            System.out.println("That is not a valid option. Please try again.");
            Choose = user_input.nextInt();
        }
          if (Choose == 1)
        {
            System.out.println("You have chosen package 1. You now get to have Reinforced Steel Armor and a dagger");
            System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
            Attack = user_input.next();
            while (!Attack.equals("attack"))
            {
               System.out.println("Narrator: Please type in a valid response.");
               Attack = user_input.next();
            }
            while (Attack.equals("attack"))
            {
                int MinDagger = 40;
                int MinGun = 90;
                int RandomDD = rand.nextInt(30) + MinDagger;
                int RandomWDD = rand.nextInt(30) + MinGun;
                WizardHealth -= RandomDD;
                PlayerHealth -= RandomWDD *.2;
                System.out.println("You dealt " + RandomDD + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWDD + " damage to you. But with your Reinforced Steel Armor, you reduce the damage by 80%");
                System.out.println("So now, with the damage reduction, he deals " + RandomWDD*.2 + " damage. Now your health is at " + PlayerHealth);
                if (PlayerHealth <= 0 && WizardHealth <=0)
                {
                    System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else if (PlayerHealth <= 0)
                {
                   System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                   System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                   Attack = "yes";
                   PlayAgain = user_input.next();
                }
                else if (WizardHealth <= 0)
                {
                    System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                    System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                    Attack = "yes";
                    PlayAgain = user_input.next();
                }
                else
                {
                    Attack = user_input.next();
                }
            }
          }
          else if (Choose == 2)
          {
              System.out.println("You have chosen package 2. You now get a flamethrower");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinFlame = 70;
                  int MinGun = 90;
                  int RandomFlame = rand.nextInt(30) + MinFlame;
                  int RandomWiDamage = rand.nextInt(30) + MinGun;
                  WizardHealth-=RandomFlame;
                  PlayerHealth -= RandomWiDamage;
                  System.out.println("You dealt " + RandomFlame + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomWiDamage + " damage to you. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 3)
          {
              System.out.println("You have chosen package 3. You now get Steel Armor and a sword");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinSword = 60;
                  int MinGun = 90;
                  int RandomSword = rand.nextInt(30) + MinSword;
                  int RandomSwordD = rand.nextInt(30) + MinGun;
                  WizardHealth-=RandomSword;
                  PlayerHealth -= RandomSwordD/2;
                  System.out.println("You dealt " + RandomSword + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomSwordD + " damage to you. But with your Steel Armor, you reduce the damage by 50%");
                  System.out.println("So now, with the damage reduction, he deals " + RandomSwordD/2 + " damage. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }
              }
          }
          else if (Choose == 4)
          {
              System.out.println("You have chosen package 4. You now get 2 Picked Axes");
              System.out.println("Type in \"attack\" to let your character attack The Ice Wizard and then The Ice Wizard will attack you!");
               System.out.println("Once you type in \"attack\", read the text to see what damage each of you deals to one another and how much you are both left with.");
               System.out.println("Keep on typing in \"attack\" until the game tells you who wins and if you want to play again");
              Attack = user_input.next();
              while (!Attack.equals("attack"))
              {
                  System.out.println("Narrator: Please type in a valid response.");
                  Attack = user_input.next();
              }
              while (Attack.equals("attack"))
              {
                  int MinAxe = 35;
                  int MinGun = 90;
                  int RandomAxe = rand.nextInt(30) + MinAxe;
                  int RandomAxeD = rand.nextInt(30) + MinGun;
                  PlayerHealth -= RandomAxe;
                  WizardHealth-=RandomAxeD*.8;
                  System.out.println("You dealt " + RandomAxe + " damage to The Ice Wizard! Now Ice Wizard's health is at " + WizardHealth);
                  System.out.println("Now The Ice Wizard can attack you! He deals " + RandomAxe + " damage to you. But with your Picked Axes, you reduce the damage by 20%");
                  System.out.println("So now, with the damage reduction, he deals " + RandomAxe*.8 + " damage. Now your health is at " + PlayerHealth);
                  if (PlayerHealth <= 0 && WizardHealth <=0)
                  {
                      System.out.println("It was a tie! You both go home ashamed that you couldn't beat the other. Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (PlayerHealth <= 0)
                  {
                      System.out.println("The Ice Wizard has killed you! Guess you're not as good as you say you are. Would you like to try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else if (WizardHealth <= 0)
                  {
                      System.out.println("You win! You killed The Ice Wizard! Wanna try again?");
                      System.out.println("Type in \"game\" to play the game over again or type in \"wizard\" to play the wizard battle over again");
                      System.out.println("Type in anything other than that and the game will end");
                      Attack = "yes";
                      PlayAgain = user_input.next();
                  }
                  else
                  {
                      Attack = user_input.next();
                  }  
              }
          }
        }
    }
}
        else
        {
            System.out.println("Narrator: Since you didn't type yes, guess the adventure is over! Until we meet again Mr. " + name);
            System.out.println("GAME OVER!");
        }
    

}
}
}



        
    




