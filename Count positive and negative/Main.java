import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	if(n==0) {
		System.out.println("Invalid Input");
	}else {
		int neg =0;
		int pos = 0;
		for(int i = 0 ; i<n;i++) {
			int input = sc.nextInt();
			if(input < 0 ) {
				neg++;
			}else {
				pos++;
			}
		}
		System.out.println("Number of positive numbers is "+pos+" and the number of negative numbers is "+neg);
	}

    }
}