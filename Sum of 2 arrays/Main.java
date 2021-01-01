import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Main
{
  public static void main(String args[])throws Exception
  {
    //Try out your code here
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> Arr = new ArrayList<>();
		ArrayList<Integer> Arr1 = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int x = Integer.parseInt(br.readLine());
			Arr.add(x);
		}
		for(int j =0;j<n;j++) {
			int y = Integer.parseInt(br.readLine());
			Arr1.add(y);
		}
		for(int k =0;k<=n-1;k++) {
			int num = Arr.get(k);
			int num1 = Arr1.get(k);
			int sum = num+num1;
			System.out.println(sum);
		}
  }
}