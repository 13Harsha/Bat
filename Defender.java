package codingChallenge;

import codingChallenge2.CricketPlayer;
import codingChallenge2.IPlayerStatistics;

public class Defender extends CricketPlayer implements IPlayerStatistics

{
                private long noOfRaids;
                private long defencePoints;
               
 
               
                
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

				Defender(long noOfRaids,long defencePoints){
					
				}


				@Override
                public void displayPlayerStatistics() {
                                System.out.println("Player name : "+super.getName());
                                System.out.println("Team name : "+super.getTeamName());
                                System.out.println("No of matches : "+super.getNoOfMatches());
                                System.out.println("raid points : "+this.getNoOfRaids());
                                System.out.println("Defence Points : "+this.getDefencePoints());
                               
                }
}