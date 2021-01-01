import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	if(a==0) {
		System.out.println("Invalid Input");
	}else if(b==0) {
		System.out.println("Invalid Input");
	}else {
		if(a>=b) {
			System.out.println("Refer Sample Input and Output for formatting specifications.");
		}else {
		int neg =a;
		int pos = 0;
		for(int i = 0 ; neg<=b;i++) {
			pos = a+i;
			System.out.println(pos);
			neg++;
		}
	}
		}
  }
}