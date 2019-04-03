import java.util.ArrayList;

public class LairLocation {

	private String locationName;
    private String description;
    private ArrayList<Minion> minions = new ArrayList<Minion>();

    public LairLocation(String locationName, String description) {
        this.locationName = locationName;
        this.description = description;
    }

    public String description() {
        return locationName + ": " + description;
    }
    
    public void assignMinion(Minion minion) {
    	minions.add(minion);
    }
    
    public ArrayList<Minion> getMinions() {
    	return new ArrayList<Minion>(minions);
    }
    
    
}
	