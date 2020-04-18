import java.util.Random;

public class InitiativeRollDice {
	
	static Random RNumber = new Random();
	int RandNumber;
	public static int RollDice () {
	int RandNumber = RNumber.nextInt(19)+1;
	return (RandNumber);
	}
}
