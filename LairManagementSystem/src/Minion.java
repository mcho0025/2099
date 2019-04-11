import java.util.ArrayList;

public abstract class Minion {

	private String minionId; 
	private String givenName; 
	private String familyName;
	protected ArrayList<MinionSkill> minionSkills = new ArrayList<MinionSkill>();

	
	public abstract int monthlyPay();
	
	public enum MinionSkill {
		SCUBA, PSYCHOLOGY, ROCKETRY
	}
	
	// Constructors
	public Minion(String newMinionId) {
		minionId = newMinionId;
	}
	
	public Minion(String newMinionId, String newGivenName, String newFamilyName) {
		minionId = newMinionId;
		givenName = newGivenName;
		familyName = newFamilyName;
	}
	
	// Mutators
	public void setGivenName(String newGivenName) {
		givenName = newGivenName;
	}
	
	public void setFamilyName(String newFamilyName) {
		familyName = newFamilyName;
	}
	
	// description method
	public String description() {
		return minionId + " " + givenName + " " + familyName;
	}
	
	public void addSkill(MinionSkill skill) {
		minionSkills.add(skill);
	}
	
	public boolean hasSkill(MinionSkill skill) {
		boolean check = false;
		for (int i = 0; i < minionSkills.size(); i++) {
			if (skill == minionSkills.get(i)) {
				check = true;
			}
		}
		return check;
	}
	
}

