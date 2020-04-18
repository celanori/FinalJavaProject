import java.util.Random;

public class RollDiceTest {
	int RandNumber;
	
	public int StandardDiceRoll (int side){
		
		Random RNumber = new Random();
		int RandNumber = RNumber.nextInt(side)+1;
		return (RandNumber);
		}
	}
