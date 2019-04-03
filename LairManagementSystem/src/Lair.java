import java.util.ArrayList;

public class Lair {
	// creating an array of LairLocations that can contain 3 objects
	private LairLocation[] locationsArray = new LairLocation[4];

	// printStatus method 
	public void printStatus() {
	    System.out.println("Welcome to the Supervillain’s Lair Management System.");
	    System.out.println();
	    createLairLocations();
	    createMinions();
	    displayLairLocations();
	    
//	    Minion minion = new Minion("2823535");
//	    minion.addSkill(MinionSkill.SCUBA);
//	    minion.addSkill(MinionSkill.ROCKETRY);
//	    System.out.println(minion.hasSkill(MinionSkill.PSYCHOLOGY));
//	    System.out.println(minion.hasSkill(MinionSkill.ROCKETRY));
	    
	    System.out.println();
	    System.out.println("Good-bye. Thank you for using the Supervillain’s Lair Management System.");
	
	}
	
	// assigning LairLocations object of array 
	public void createLairLocations() {
		locationsArray[0] = new LairLocation("Shark Tank","Full of sharks with laser beams on their heads");
		locationsArray[1] = new LairLocation("Boardroom","Where we plot world domination");
		locationsArray[2] = new LairLocation("Janitorial","Cleans up the mess");
		locationsArray[3] = new LairLocation("Lava Pit","Spits fireballs");
	   
	}
	
	// display method
	public void displayLairLocations() {
		
		// loop to go through locations array and get descriptions
		for (int i = 0; i < locationsArray.length; i++) {
			System.out.println(locationsArray[i].description());
			
			System.out.println("Assigned Minions: ");
			
			// creating temporary variable to get minion list
			ArrayList<Minion> thisMinionList = locationsArray[i].getMinions();
			
			for (int j = 0; j < thisMinionList.size(); j++) {
			System.out.println(thisMinionList.get(j).description());
			}
			
			System.out.println();
		}	
	}
	
	// creating Minions and assigning locations
	public void createMinions() {
		Minion minion1 = new Minion("12345678","Mini","Me");
		Minion minion2 = new Minion("12345679","Chum","Burley");
		Minion minion3 = new Minion("12345670","Donna","Matrix");
		Minion minion4 = new Minion("12345666","Domestos","McBleach");
		Minion minion5 = new Minion("12103464","Pyne","O'Kleen");
		Minion minion6 = new Minion("12342312","Jenny","Young");
		Minion minion7 = new Minion("12312312","Pink","Black");
		
		locationsArray[0].assignMinion(minion1);
		locationsArray[0].assignMinion(minion2);
		locationsArray[1].assignMinion(minion3);
		locationsArray[2].assignMinion(minion4);
		locationsArray[2].assignMinion(minion5);
		locationsArray[3].assignMinion(minion6);
		locationsArray[3].assignMinion(minion7);
		
		
	}

}
