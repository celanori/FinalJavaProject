import java.io.FileNotFoundException;
import java.util.*;


public class JavaAssistantProgram {
//changing one thing to see if github is working.
	public static void main(String[] args) throws FileNotFoundException {
	boolean programRun = true;
	Scanner keyboard = new Scanner(System.in);
	String mainInput;
	String choice2;
	ArrayList<String> listPartyName = new ArrayList<String>();
	ArrayList<String> listEnemyName = new ArrayList<String>();
	while (programRun == true) {
	System.out.println();
	System.out.println("Welcome to the D&D Assistant program.");
	System.out.println("Please press 'A' to roll dice and recieve a total.");
	System.out.println("Please press 'B' to create a list of initative rolls.");
	System.out.println("Please press 'C' to discover a random name for your character.");
	System.out.println("Or you can type 'Quit' to exit the program.");
	mainInput = keyboard.nextLine();
	
	if (mainInput.equalsIgnoreCase("A")) {
	//Option A
		int total = 0;
		int inputOne;
		String inputTwo;
	do {
			
			
			System.out.println("What kind of die do you wish to roll? \n" + "Please enter 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die");
			inputOne = keyboard.nextInt();
			while ( inputOne != 4 && inputOne != 6 && inputOne != 8 && inputOne != 10 && inputOne != 12 && inputOne != 20 ) {
				System.out.println("Please enter one of the options given: 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 10 - for 10 sided die, 12 - for 12 sided die, or 20 - for 20 sided die ");
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
			
			if (inputOne == 10) {
				TenDieRoll ten = new TenDieRoll();
				total = ten.getRoll();
			}

			if (inputOne == 12) {
				TwelveDieRoll twelve = new TwelveDieRoll();
				total = twelve.getRoll();
			}
			
		
			if (inputOne == 20) {
				TwentyDieRoll twenty = new TwentyDieRoll();
				total = twenty.getRoll();
			}
			
			System.out.println("This is your total on that roll: " + total);
			
			keyboard.nextLine();
			
			System.out.println("Would you like to reroll another set of dice?");
			System.out.println("Enter 'Yes' to reroll. Any other input will return to main menu: ");
			inputTwo = keyboard.nextLine();
	} while (inputTwo.equalsIgnoreCase("Yes"));
	}

	else if (mainInput.equalsIgnoreCase("B")) {
		String Answer = " ";
		boolean error = false;
		//Option B
		InitiativeRollDice roll = new InitiativeRollDice();
		Scanner input1 = new Scanner(System.in);
		while(error == false) {
		System.out.println("Would you like to list first Ally or Enemy? Or you can type print to see the current lists.");
		String inputTest1 = input1.nextLine();
		if (inputTest1.equalsIgnoreCase("Show")) {
		System.out.println(listPartyName);
		System.out.println(listEnemyName);
		}
		
		else if (inputTest1.equalsIgnoreCase("Ally") || (inputTest1.equalsIgnoreCase("Enemy"))) {
		EnumVariable encounterPlayers = new EnumVariable(Team.valueOf(inputTest1.toUpperCase()));
		Answer = encounterPlayers.teamChoice();
		error = true;
		}
		else {
		System.out.println("This is an invalid input.");
		error = false;
		}
		}
		
		if (Answer.equalsIgnoreCase("Enemy")){
			error = false;
			String inputTest = input1.nextLine();
			while (!inputTest.equalsIgnoreCase("STOP")){
			listEnemyName.add(inputTest);
			
			System.out.println("What other enemy name would you like to add?");
			inputTest = input1.nextLine();
			}
			
			System.out.println("Now add the names of your allies. Type 'STOP' to quit adding names.");
			inputTest = input1.nextLine();
			while (!inputTest.equalsIgnoreCase("STOP")){
				listPartyName.add(inputTest);
				
				System.out.println("What other ally name would you like to add?");
				inputTest = input1.nextLine();
				}
			
			
		}
		if (Answer.equalsIgnoreCase("Ally")){
			error = false;
			String inputTest = input1.nextLine();
			while (!inputTest.equalsIgnoreCase("STOP")){
			listPartyName.add(inputTest);
			
			System.out.println("What other ally name would you like to add?");
			inputTest = input1.nextLine();
			
			}
			System.out.println("Now add the names of your enemies. Type 'STOP' to quit adding names.");
			inputTest = input1.nextLine();
			while (!inputTest.equalsIgnoreCase("STOP")){
				listEnemyName.add(inputTest);
				
				System.out.println("What other enemy name would you like to add?");
				inputTest = input1.nextLine();
				
		}
		}
		System.out.println("This is the fighting order of your party.");
		EncounterClass PartyFightOrder  = new EncounterClass(listPartyName, roll);
		System.out.println("This is the fighting order of your enemies.");
		EncounterClass EnemyFightOrder  = new EncounterClass(listEnemyName, roll);
		System.out.println("Now returning you to the main menu...");
	}
	else if (mainInput.equalsIgnoreCase("C")) {
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
			do {
			NameGenerator test = new NameGenerator(amount);
			System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
			choice2 = input.next();
			}
			while (choice2.equalsIgnoreCase("Yes"));
			System.out.println("Now returning you to the main menu...");
		
		} 
		else if (value.equalsIgnoreCase("No")) {
			check = false;
			while (check2 == false) {
			System.out.println("Which name would you like to input? First or Last");
			Choice = input.nextLine();
			if (Choice.equalsIgnoreCase("first")) {
				position = 1;
				System.out.println("Display your first name of your character exact way you would like it displayed.");
				name = input.nextLine() ;
				while (check3 == true) {
				System.out.println("Is this correct? " + name + " Yes or No.");
				Choice = input.nextLine();
				if (Choice.equalsIgnoreCase("Yes")) {
				check = false;	
				System.out.println("How many random names do you want to generate?");
				int amount = input.nextInt() ;
				do {
				NameGenerator test2 = new NameGenerator(amount, name, position);
				System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
				choice2 = input.next();
				} while(choice2.equalsIgnoreCase("yes"));
				check = false;
				check2 = true;
				check3 = false;
				System.out.println("Returning to Main Menu...");
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
				do {
				NameGenerator test2 = new NameGenerator(amount, name, position);
				System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
				choice2 = input.next();
				} while(choice2.equalsIgnoreCase("Yes"));
				check = false;
				check2 = true;
				check3 = false;
				System.out.println("Returning to Main Menu...");
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
	else if (mainInput.equalsIgnoreCase("Quit")) {
		programRun = false;
	}
  }
	System.exit(0);}	
}
