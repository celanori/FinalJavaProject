import java.util.Random;
import java.util.Scanner;

public class SixDieRoll {
private int total = 0; // Creating and initiating total varialble.
	
	public int getRoll() {//method to test rolling die then give and return total value
		
		Scanner keyboard = new Scanner(System.in); //Create new scanner object.
		int numberedRoll = 0; //initialize variable for keyboard input
		int afterRoll = 0; // initialize variable for for accumulation.
		System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30."); //Ask user how many die they want to roll.
		numberedRoll = keyboard.nextInt(); // set numberedRoll to the input of the user.
		while (numberedRoll < 1 || numberedRoll > 30 ) { // Validate the user input.
			System.out.println("Please enter a number 1-30.");
			numberedRoll = keyboard.nextInt();
			}
		Random sixDie = new Random();// Create new random object for rolling an six die.
		for (int x = 0; x < numberedRoll; x++) {// create for loop to roll as many times as the user likes.
			afterRoll = sixDie.nextInt(6) + 1; // setup the parameters for the random of the six die.
			total += afterRoll;// add all the rolls together to get the total.
			System.out.println(afterRoll); //display each roll.
		}
		
		return total; // return the total.
		}// end of getRoll

	

}
