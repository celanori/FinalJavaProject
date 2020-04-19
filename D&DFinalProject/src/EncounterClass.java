import java.util.ArrayList;
import java.util.Collections;

public class EncounterClass {
	
	private int size;
	private int count;
	ArrayList<String> order;
	ArrayList<Integer> rolledNumbers;
	ArrayList<String> initiativeFinal;
	InitiativeRollDice roll;
	int rolled;
	
	public EncounterClass(ArrayList<String> listNames, InitiativeRollDice roll) {
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<Integer> rolledNumbers = new ArrayList<Integer>();
		ArrayList<String> initiativeFinal = new ArrayList<String>();
		size = listNames.size();
		for (count=0; count < (size); count++) {
		rolled = roll.RollDice();
		rolledNumbers.add(rolled);
		order.add(listNames.get(count));
		}
		Collections.sort(rolledNumbers, Collections.reverseOrder());
		Collections.sort(order);
		for (count=0; count < (size); count++) {
			String convertrolledNumbers = Integer.toString(rolledNumbers.get(count));
			initiativeFinal.add(order.get(count) + ' ' + convertrolledNumbers);
			}
		System.out.println(initiativeFinal);
	}
	}