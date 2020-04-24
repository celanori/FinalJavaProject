//import java random utility
import java.util.Random;

//public class
public class InitiativeRollDice {
	
	//create static variable
	static Random RNumber = new Random();
	int RandNumber;
	
	//create static method
	public static int RollDice () {
		
	//sets RandNumber to the newRandom(); based on the next int between 1 - 20 (which is all initiative dice rolls are
	int RandNumber = RNumber.nextInt(19)+1;
	
	//returns random number
	return (RandNumber);
	}
}
