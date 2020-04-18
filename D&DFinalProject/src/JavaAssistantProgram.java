import java.io.FileNotFoundException;
import java.util.*;


public class JavaAssistantProgram {
//changing one thing to see if github is working.
	public static void main(String[] args) throws FileNotFoundException {
		//The other solution I was trying to suggest for the rolling dice (look at Rolldicetest Class
		boolean rollingdice = true;
		int count;
		int totalSum = 0;
		
		String response;
		Scanner input2 = new Scanner(System.in);
		//Option A 
		do {
		RollDiceTest Sides = new RollDiceTest();
		System.out.println("How many sides does your dice have? Then press enter twice");
		int size = input2.nextInt();
		System.out.println("How many " + size + " sided dice would you like to roll? Then press enter twice");
		int amountDice = input2.nextInt();
		System.out.println("Rolling " + amountDice + ' ' + size + " sided die.");
		for (count=1; count<amountDice+1; count++) {
		int Rolling = Sides.StandardDiceRoll(count);
		System.out.println("Roll #" + count + ' ');
		System.out.println(Rolling);
		totalSum  += Rolling;
		}
		System.out.println("Total: " + totalSum);
		System.out.println("Would you like to roll again? Yes or No.");
		response = input2.nextLine();
		if (response.equalsIgnoreCase("Yes")) {
		rollingdice = false;
		}
		else if (response.equalsIgnoreCase("No")) {
			rollingdice = true;
			}
		else {
			System.out.println("That response is not valid.");
		}
		} while(rollingdice == true);
	/*	
		int total = 0;
		Scanner keyboard = new Scanner(System.in);
		int inputOne = 0;
		char rerun;
		String inputTwo;
	do {
			System.out.println("What kind of die do you wish to roll? \n" + "Please enter 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die");
			inputOne = keyboard.nextInt();
			while ( inputOne != 4 && inputOne != 6 && inputOne != 8 && inputOne != 12 && inputOne != 20 ) {
				System.out.println("Please enter one of the options given: 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die ");
				inputOne = keyboard.nextInt();
			}
		
			if (inputOne == 4) {
				FourDieRoll four = new FourDieRoll();
				total = four.getRoll();
				}
			
		
			if (inputOne == 6) {
				SixDieRoll six = new SixDieRoll();
				total = six.getRoll();
			}
			
			 
			if (inputOne == 8) {
				EightDieRoll eight = new EightDieRoll();
				total = eight.getRoll();
			}
			

			if (inputOne == 12) {
				TwelveDieRoll twelve = new TwelveDieRoll();
				total = twelve.getRoll();
			}
			
		
			if (inputOne == 20) {
				TwentyDieRoll twenty = new TwentyDieRoll();
				total = twenty.getRoll();
			}
			
			System.out.println(total);
			
			keyboard.nextLine();
			
			System.out.println("Would you like to reroll another set of dice?");
			System.out.println("Enter y to reroll. Any other input will return to main menu: ");
			inputTwo = keyboard.nextLine();
			rerun = inputTwo.charAt(0);
	} while (rerun == 'y'|| rerun == 'Y');
		*/ 
		ArrayList<String> listPartyName = new ArrayList<String>();
		
		//Option B
		InitiativeRollDice roll = new InitiativeRollDice();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please list all of your party members names. Type 'stop' when finished.");
		String inputTest = input1.nextLine();
		while (!inputTest.equalsIgnoreCase("STOP")){
		listPartyName.add(inputTest);
		System.out.println("What other name would you like to add?");
		inputTest = input1.nextLine();
		}
		EncounterClass Fight  = new EncounterClass(listPartyName, roll);
		System.out.println(Fight);
		/*Option C
		
		*/
		boolean check = true;
		boolean check2 = false;
		boolean check3 = true;
		String Choice;
		String name;
		int position;
		
		System.out.println("Would you like to randomly generate the full name? Yes or No.");
		while (check == true) {
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
		if (value.equalsIgnoreCase("Yes")) {
			check = false;
			System.out.println("How many random names do you want to generate?");
			int amount = input.nextInt() ;
			NameGenerator test = new NameGenerator(amount);
			System.out.println(test);
		} 
		else if (value.equalsIgnoreCase("No")) {
			check = false;
			while (check2 == false) {
			System.out.println("Which name would you like to input? First or Last");
			Choice = input.nextLine();
			
			if (Choice.equalsIgnoreCase("first")) {
				position = 1;
				System.out.println("Display your first name the exact way you would like it displayed.");
				name = input.nextLine() ;
				while (check3 == true) {
				System.out.println("Is this correct? " + name + " Yes or No.");
				Choice = input.nextLine();
				if (Choice.equalsIgnoreCase("Yes")) {
				check = false;		
				System.out.println("How many random names do you want to generate?");
				int amount = input.nextInt() ;
				NameGenerator test2 = new NameGenerator(amount, name, position);
				System.out.println(test2);
				check = false;
				check2 = true;
				check3 = false;
			}
				else if (Choice.equalsIgnoreCase("No")) {
					System.out.println("Please input the correct name.");
					name = input.nextLine();
				}
				else {
					System.out.println("That is an invalid input.");
					check3 = true;
				}
				}
			}
			else if (Choice.equalsIgnoreCase("last")) {
				check2 = true;
				position = 2;
				System.out.println("Display your last name the exact way you would like it displayed.");
				name = input.nextLine() ;
				while (check3 == true) {
				System.out.println("Is this correct? " + name + " Yes or No.");
				Choice = input.nextLine();
				if (Choice.equalsIgnoreCase("Yes")) {
				check = false;		
				System.out.println("How many names do you want to generate?");
				int amount = input.nextInt() ;
				NameGenerator test2 = new NameGenerator(amount, name, position);
				System.out.println(test2);
				check = false;
				check2 = true;
				check3 = false;
			}
				else if (Choice.equalsIgnoreCase("No")) {
					System.out.println("Please input the correct name.");
					name = input.nextLine();
				}
				else {
					System.out.println("That is an invalid input, please try again.");
					check3 = true;
				}
				}				
			}
			else {
				System.out.println("This is not a valid input, please try again.");
				check2 = false;
			}
			
			}	
		}
		else {
			System.out.println("This is not a valid input, please try again.");
			check = true;
		}
	}	
  }
	
}
