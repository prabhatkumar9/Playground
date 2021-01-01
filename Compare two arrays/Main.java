import java.util.ArrayList;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> Array1 = new ArrayList();
		ArrayList<Integer> Array2 = new ArrayList();
		 for(int i = 1 ; i <=n;i++) {
			 int a = sc.nextInt();
			 Array1.add(a);
		 }
		 for(int i = 1 ; i <=n;i++) {
			 int a = sc.nextInt();
			 Array2.add(a);
		 }
		//System.out.println(Array1);
		//System.out.println(Array2);
		int count = 0;
		for(int j=0;j<Array1.size();j++) {
			int elem1 = Array1.get(j);
			int elem2 = Array2.get(j);
			if(elem1 == elem2) {
				count++;
			}
		}
		if(count == Array1.size()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
				

	}
  
  
}