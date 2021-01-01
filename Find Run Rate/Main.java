import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
//Main class to control all other classes



abstract class Match{
	private int currentScore;
	private float currentOver;
	private int target;
	abstract float calculateRunrate(int remScore,float remOver);
	abstract int calculateBalls();
	public void display(double reqRunRate,int balls) {
		DecimalFormat df = new DecimalFormat("0.00");
		//df.setRoundingMode(RoundingMode.UP);
		int remScore = target-currentScore;
		System.out.println("Requirements:");
		System.out.println("Need "+remScore+" Runs in "+balls+" balls");
		System.out.println("Required Run Rate- "+df.format(reqRunRate)); 	
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
}
class  ODIMatch extends Match{
	public int calculateBalls(){
		int balls = (int) (50 * 6);
		return balls;
	 }
	public float calculateRunrate(int remScore,float remOver){
		return remScore/remOver;	
	 }	
}
class T20Match extends Match{
	public int calculateBalls(){
		int balls = (int) (20 * 6);
		return balls;
	 }
	public float calculateRunrate(int remScore,float remOver){
		 return remScore/remOver;
	 }
}
class  TestMatch extends Match{
	public int calculateBalls(){
		int balls = (int) (90 * 6);
		return balls;
	 }
	public float calculateRunrate(int remScore,float remOver){
		 return remScore/remOver;
	 }
}
public class Main{
	public static void main(String[] args) throws IOException,Exception {
	 InputStreamReader r=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(r);
	  String n = br.readLine();
	  int option = Integer.parseInt(n.trim());
	  if(option == 1) {
		 ODIMatch odi = new ODIMatch(); 
		 String n1 = br.readLine();
		  int curScore = Integer.parseInt(n1.trim());
		  odi.setCurrentScore(curScore);
		  String n2 = br.readLine();
		  int curOverOfTeam = Integer.parseInt(n2.trim());
		  odi.setCurrentOver(curOverOfTeam);
		  String n3 = br.readLine();
		  int targetScore = Integer.parseInt(n3.trim());
		  odi.setTarget(targetScore);
		  float ballplay = odi.getCurrentOver()*6;
		  int remballs = (int) (odi.calculateBalls()-ballplay);
		  float remOver = 50 - odi.getCurrentOver();
		  int remScore = odi.getTarget() - odi.getCurrentScore(); 
		  float runrate = odi.calculateRunrate(remScore,remOver);
		  odi.display(runrate, remballs); 
	 }
	 else if(option == 2) {
		  T20Match t20 = new T20Match();
		  String n1 = br.readLine();
		  int curScore = Integer.parseInt(n1.trim());
		  t20.setCurrentScore(curScore);
		  String n2 = br.readLine();
		  int curOverOfTeam = Integer.parseInt(n2.trim());
		  t20.setCurrentOver(curOverOfTeam);
		  String n3 = br.readLine();
		  int targetScore = Integer.parseInt(n3.trim());
		  t20.setTarget(targetScore);
		  float ballplay = t20.getCurrentOver()*6;
		  int remballs = (int) (t20.calculateBalls()-ballplay);
		  float remOver = 20 - t20.getCurrentOver();
		  int remScore = t20.getTarget() - t20.getCurrentScore(); 
		  float runrate = t20.calculateRunrate(remScore,remOver);
		  t20.display(runrate, remballs); 
	 }
	 else if(option == 3) {
		  TestMatch tm = new TestMatch();
		  String n1 = br.readLine();
		  int curScore = Integer.parseInt(n1.trim());
		  tm.setCurrentScore(curScore);
		  String n2 = br.readLine();
		  int curOverOfTeam = Integer.parseInt(n2.trim());
		  tm.setCurrentOver(curOverOfTeam);
		  String n3 = br.readLine();
		  int targetScore = Integer.parseInt(n3.trim());
		  tm.setTarget(targetScore);
		  float ballplay = tm.getCurrentOver()*6;
		  int remballs = (int) (tm.calculateBalls()-ballplay);
		  float remOver = 90 - tm.getCurrentOver();
		  int remScore = tm.getTarget() - tm.getCurrentScore(); 
		  float runrate = tm.calculateRunrate(remScore,remOver);
		  tm.display(runrate, remballs);
	 }
	 else {
		 System.out.println("Invalid Input");
	 }
	}  }
