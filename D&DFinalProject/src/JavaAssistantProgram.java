import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class JavaAssistantProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
	
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
