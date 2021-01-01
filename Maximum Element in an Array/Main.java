import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Main
{
    public static void main(String args[])throws NumberFormatException, IOException 
    {
        //fill the code;
      		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n==0) {
			System.out.println("Invalid Input");
		}else {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
		}
		//System.out.println(list);
		int max = list.get(0);
		for(int j =0;j<=list.size()-1;j++) {
			if(list.get(j)>max) {
				max = list.get(j);
			}
		}
		System.out.println(max+" is the maximum element in the array");
	}
    }
}