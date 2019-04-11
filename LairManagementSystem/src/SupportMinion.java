
public class SupportMinion extends Minion {

	  public SupportMinion(String newMinionId) {
	        super(newMinionId);
	    }
	  
	  public SupportMinion(String newMinionId, String newGivenName, String newFamilyName) {
	        super(newMinionId, newGivenName, newFamilyName);
	    }
	  
	  public int monthlyPay() {

	        int basePay = 3000;
	        int payPerSkill = 500;

	        int totalPay = basePay + payPerSkill * this.minionSkills.size();

	        return totalPay;
	    }
}
