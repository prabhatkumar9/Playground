import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int a = sc.nextInt();
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
			pos = b-i;
			System.out.println(pos);
			neg++;
		}
	}
		}
	

    }
}