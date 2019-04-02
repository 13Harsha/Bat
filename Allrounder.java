package codingChallenge;

public class Allrounder extends KabaddiPlayer implements IPlayerStatistics {
		
		private long	noOfRaids;
		private	long raidPoints;
		private long	defencePoints;
		private long	noOfTotalPoints;
		public long getNoOfRaids() {
			return noOfRaids;
		}
		public void setNoOfRaids(long noOfRaids) {
			this.noOfRaids = noOfRaids;
		}
		public long getRaidPoints() {
			return raidPoints;
		}
		public void setRaidPoints(long raidPoints) {
			this.raidPoints = raidPoints;
		}
		public long getDefencePoints() {
			return defencePoints;
		}
		public void setDefencePoints(long defencePoints) {
			this.defencePoints = defencePoints;
		}
		public long getNoOfTotalPoints() {
			return noOfTotalPoints;
		}
		public void setNoOfTotalPoints(long noOfTotalPoints) {
			this.noOfTotalPoints = noOfTotalPoints;
		}
		public Allrounder(String name, String teamName, long noOfMatches) {
			
			this.name=name;
			this.teamName=teamName;
			this.noOfMatches=noOfMatches;
			
			
		}

		public void displayPlayerStatistics() {
			System.out.println("Player name : "+super.getName());
	        System.out.println("Team name : "+super.getTeamName());
	        System.out.println("no ofraid points : "+this.getNoOfRaids());
	        System.out.println("Defence Points : "+this.getDefencePoints());
	       
			
		} 
		
		
}
