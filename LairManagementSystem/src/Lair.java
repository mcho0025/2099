import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		for (LairLocation locations : locationsArray) {
			System.out.println(locations.description());
			
			System.out.println("Assigned Minions: ");
			
			for (int i = 0; i < locations.getMinions().size(); i++) {
				System.out.println(locations.getMinions().get(i).description());
			}
			
			 int totalPayroll = 0;
	            for (int j = 0; j < locations.getMinions().size(); j++) {
	                totalPayroll += locations.getMinions().get(j).monthlyPay();
	            }
	            System.out.println("Total payroll: $" + totalPayroll);
	            
			System.out.println();
		}	
	
	}
	
	// creating Minions and assigning locations
	public void createMinions() {
		Minion minion1 = new ResearcherMinion("12345678","Mini","Me");
		minion1.addSkill(Minion.MinionSkill.PSYCHOLOGY);
		
		Minion minion2 = new ResearcherMinion("12345679","Chum","Burley");
		minion2.addSkill(Minion.MinionSkill.PSYCHOLOGY);
		minion2.addSkill(Minion.MinionSkill.SCUBA);
		
		Minion minion3 = new ResearcherMinion("12345670","Donna","Matrix");
		minion3.addSkill(Minion.MinionSkill.SCUBA);
		
		Minion minion4 = new SupportMinion("12345666","Domestos","McBleach");
		minion4.addSkill(Minion.MinionSkill.ROCKETRY);
		
		Minion minion5 = new SupportMinion("12103464","Pyne","O'Kleen");
		minion5.addSkill(Minion.MinionSkill.PSYCHOLOGY);
		minion5.addSkill(Minion.MinionSkill.ROCKETRY);
		
		Minion minion6 = new SupportMinion("12342312","Jenny","Young");
		minion6.addSkill(Minion.MinionSkill.PSYCHOLOGY);
		
		Minion minion7 = new SupportMinion("12312312","Pink","Black");
		minion7.addSkill(Minion.MinionSkill.SCUBA);
		minion7.addSkill(Minion.MinionSkill.ROCKETRY);
		
		locationsArray[0].assignMinion(minion1);
		locationsArray[0].assignMinion(minion2);
		locationsArray[1].assignMinion(minion3);
		locationsArray[2].assignMinion(minion4);
		locationsArray[2].assignMinion(minion5);
		locationsArray[3].assignMinion(minion6);
		locationsArray[3].assignMinion(minion7);
		
		
	}

	private String readString(String prompt) {
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = null; try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace(); }
        return s; }
}
