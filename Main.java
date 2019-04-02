package codingChallenge;

import java.util.Scanner;
 
public class Main
{
                public static void main(String[] args) {
                                Scanner sc=new Scanner(System.in);
                               
                               
                                String s="yes";
                                while (s.equalsIgnoreCase("yes"))
                                {
                                                System.out.print("Menu\n"
                                                		+ "1.Raider\n"
                                                		+ "2.Defender\n"
                                                		+ "3.AllRounder\n"
                                                		+ "Enter your choice\n");
                                               
                                                Integer choice=Integer.parseInt(sc.nextLine());
                                switch(choice)
                                {
                                case 1:
                                		System.out.println("Enter the Raider details");
                                		System.out.println("Enter player name");
                                		String name=sc.nextLine();
                                		System.out.println("Enter team name");
                                		String teamName=sc.nextLine();
                                		System.out.println("Enter number of matches played");
                                		long noOfMatches=sc.nextLong();
                                		System.out.println("Enter number of raids");
                                		long noOfRaids=sc.nextLong();
                                		Raider b=new Raider(name, noOfRaids);
                                		b.displayPlayerStatistics();
                                		break;
                               
                                case 2:
                                	System.out.println("Enter the Defender details");
                                	System.out.println("Enter player name"); 
                                	name=sc.nextLine();
                                	System.out.println("Enter team name"); 
                                	teamName=sc.nextLine();
                                	System.out.println("Enter number of matches played");
                                	noOfRaids=sc.nextLong();
                                	System.out.println("Enter Raid points"); 
                                	long defencePoints =sc.nextLong();
                                	
                                	Defender bt=new Defender(noOfRaids,defencePoints);
                                	bt.displayPlayerStatistics();
                                	break;
                               
                               
                        
                            case 3:
                                System.out.println("Enter the AllRounder details");
                                System.out.println("Enter player name"); 
                                name=sc.nextLine();
                                System.out.println("Enter team name");
                                teamName=sc.nextLine();
                                System.out.println("Enter number of matches played");
                                noOfMatches=sc.nextLong();
                                System.out.println("Enter the number of raids"); 
                                noOfRaids=sc.nextLong();
                                System.out.println("Enter number raid points ");
                                long raidPoints = sc.nextLong();
                                System.out.println("Enter number defence points ");
                                defencePoints=sc.nextLong();
                                System.out.println("Enter total points ");
                                long noOfTotalPoints = sc.nextLong();
                                Allrounder ar=new Allrounder(name, teamName, noOfMatches); 
                                ar.displayPlayerStatistics();                         
                                                break;
                                               
                                default: System.out.println("Please Enter a Valid Input");
                                continue;
                               
                               
                                }
                               
                                System.out.println("Do you want to continue?");
                                s=sc.nextLine();
                               
                               
                                }
                               
                }
}
 
