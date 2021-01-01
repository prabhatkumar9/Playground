// import the respective packages
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
  public static void main(String[] args) throws IOException {
    //Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine().trim());
		ArrayList<Integer> li = new ArrayList<>();
//		//input
		for(int i=0;i<n;i++) {
			int x = Integer.parseInt(br.readLine().trim());// sc.nextInt();
			li.add(x);
			}
		
//		for(Integer l : li) {
//			System.out.println(l);
//		}
		
//		//output
		Iterator<Integer> item = li.iterator();
		int count=0;
		while(item.hasNext()) {
			int m = item.next();
			int r = m/2;
			int flag =0;
			for(int j=2;j<=r;j++) {
				if(m%j==0) {
//					System.out.println(m + "is not prime number");
					flag=1;
					break;
				}
			}if(flag==0) {
				count++;
//				System.out.println(m + "is prime number");
			}
//			System.out.println(item.next());
		}
    if(count>0) {
			System.out.println("Number of prime marks: "+count);	
		}else {
			System.out.println("Invalid Input");	
		}	
		//System.out.println("Number of prime marks: "+count);
		
	}
  }
