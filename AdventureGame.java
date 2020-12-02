
/**
 * Write a description of class AdventureGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AdventureGame
{
      public static void main(String[] args){
            System.out.print("\u000C");
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a name for yourself: ");
            
            String name = myObj.nextLine();
            int play_again = 0;
            do {
            System.out.println("Okay,now do you want to go to a haunted house (Click 1) or a portal to the far away future? (Click 2)");
            int myChoice = myObj.nextInt();
            
            if (myChoice == 1)
            {
                System.out.println("You get in your car with your friend Bob,and he asks, Where are we going " + name);
                System.out.println("? We are going to a so called haunted house Bob. ");
                //Bob responds
                System.out.println("Oh cool!, He says. ");
                System.out.println("You arrive at the haunted house, and both of you get out of the car. ");
                System.out.println("Wow!, this place looks creepy all right. ");
                System.out.println("Do you want to go in, if so, enter 1, if not, enter 2: ");
                int myChoice2 = myObj.nextInt();
             if (myChoice2 == 1)
             {
                 System.out.println("Well, let's go take a look, you say.");
                 System.out.println("You go up to the door, open it, and walk in, while Bob follows closely behind. ");
                 System.out.println("When you walk inside, you see a stairwell, a living room, a kitchen, and a dining table.");
                 System.out.println("If you want to go up the stairwell, then enter 1. ");
                 System.out.println("If you want to go to the area with the living room, kitchen, and dining table, then enter 2. ");
                 int myChoice3 = myObj.nextInt();
             if (myChoice3 == 1)
             {
                 System.out.println("Bob and you decide to see what is up the stairwell. ");
                 System.out.println("As soon as you step on the first step, the doors to the house close! ");
                 System.out.println("Bob exclaims, Whoa! The doors just closed without anyone being there! ");
                 System.out.println("You reply, it probably was just the wind, and continue up the stairs. ");
                 System.out.println("As soon as you reach the stair top, you see that there are two doors. ");
                 System.out.println("One says Clear, and the other says Bones. If you want to go through Clear, then enter 1, for Bones, enter 2. ");
                 int myChoice4 = myObj.nextInt();
                 if (myChoice4 == 1)
                 {
                     System.out.println("Bob and you decide to go through the door that says Clear, as you don't like the sound of Bones. ");
                     System.out.println("When you enter the room you see that it is indeed clear of anything that looks dangerous, but you can't be too sure. ");
                     System.out.println("You walk around the room a little, and then you hear a howling sound. ");
                     System.out.println("What was that?, Bob says,you reply saying, it is probably just the wind. ");
                     System.out.println("Then ghosts appear, and you both jump in shock. ");
                     System.out.println("Bob and you run toward the door, but it closes! ");
                     System.out.println("The ghosts close in, and you both are possesed by the ghosts for the rest of your lives. ");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else if (myChoice4 == 2)
                 {
                     System.out.println("Bob and you decide to go through the door that says Bones, as you think that Clear is misleading. ");
                     System.out.println("You head in as Bob follows, after a few feet in, you and Bob stop in your tracks.");
                     System.out.println("There are skeletons of people everywhere!");
                     System.out.println("Bob, exclaimed, Oh my gosh, why are there so many skeletons! ");
                     System.out.println("You say, I think we should leave, and you both start to turn around. ");
                     System.out.println("And then you hear a round of clunks, Bob and you turn around swiftly to see that the skeletons are getting up. ");
                     System.out.println("You both scream and make a run for it toward the door, hoping it will not close. ");
                     System.out.println("Unfortunately, the door closes right when you get there, and you both turn around in fear. ");
                     System.out.println("But then you spot a shovel, and acting quickly, you lunge towards it. ");
                     System.out.println("You grab it and start smacking the skeletons to pieces! ");
                     System.out.println("After a few minutes of bashing the skeletons, Bob starts kicking the skeletons, and tells you to smash the door. ");
                     System.out.println("You start smashing the door and eventually it breaks and splinters. ");
                     System.out.println("Bob and you run out of the room and you smash the front door down. ");
                     System.out.println("You both get in the car, and zoom away as fast as you can toward your house. ");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else
                 {
                     System.out.println("Sorry, that is not a valid reply. ");
                     play_again = 0;
                 }
                 
             }
             else if (myChoice3 == 2)
             {
                 System.out.println("Bob and you decide to the area with the living room, kitchen, and dining table. ");
                 System.out.println("As soon as you reach the area, the door you came in closes and the candles on the table flicker on! ");
                 System.out.println("Both of you gasp at this sight, and slowly back out of the area. ");
                 System.out.println("Then, the silverware of the kitchen started floating and then stated moving toward Bob and you!");
                 System.out.println("You both start to run the other way for your lives, as spoons, forks, and knives start to chase you!");
                 System.out.println("Bob and you head out of the room and head toward the door to the house, hoping it is unlocked.");
                 System.out.println("Unfortunately for both of you,the door won't budge, so you decide to either duck (Enter 1), ");
                 System.out.println("Or,make a run for it up the stairs (Enter 2). ");
                 int myChoice4 = myObj.nextInt();
                 if (myChoice4 == 1)
                 {
                     System.out.println("Bob and you decide to duck, and the silverware smash into the door! ");
                     System.out.println("The impact of the silverware is so great, that the door is flung off its hinges! ");
                     System.out.println("You both run out of the house as fast as you can and get in the car" );
                     System.out.println("Bob screams, They are coming at us again!, you start the engine and start driving away as fast as you can. ");
                     System.out.println("When the silverware is about to hit your car, suddenly they stop, turn around, and go back toward the haunted house. ");
                     System.out.println("Both you and Bob breath a sigh of relief, and you drive back to your house knowing you will never forget this. ");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else if (myChoice4 == 2)
                 {
                     System.out.println("Bob and you decide to run up the stairs.");
                     System.out.println("However the silverware is too fast, so Bob and you get battered to death. (I know, kind of dark)");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else
                 {
                     System.out.println("Sorry, that is not a valid reply.");
                     play_again = 0;
                 }
                
             }
             else
             {
                 System.out.println("Sorry, that is not a valid reply.");
                 play_again = 0;
             }
             }   
             else if (myChoice2 == 2)
             {
               System.out.println("Actually, I, I just remembered I need to do something at home, You say. ");
               System.out.println("Oh, okay, I gues we will go back, Bob responds.");
               System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                 play_again = myObj.nextInt();
             }
             else 
             {
               System.out.println("Sorry,that is not a valid reply.");
               play_again = 0;
             }
            }
          
        
                               
        
       
         if (myChoice == 2)
         {
            System.out.println("You have found a portal to another time period,it says, The Future, on it. ");
            System.out.println("Do you want to enter it? Enter 1 to enter, enter 2 if you do not want to: ");
            int myChoice2 = myObj.nextInt();
            if (myChoice2 == 1)
            {
             System.out.println("You activate the portal, and jump in, not sure if you will be ready for what is on the other side.");
             System.out.println("As you appear on to the other side, you gasp in amazement at the sight of hover cars and robots everywhere!");
             System.out.println("If you want to go check out what the location of your home looks like now, then enter 1.");
             System.out.println("If you want to go check out a nearby mall, then enter 2.");
             int myChoice3 = myObj.nextInt();
             if (myChoice3 == 1)
             {
                 System.out.println("You decide to go check out what your home's location looks like now.");
                 System.out.println("You walk to an area that says Hoverbus Stop, and then wait for your ride.");
                 System.out.println("A bus comes, and you walk in, but the bus driver stops you and asks for your name.");
                 System.out.println(" You reply saying, my name is" + name);
                 System.out.println("The bus driver then says, You are wearing some strange clothes, are they antiques? ");
                 System.out.println("Yes, you say, and then take a seat, as the bus driver asks where you want to go. ");
                 System.out.println("You tell him your home address, and then he starts to drive. ");
                 System.out.println("When you reach your house's location and get out of the hoverbus, you gasp in amazement. ");
                 System.out.println("The building that now stands here is still a house, but is now up to date with the tech of the future. ");
                 System.out.println("After a while you decide to go home, the memory of the house, still fresh in your head. ");
                 System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                 play_again = myObj.nextInt();
             }
             else if (myChoice3 == 2)
             {
                 System.out.println("You decide to go to a nearby mall to see what kinds of cool stuff there might be.");
                 System.out.println("After you reach the mall, you take a minute to gaze at all the amazing technological advancements");
                 System.out.println("Once you get inside, the first thing you notice is the cachier tables");
                 System.out.println("They are manned by robots, and all you need to do is give the items to them.");
                 System.out.println("You continue on looking around the mall when some robots roll up. ");
                 System.out.println("They say to you, We are the mall security, what is your name?");
                 System.out.println("You say, Um, my name is " + name);
                 System.out.println("Well, your apparel is strange " + name);
                 System.out.println("I, I am just wearing some antique clothes. ");
                 System.out.println("They answered, this apparel is a very old style, why would you wear it? ");
                 System.out.println("If you want to make a run for it, enter 1, if you want to continue trying to talk your way out of it, enter 2. ");
                 int myChoice4 = myObj.nextInt();
                 if (myChoice4 == 1)
                 {
                     System.out.println("You decide to make a run for it, turning around toward the door. ");
                     System.out.println("The robots shout, It is unadvisable to run, stop or we will arrest you!");
                     System.out.println("But you continue to run in the direction of the portal. ");
                     System.out.println("However, the robots roll after you, and cut off your escape.");
                     System.out.println("You are stunned by a blast from what looks like a stun gun.");
                     System.out.println("You wake up in a cell, and you fear for what your life could be like from now on. ");
                     System.out.println("You also wonder if you will ever go back to your own time. ");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else if (myChoice4 == 2)
                 {
                     System.out.println("You decide to continue trying to talk your way out of it, and say, I just want to see how older clothes feels. ");
                     System.out.println("It was passed down by for generations by my family. ");
                     System.out.println("The security robots respond saying, Ok, then you may continue citizen. ");
                     System.out.println("You spend a few hours looking around, then decide to return to the portal. ");
                     System.out.println("Thankfully, it is still there, and you walk through, smiling at all the magnificent things you have seen. ");
                     System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
                 }
                 else
                 System.out.println("Sorry, that is not a valid reply.");
                 play_again = 0;
             }
             else
             {
                 System.out.println("Sorry, that is not a valid reply.");
                 play_again = 0;
             }
            }
            else if (myChoice2 == 2)
            {
             System.out.println("You decide that it is too dangerous to go in the portal, and then report the device to the police.");
             System.out.println("Do you want to play again? Enter 1 for YES, or 0 for NO. ");
                     play_again = myObj.nextInt();
            }
            else
            {
             System.out.println("Sorry that is not a valid reply.");
             play_again = 0;
            }   
         }   
         
         
     }
     while (play_again == 1);
    }
}

