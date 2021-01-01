import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class FootballMatch{
	void displayFootballMatchDate(String matchDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sdf.parse(matchDate);
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		String date = df.format(date1);
		System.out.println("Match Date: "+date);
	}
	 void displayFootballMatchDetails(String venue) {
		 String[] part = venue.split(",",2);
		 	System.out.println("Match Venue:");
			System.out.println("Stadium: "+part[0].trim()+"\n"+"Country: "+part[1].trim());
	 }
	 void displayFootballMatchDetails(String winnerTeam, long goals) {
		 System.out.println("Match Outcome: "+winnerTeam+" won by "+goals+" goals");
	 }
}
class Main
{
  public static void main(String args[]) throws ParseException 
  {
    //Try out your code here
   Scanner sc = new Scanner(System.in);
		Date date = new Date();
		FootballMatch f1 = new FootballMatch();
		int i = Integer.parseInt(sc.nextLine());
		if(i==1) {
			String Mdate = sc.nextLine();
			f1.displayFootballMatchDate(Mdate);
		}else if(i==2) {
			String Mvenue = sc.nextLine();
			f1.displayFootballMatchDetails(Mvenue);
		}else if(i == 3) {
			String Tname = sc.nextLine();
			long goal = Long.parseLong(sc.nextLine());
			f1.displayFootballMatchDetails(Tname, goal);
		}else {
			System.out.println("Invalid Input");
		}
  }
}