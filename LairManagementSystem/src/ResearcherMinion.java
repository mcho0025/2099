
public class ResearcherMinion extends Minion {
	
	 public ResearcherMinion(String newMinionId) {
	        super(newMinionId);
	    }
	 
	 public ResearcherMinion(String newMinionId, String newGivenName, String newFamilyName) {
	        super(newMinionId, newGivenName, newFamilyName);
	    }
	 
	 public int monthlyPay(){
	        int totalPay = 0;

	        if (this.minionSkills.size() < 3){
	            totalPay = 5000;
	        }

	        else if (this.minionSkills.size() >= 3){
	            totalPay = 10000;
	        }

	        return totalPay;
	    }

}
