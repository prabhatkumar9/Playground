import java.util.Scanner;
class Main
{
    private static final Exception Exception = null;
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
		String Quantity = sc.next();
		try {
			if(Quantity.equals("nuLL") ||Quantity.equals("Null") || Quantity.equals("NULL")  )throw Exception ;
			System.out.println("Petrol Quantity = "+Quantity);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
			System.out.println("There is no fuel in the Bike");
		}
  }
}