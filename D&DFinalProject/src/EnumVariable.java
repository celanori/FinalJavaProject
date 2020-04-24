//create enum variable
enum Team {ALLY, ENEMY}

//create enum class
public class EnumVariable {
//set variable
String value;	
Team team;

//variable equals variable passed to it
public EnumVariable (Team team) {
	this.team = team;
}

public String teamChoice(){
	
	//start switch based on case of the passed enum
	switch(team)
	{
	
	//if ally passed then the following executes and return a string value of equal to the enum
	case ALLY:
	System.out.println("Please print the names of your ally party members names.");
	return value = "Ally";
	
	//if enemy passed then the following executes and return a string value of equal to the enum
	case ENEMY:
	System.out.println("Please print the names of the enemy team members.");
	return value = "Enemy";
	
	//for any other case passed then the following executes and return a string value of equal to "Error" (because no other type of case of enum should exist).
	default:
	System.out.println("Your party must be an ally or an enemy. Please select 'Enemy' or 'Ally.'");
	return value = "Error";
	
	}
	}
}

