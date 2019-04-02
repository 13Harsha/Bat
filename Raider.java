package codingChallenge;

public  class Raider extends KabaddiPlayer implements IPlayerStatistics {
	private long noOfRaids;
	private	long defencePoints;
	
	public long getNoOfRaids() {
		return noOfRaids;
	}

	public void setNoOfRaids(long noOfRaids) {
		this.noOfRaids = noOfRaids;
	}

	public long getDefencePoints() {
		return defencePoints;
	}

	public void setDefencePoints(long defencePoints) {
		this.defencePoints = defencePoints;
	}
	public Raider(String name,  long noOfRaids ) {
		super();
        this.name = name;
        this.noOfRaids = noOfRaids;
		}
	 

	public void displayPlayerStatistics() {
		System.out.println("Player name : "+super.getName());
        System.out.println("Team name : "+super.getTeamName());
        System.out.println("no ofraid points : "+this.getNoOfRaids());
        System.out.println("Defence Points : "+this.getDefencePoints());
       
		
	} 
}
	


