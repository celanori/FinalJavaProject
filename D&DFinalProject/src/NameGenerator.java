import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

public class NameGenerator {
	
	private ArrayList<String> listFN;
	private ArrayList<String> listLN;
	private Random RNumber;
	private int RandNumber;
	private int count;
	
	// Constructor
	public NameGenerator(int amount) throws FileNotFoundException {
	RNumber = new Random();
	Scanner firstNames = new Scanner (new File("firstNames.txt"));
	Scanner lastNames = new Scanner (new File("lastNames.txt"));
	listFN = new ArrayList<String>();
	listLN = new ArrayList<String>();
	for (count = 0; count < amount; count++) {
	RandNumber = RNumber.nextInt(4000);	
	while (firstNames.hasNextLine()) {
		listFN.add(firstNames.nextLine());
	}
	System.out.print(listFN.get(RandNumber) + ' ');
	RandNumber = RNumber.nextInt(4000);	
	while (lastNames.hasNextLine()) {
		listLN.add(lastNames.nextLine());
	}
	System.out.println(listLN.get(RandNumber));
	}
	}
	
	public NameGenerator(int amount, String name, int position) throws FileNotFoundException {
		RNumber = new Random();
		Scanner firstNames = new Scanner (new File("firstNames.txt"));
		Scanner lastNames = new Scanner (new File("lastNames.txt"));
		listFN = new ArrayList<String>();
		listLN = new ArrayList<String>();
		for (count = 0; count < amount; count++) {
		RandNumber = RNumber.nextInt(4000);	
		while (firstNames.hasNextLine()) {
			listFN.add(firstNames.nextLine());
		}
		if (position == 1) {
		System.out.print(' ' + name + ' ');
		}
		else {
		System.out.print(listFN.get(RandNumber));
		}
		RandNumber = RNumber.nextInt(4000);	
		while (lastNames.hasNextLine()) {
			listLN.add(lastNames.nextLine());
		}
		if (position == 2) {
		System.out.println(' ' + name);
			}
		else {
		System.out.println(listLN.get(RandNumber));
		}
		}
	}
}
