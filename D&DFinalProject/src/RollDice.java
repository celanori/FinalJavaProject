import java.util.Scanner;
import java.util.Random;
public class RollDice {
	
	public static void main(String[] args) {
		int total = 0;
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		int numberedRoll = 0;
		int afterRoll = 0;
		char rerun;
		String inputTwo;
	do {
			System.out.println("What kind of die do you wish to roll? \n" + "Please enter 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die");
			input = keyboard.nextInt();
			while ( input != 4 && input != 6 && input != 8 && input != 12 && input != 20 ) {
				System.out.println("Please enter one of the options given: 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die ");
				input = keyboard.nextInt();
			}
		
			if (input == 4) {
				System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30.");
				numberedRoll = keyboard.nextInt();
				while (numberedRoll < 1 || numberedRoll > 30 ) {
					System.out.println("Please enter a number 1-30.");
					numberedRoll = keyboard.nextInt();
					}
				Random fourDie = new Random();
				for (int x = 0; x < numberedRoll; x++) {
					afterRoll = fourDie.nextInt(4) + 1;
					total += afterRoll;
					System.out.println(afterRoll);
				}
			}
			
		
			if (input == 6) {
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
			}
			
			 
			if (input == 8) {
				System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30.");
				numberedRoll = keyboard.nextInt();
				while (numberedRoll < 1 || numberedRoll > 30 ) {
					System.out.println("Please enter a number 1-30.");
					numberedRoll = keyboard.nextInt();
				}
				Random eightDie = new Random();
				for (int x = 0; x < numberedRoll; x++) {
					afterRoll = eightDie.nextInt(8) + 1;
					total += afterRoll;
					System.out.println(afterRoll);
				}
			}
			

			if (input == 12) {
				System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30.");
				numberedRoll = keyboard.nextInt();
				while (numberedRoll < 1 || numberedRoll > 30 ) {
					System.out.println("Please enter a number 1-30.");
					numberedRoll = keyboard.nextInt();
					}
				Random twelveDie = new Random();
				for (int x = 0; x < numberedRoll; x++) {
					afterRoll = twelveDie.nextInt(12) + 1;
					total += afterRoll;
					System.out.println(afterRoll);
				}
			}
			
		
			if (input == 20) {
				System.out.println("How many times would you like to roll the die? \n" + "Please enter a number 1-30.");
				numberedRoll = keyboard.nextInt();
				while (numberedRoll < 1 || numberedRoll > 30 ) {
					System.out.println("Please enter a number 1-30.");
					numberedRoll = keyboard.nextInt();
					}
				Random twentyDie = new Random();
				for (int x = 0; x < numberedRoll; x++) {
					afterRoll = twentyDie.nextInt(20) + 1;
					total += afterRoll;
					System.out.println(afterRoll);
				}
			}
			
			System.out.println(total);
			
			keyboard.nextLine();
			
			System.out.println("Would you like to reroll another set of dice?");
			System.out.println("Enter y to reroll. Any other input will return to main menu: ");
			inputTwo = keyboard.nextLine();
			rerun = inputTwo.charAt(0);
	} while (rerun == 'y'|| rerun == 'Y');
		 
	}
		
}


