///import java.util
import java.util.ArrayList;
import java.util.Collections;

//Encounter class to create an encounter
public class EncounterClass {
	
	//variables used
	private int size;
	private int count;
	ArrayList<String> order;
	ArrayList<Integer> rolledNumbers;
	ArrayList<String> initiativeFinal;
	InitiativeRollDice roll;
	
	//Method
	public ArrayList<String> EncounterClassNew(ArrayList<String> listNames, InitiativeRollDice roll) { //aggregate class uses InitativeRollDice class
		
		ArrayList<String> order = new ArrayList<String>(); //new ArrayList String
		ArrayList<Integer> rolledNumbers = new ArrayList<Integer>(); //new ArrayList Integer
		ArrayList<String> initiativeFinal = new ArrayList<String>(); //new ArrayList String
		
		size = listNames.size(); //size of the listNames string passed
		
		//for loop for the list of names based on the size of the names
		for (count=0; count < (size); count++) {
		//uses RollDice static method of InitativeRollDice for a roll of a 20 sided die
		rolledNumbers.add(InitiativeRollDice.RollDice());
		//Adds list of names from passed list to the local list order
		order.add(listNames.get(count));
		}
		//sorts the rolled numbers
		Collections.sort(rolledNumbers, Collections.reverseOrder());
		
		//sorts the names 
		Collections.sort(order);
		
		
		//does a new for loop to combine the two lists rolled numbers, and order into one list
		for (count=0; count < (size); count++) {
			
			//converting the rolledNumbers based on count to a string
			String convertrolledNumbers = Integer.toString(rolledNumbers.get(count));
			//Adding the two now string values together
			initiativeFinal.add(order.get(count) + ' ' + convertrolledNumbers);
			} //close for loop
		return initiativeFinal; //returns the list
	} //close method
	}//close class