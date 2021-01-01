// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;

class BasicInfoOfBike {
	protected String model; 
	protected Long mileage;
	BasicInfoOfBike(String model,Long mileage){
		this.model = model;
		this.mileage = mileage;
	}
	public void displayDetails() {
		System.out.println("Bike model: "+model);
		System.out.println("Mileage: "+mileage);
	}
}
class AdvancedInfoOfBike  extends BasicInfoOfBike{
	private String bikeOwnedBy; 
	private String color; 
	private String bikeNumber; 
	AdvancedInfoOfBike(String model, Long mileage,String bikeOwnedBy,String color,String bikeNumber) {
		super(model, mileage);
		this.bikeOwnedBy = bikeOwnedBy;
		this.color = color;
		this.bikeNumber = bikeNumber;
	}
	public void displayDetails() {
		System.out.println("Bike Details:");
		System.out.println("Bike model: "+model);
		System.out.println("Mileage: "+mileage +" km/l");
		System.out.println("Company name: "+bikeOwnedBy);
		System.out.println("Bike color: "+color);
		System.out.println("Bike Number: "+bikeNumber);
	}
	
}
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
     Scanner sc = new Scanner(System.in);
	  String model = sc.nextLine();
	  long mileage = Long.parseLong(sc.nextLine());
	  String cname = sc.nextLine();
	  String color = sc.nextLine();
	  String Bnumber = sc.nextLine();
	  AdvancedInfoOfBike b1 = new AdvancedInfoOfBike(model,mileage,cname,color,Bnumber);
	  b1.displayDetails();
  }
}