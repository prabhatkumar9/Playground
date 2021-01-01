import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
   		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		int ns = s.length();
		String [] n =s.split("/",3);
		if(ns<=2){
			try {
				s=null;
				System.out.println("Splitted string at index 2 is : "+s.length());
			}catch(Exception e){
				System.out.println("Exception : "+e);
			}finally{
				System.out.println("Inside finally block");			
			}
		}else {
		try {
			if(n[2] != null) {
			String [] n1 =s.split("/",3);
			System.out.println("Splitted string at index 0 is : "+n1[0]);
			System.out.println("Splitted string at index 1 is : "+n1[1]);
			System.out.println("Splitted string at index 2 is : "+n1[2]);				
			}
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("Splitted string at index 0 is : "+n[0]);
			System.out.println("Splitted string at index 1 is : "+n[1]);
		}
		finally{
			System.out.println("Inside finally block");			
		}
	}
  }
}