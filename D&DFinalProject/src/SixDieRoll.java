import java.util.Random;
import java.util.Scanner;

public class SixDieRoll {
	private int total = 0;
	
	public int getRoll() {//method to test coin flip side then give score a value
		
		Scanner keyboard = new Scanner(System.in);
		int numberedRoll = 0;
		int afterRoll = 0;
		System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30.");
		numberedRoll = keyboard.nextInt();
		while (numberedRoll < 1 || numberedRoll > 30 ) {
			System.out.println("Please enter a number 1-30.");
			numberedRoll = keyboard.nextInt();
			}
		Random sixDie = new Random();
		for (int x = 0; x < numberedRoll; x++) {
			afterRoll = sixDie.nextInt(6) + 1;
			total += afterRoll;
			System.out.println(afterRoll);
		}
		
		return total;
		}// end of getScore
	

}
