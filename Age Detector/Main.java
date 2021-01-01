import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
   Scanner sc = new Scanner(System.in);
	    int byear = sc.nextInt();
	    int cyear = sc.nextInt();
	if(byear>cyear) {
		int y = byear - 100;
		int x = y - cyear;
		System.out.println(Math.abs(x));
	}else {		
		int age = byear - cyear;
		System.out.println(Math.abs(age));
    }
  }
}