import java.io.File; //import File
import java.util.ArrayList; //import Array list
import java.util.Scanner; //import Scanner
import java.io.FileNotFoundException; //import File not found exception
import java.util.Random; //import random

public class NameGenerator { //Creates a name generation using two premade lists
	
	public ArrayList<String> listFN = new ArrayList<String>(); //private variable for first names
	public ArrayList<String> listLN = new ArrayList<String>(); //private variable for last names
	private Random RNumber = new Random(); //random variable
	private int RandNumber; // random integer
	private int count; //counter integer
	public Scanner firstNames = new Scanner (new File("firstNames.txt"));
	public Scanner lastNames = new Scanner (new File("lastNames.txt"));
	
	// Constructor
	public NameGenerator(int amount) throws FileNotFoundException { //file not found exception
	
	//for loop for amount which is the amount which was the passed variable
	for (count = 0; count < amount; count++) {
	RandNumber = RNumber.nextInt(4000);	
	
	//while loop for each first name input until no next line
	while (firstNames.hasNextLine()) {
		listFN.add(firstNames.nextLine());
	}
	//prints a random name from the list
	System.out.print(listFN.get(RandNumber) + ' ');
	
	//grabs a new random number 
	RandNumber = RNumber.nextInt(4900);	
	
	//while loop for each last name input until no next line
	while (lastNames.hasNextLine()) {
		listLN.add(lastNames.nextLine());
	}
	//prints a random last name based on random number
	System.out.println(listLN.get(RandNumber));
	} // for loop ends
	} // constructor ends
	
	//method for if passing amount, string, and position
	public NameGenerator(int amount, String name, int position) throws FileNotFoundException {
		
		//start for loop
		for (count = 0; count < amount; count++) {
		RandNumber = RNumber.nextInt(4900);	
		
		//adds a new name if there is a next line to ListFN
		while (firstNames.hasNextLine()) {
			listFN.add(firstNames.nextLine());
		}
		
		//if in position 1 it prints the name passed with the format of a first name
		if (position == 1) {
		System.out.print(' ' + name + ' ');
		}
		
		//if not position 1 then grabs a random name for first name;
		else {
		System.out.print(listFN.get(RandNumber));
		}
		//then it grabs a new random number
		RandNumber = RNumber.nextInt(4000);
		
		//while loop for the last name has next line add the last name entered to the list array list
		while (lastNames.hasNextLine()) {
			listLN.add(lastNames.nextLine());
		}
		//if position two display the passed name in the last name position
		if (position == 2) {
		System.out.println(' ' + name);
			}
		//else print a random last name.
		else {
		System.out.println(listLN.get(RandNumber));
		} // close else
		} // close for loop
	}// close method
}//close class
