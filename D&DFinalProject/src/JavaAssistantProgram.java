//import java utilities and file not found exception
import java.io.FileNotFoundException; //
import java.util.*;


public class JavaAssistantProgram {//Main class to run program
	
	public static void main(String[] args) throws FileNotFoundException { //Main method
		
	//Initialize variables
	boolean programRun = true;
	boolean error = false;
	int total = 0;
	int position;
	int inputOne;
	String Choice;
	String name;;
	String Answer = " ";
	String mainInput;
	String choice2;
	String inputTwo;
	ArrayList<String> listPartyName = new ArrayList<String>();
	ArrayList<String> listEnemyName = new ArrayList<String>();
	ArrayList<String> listFinalList1 = new ArrayList<String>();
	ArrayList<String> listFinalList2 = new ArrayList<String>();
	InitiativeRollDice roll = new InitiativeRollDice();
	EncounterClass test = new EncounterClass();
	EncounterClass test2 = new EncounterClass();
	
	//while loop for the program to run
	while (programRun == true) {
		
	//introduction message
	System.out.println();
	System.out.println("Welcome to the D&D Assistant program.");
	System.out.println("Please press 'A' to roll dice and recieve a total.");
	System.out.println("Please press 'B' to create or see a list of the initative order.");
	System.out.println("Please press 'C' to discover a random name for your character.");
	System.out.println("Or you can type 'Quit' to exit the program.");
	
	//main scanner class initialized 
	Scanner keyboard = new Scanner(System.in);
	mainInput = keyboard.nextLine();
	
	//if option A is chosen
	if (mainInput.equalsIgnoreCase("A")) {
		
	// do while loop for repetition if user wants to continue to roll dice
	do {
			//Prompt and user input
			System.out.println("What kind of die do you wish to roll? \n" + "Please enter 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die");
			inputOne = Integer.parseInt(keyboard.nextLine());
			
			//new while loop to validate option selection
			while ( inputOne != 4 && inputOne != 6 && inputOne != 8 && inputOne != 10 && inputOne != 12 && inputOne != 20 ) {
				System.out.println("Please enter one of the options given: 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 10 - for 10 sided die, 12 - for 12 sided die, or 20 - for 20 sided die ");
				inputOne = Integer.parseInt(keyboard.nextLine());
			}
			
			//if four selected then create a instance of the four die roll
			if (inputOne == 4) {
				FourDieRoll four = new FourDieRoll();
				total = four.getRoll();
				}
			
			//if six selected then create a instance of the six die roll
			if (inputOne == 6) {
				SixDieRoll six = new SixDieRoll();
				total = six.getRoll();
			}
			
			//if eight selected then create a instance of the eight die roll
			if (inputOne == 8) {
				EightDieRoll eight = new EightDieRoll();
				total = eight.getRoll();
			}
			
			//if ten selected then create a instance of the ten die roll
			if (inputOne == 10) {
				TenDieRoll ten = new TenDieRoll();
				total = ten.getRoll();
			}
			
			//if twelve selected then create a instance of the twelve die roll
			if (inputOne == 12) {
				TwelveDieRoll twelve = new TwelveDieRoll();
				total = twelve.getRoll();
			}
			
			//if twenty selected then create a instance of the twenty die roll
			if (inputOne == 20) {
				TwentyDieRoll twenty = new TwentyDieRoll();
				total = twenty.getRoll();
			}
			
			// print message with the total of the dice roll
			System.out.println("This is your total on that roll: " + total);
			
			
			//prompt for user  if you want to enter another set of dice and input 
			System.out.println("Would you like to reroll another set of dice?");
			System.out.println("Enter 'Yes' to reroll. Any other input will return to main menu: ");
			inputTwo = keyboard.nextLine();
			//end of do while loop if they are want re-roll
	} while (inputTwo.equalsIgnoreCase("Yes"));
	} // end of Option A
	
	
	//Start of option B
	else if (mainInput.equalsIgnoreCase("B")) {
		
		//while loop for option b - prompt user and decide where to go next
		while(error == false) {
		System.out.println("Ready to roll initiative? \n"
				+ "If yes go ahead and type 'ALLY' to start listing your party members; \n"
				+ "or you can type 'ENEMY' to start listing the foes first!");
		System.out.println("You can also type 'SHOW' to see the list of the last encounter entered and return to the main menu.");
		String inputTest1 = keyboard.nextLine();
		
		// if user typed show it will break the while loop and send them to the rest of the else if option B
		if (inputTest1.equalsIgnoreCase("Show")) {
			error = true;
		}
		
		//comparing input using enum variable. Where Answer is the string of the result of the enum variable class.
		else if (inputTest1.equalsIgnoreCase("Ally") || (inputTest1.equalsIgnoreCase("Enemy"))) {
		EnumVariable encounterPlayers = new EnumVariable(Team.valueOf(inputTest1.toUpperCase()));
		Answer = encounterPlayers.teamChoice();
		error = true; // break while loop
		}
		
		//any other possible option would cause error continue while loop
		else {
		System.out.println("This is an invalid input.");
		error = false;
		}
		}
		
		//if statement compares the answer to the string version of the enum type to either an enemy or ally
		if (Answer.equalsIgnoreCase("Enemy")){
			error = false;
			String inputTest = keyboard.nextLine();
			
			//while loop user types stop
			while (!inputTest.equalsIgnoreCase("STOP")){
			listEnemyName.add(inputTest);
			
			//prompts for next enemy you want to add
			System.out.println("What other enemy name would you like to add?");
			inputTest = keyboard.nextLine();
			}
			
			//prompt to add names of your allies 
			System.out.println("Now add the names of your allies. Type 'STOP' to quit adding names.");
			inputTest = keyboard.nextLine();
			
			//while loop until type stop
			while (!inputTest.equalsIgnoreCase("STOP")){
				listPartyName.add(inputTest);
				
				//prompts user if they would like to add another name
				System.out.println("What other ally name would you like to add?");
				inputTest = keyboard.nextLine();
				} // close stop while loop
			
			
		} // close enemy if statement 
		
		//if statement for ally choice
		if (Answer.equalsIgnoreCase("Ally")){
			error = false;
			String inputTest = keyboard.nextLine();
			
			//while loop until user types stop
			while (!inputTest.equalsIgnoreCase("STOP")){
			listPartyName.add(inputTest);
			
			//prompts for user ally they want to add
			System.out.println("What other ally name would you like to add?");
			inputTest = keyboard.nextLine();
			
			}
			
			//prompt to add names of enemy
			System.out.println("Now add the names of your enemies. Type 'STOP' to quit adding names.");
			inputTest = keyboard.nextLine();
			
			//while loop until user types stop
			while (!inputTest.equalsIgnoreCase("STOP")){
				listEnemyName.add(inputTest);
				
				//prompts user if they would like to add another name
				System.out.println("What other enemy name would you like to add?");
				inputTest = keyboard.nextLine();
				
		}// close while loop for user stop
			
		}// close ally if statement
		
		//prompts that this is the order of the party, the party lists and rolls associated, and returning to the main menu.
		System.out.println("This is the current fighting order of your party.");
		listFinalList1 = test.EncounterClassNew(listEnemyName, roll);
		listFinalList2 = test2.EncounterClassNew(listPartyName, roll);
		System.out.println(listFinalList1);
		System.out.println("This is the current fighting order of your enemies.");
		System.out.println(listFinalList2);
		System.out.println("Now returning you to the main menu...");
		
	}// close option B else if
	
	// open else if for option C
	else if (mainInput.equalsIgnoreCase("C")) {
	
		//Question and input
		System.out.println("Would you like to randomly generate the full name? Yes or No.");
		String value = keyboard.nextLine();
		
		//if yes statement prompt how many names
		if (value.equalsIgnoreCase("Yes")) {
			System.out.println("How many random names do you want to generate?");
			int amount = Integer.parseInt(keyboard.nextLine());
			do { // do while loop call name generator class
			new NameGenerator(amount); //constructor for NameGenerator
			
			//and prompt if they would like to repeat.
			System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
			value = keyboard.nextLine();
			}
			while (value.equalsIgnoreCase("Yes")); // do while repeats until other response then 'yes'
			
			System.out.println("Now returning you to the main menu..."); //now returning to the main menu
		} // close if statement 
		
		// if value is no 
		else if (value.equalsIgnoreCase("No")) {
			
			//prompt that type of name you would like to input
			System.out.println("Which name would you like to input? First or Last");
			Choice = keyboard.nextLine();
			
			//if choice is first
			if (Choice.equalsIgnoreCase("first")) {
				position = 1; //set position
				
				//prompt input
				System.out.println("Display your first name of your character exact way you would like it displayed.");
				name = keyboard.nextLine() ;
				
				//confirm
				System.out.println("Is this correct? " + name + " Yes or No.");
				Choice = keyboard.nextLine();
				
				//if yes prompt amount of names to generate
				if (Choice.equalsIgnoreCase("Yes")) {
				System.out.println("How many random names do you want to generate?");
				int amount = Integer.parseInt(keyboard.nextLine());
				//do while loop repeat name generator until input other then yes
				do {
				new NameGenerator(amount, name, position);
				System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
				Choice = keyboard.nextLine();
				} while(Choice.equalsIgnoreCase("yes")); //continues until value input other then yes
				System.out.println("Returning to Main Menu..."); // return to main menu prompt
			} // end of if statement for choice equaling yes
				
				//if confirmed input was no ask to re enter name
			else if (Choice.equalsIgnoreCase("No")) {
					System.out.println("Please input the correct name.");
					name = keyboard.nextLine();
				}
				//if any other input describe input as not valid
			else {
					System.out.println("That is an invalid input.");
				}
			} // end choice if first statement.
			
			//if statement for last input
			else if (Choice.equalsIgnoreCase("last")) {
				position = 2; //set position to 2
				
				//display last name prompt
				System.out.println("Display your last name the exact way you would like it displayed.");
				name = keyboard.nextLine();
				
				//confirm
				System.out.println("Is this correct? " + name + " Yes or No.");
				Choice = keyboard.nextLine();
				
				//if confirmation correct prompt and input how many names
				if (Choice.equalsIgnoreCase("Yes")) {	
				System.out.println("How many names do you want to generate?");
				int amount = Integer.parseInt(keyboard.nextLine());
				keyboard.nextLine();
				
				//do while loop - NameGenerator for last name and repeat asking the user if they want a list of new names until other input
				do {
				new NameGenerator(amount, name, position);
				System.out.println("Would you like a new list of names? Yes to recieve new names, any other input will return to main menu.");
				choice2 = keyboard.nextLine();
				} while(choice2.equalsIgnoreCase("Yes")); //while user wants more lists; end do while
				System.out.println("Returning to Main Menu...");
			}// end choice yes if
				
			//else if choice is no ask for correct name input
			else if (Choice.equalsIgnoreCase("No")) {
					System.out.println("Please input the correct name.");
					name = keyboard.nextLine();
				}// end else if
				
				//other input means invalid input
			else {
					System.out.println("That is an invalid input, please try again.");
				}// end else	
			} //end else if 
			
			//if none of the other options print that the option is not valid.
			else {
				System.out.println("This is not a valid input, please try again.");
			} // end else 
			
			} //end if else 'no' for option C
		
	} //end option C else if 
	
		//if none of the other options print that the option is not valid
		else {
			System.out.println("This is not a valid input, please try again.");
		}
	
	//if 'quit' option
	if (mainInput.equalsIgnoreCase("Quit")) {
		programRun = false; //break while loop
		keyboard.close(); //close scanner
		} // close if Quit statement
	
	System.exit(0);} //close program run
	
} //close main method 
	
}//close main class
