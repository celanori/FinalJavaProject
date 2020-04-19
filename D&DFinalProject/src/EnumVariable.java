enum Team {ALLY, ENEMY}

public class EnumVariable {
	
Team team;

public EnumVariable (Team team) {
	this.team = team;
}

public String teamChoice(){
	String value = "";
	
	switch(team)
	{
	case ALLY:
	System.out.println("Please print the names of your ally party members names.");
	return value = "Ally";
	
	case ENEMY:
	System.out.println("Please print the names of the enemy team members.");
	return value = "Enemy";
	
	default:
	System.out.println("Your party must be an ally or an enemy. Please select 'Enemy' or 'Ally.'");
	return value = "Error";
	
	}
	}
}

