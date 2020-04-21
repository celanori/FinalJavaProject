import java.io.FileNotFoundException;
import java.util.*;


public class JavaAssistantProgram {
//changing one thing to see if github is working.
	public static void main(String[] args) throws FileNotFoundException {

	//Option A
		int total = 0; //initializing the total variable
		Scanner keyboard = new Scanner(System.in); // create new scanner object
		int inputOne; //initalize varibale to read keyboard first keyboard input.
		String inputTwo; // initialize variable to read second keyboard input. 
		char rerun; // intialize char variable to end or continue the do-while loop.
	do {//Start of the do-while loop.
			
			
			System.out.println("What kind of die do you wish to roll? \n" + "Please enter 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 12 - for 12 sided die, or 20 - for 20 sided die");// ask user what kind of die they want to roll.
			inputOne = keyboard.nextInt();
			while ( inputOne != 4 && inputOne != 6 && inputOne != 8 && inputOne != 10 && inputOne != 12 && inputOne != 20 ) {//validate user input.
				System.out.println("Please enter one of the options given: 4 - for 4 sided die, 6 - for 6 sided die, 8 - for 8 sided die , 10 - for 10 sided die, 12 - for 12 sided die, or 20 - for 20 sided die ");
				inputOne = keyboard.nextInt();
			}
		
			if (inputOne == 4) {// if user input 4.
				FourDieRoll four = new FourDieRoll();// create new fourdieroll object.
				total = four.getRoll(); //set total to the total obtained from the object. 
				}
			
		
			else if (inputOne == 6) {// if user input 6
				SixDieRoll six = new SixDieRoll();// create new sixdieroll object.
				total = six.getRoll();// set total to the total obtained from the object.
			}
			
			 
			else if (inputOne == 8) {// if the user input 8.
				EightDieRoll eight = new EightDieRoll();// create new eightdieroll object.
				total = eight.getRoll();//set total to the total obtained from the object.
			}
			
			else if (inputOne == 10) { // if the user input 10.
				TenDieRoll ten = new TenDieRoll();// create new tendieroll class object.
				total = ten.getRoll();// set total to the total obtained from the object.
			}

			else if (inputOne == 12) {//if the user input 12.
				TwelveDieRoll twelve = new TwelveDieRoll();// create new twelve die roll object.
				total = twelve.getRoll();// set total to the total obtained from the object.
			}
			
		
			else {//if the user input 20.
				TwentyDieRoll twenty = new TwentyDieRoll();// create new twentyrolldie object.
				total = twenty.getRoll();// set total to the total obtained from the object.
			}
			
			System.out.println(total);//Display the end total.
			
			keyboard.nextLine();// Skip a line.
			
			System.out.println("Would you like to reroll another set of dice?");// ask the user if they wish to continue.
			System.out.println("Enter y to reroll. Any other input will return to main menu: ");
			inputTwo = keyboard.nextLine();
			rerun = inputTwo.charAt(0);
	} while (rerun == 'y'|| rerun == 'Y');// end of do while loop. 
	
	
		ArrayList<String> listPartyName = new ArrayList<String>();
		ArrayList<String> listEnemyName = new ArrayList<String>();
		String Answer = " ";
		boolean error = false;
		//Option B
		InitiativeRollDice roll = new InitiativeRollDice();
		Scanner input1 = new Scanner(System.in);
		while(error == false) {
		System.out.println("Who would you like to list first Ally or Enemy?");
		String inputTest1 = input1.nextLine();
		if (inputTest1.equalsIgnoreCase("Ally") || (inputTest1.equalsIgnoreCase("Enemy"))) {
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
				
				System.out.println("What other ally name would you like to add?");
				inputTest = input1.nextLine();
				
		}
		}
		System.out.println("This is the fighting order of your party.");
		EncounterClass PartyFightOrder  = new EncounterClass(listPartyName, roll);
		System.out.println("This is the fighting order of your enemies.");
		EncounterClass EnemyFightOrder  = new EncounterClass(listEnemyName, roll);
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
