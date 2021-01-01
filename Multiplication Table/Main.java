import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    	Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
	if(n==0) {
		System.out.println("Invalid Input");
	}else {
		int neg =1;
		int pos = 0;
		for(int i = 1 ; i<=n;i++) {
			neg = m*i;
			System.out.println(i+"*"+m+"="+neg);
		}
	}
  }
}