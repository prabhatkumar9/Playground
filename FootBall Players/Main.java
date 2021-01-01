// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;

class FootballPlayer{
	void displayFootballPlayerDetails(String playerName, String goalKeeperName) {
		System.out.println("Player details of the football:");
		System.out.println("Main Player- "+playerName);
		System.out.println("GoalKeeper- "+goalKeeperName);
	}
	 void displayFootballPlayerDetails(Long goals) {
		 System.out.println("Number of goals scored in the match: "+goals);
	 }
}
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		if(i==1) {
			String mP = sc.nextLine();
			String gk = sc.nextLine();
			FootballPlayer f1 = new FootballPlayer();
			f1.displayFootballPlayerDetails(mP,gk);
		}else if(i==2) {
			Long goal = sc.nextLong();
			FootballPlayer f1 = new FootballPlayer();
			f1.displayFootballPlayerDetails(goal);
		}else {
			System.out.println("Invalid Input");
		}

  }
}