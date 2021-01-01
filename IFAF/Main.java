// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;

interface IPlayerStatistics {
	public void displayPlayerStatistics();
}
class Player implements IPlayerStatistics {
	private String name ;
	private String teamName;
	private Integer no0fMatches;
	private Long totalgoals;
	
	@Override
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("Player name: "+name);
		System.out.println("Team name: "+teamName);
		System.out.println("No of matches: "+no0fMatches);
		System.out.println("Total goals: "+totalgoals);
	}
	Player(String name,String teamName,Integer no0fMatches,long totalgoals){
		this.name=name;
		this.teamName=teamName;
		this.no0fMatches=no0fMatches;
		this.totalgoals=totalgoals;
	}
	
}
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String tname = sc.nextLine();
		int Mplayed = sc.nextInt();
		long goals = sc.nextLong();
		if(Mplayed == 0 || goals==0 ){
          System.out.println("Invalid Input");
        }else{
		IPlayerStatistics p = new Player(name,tname,Mplayed,goals);
		p.displayPlayerStatistics();
  		}
  }
}