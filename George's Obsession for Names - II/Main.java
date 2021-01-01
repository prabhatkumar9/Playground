// import the respective packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main{
  public static void main (String[] args)throws Exception{
    //Try out your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		int len = s.length();
		
		if(len%2==0) {
			int mid1 = len/2-1;
			int mid2 = mid1+2; 
			String fst = s.substring(0,1);
			String last = s.substring(len-1);
			String mname = s.substring(mid1,mid2);
			String fname = fst+mname+last;
			System.out.println(fname);
		}
		if(len%2!=0) {
			int mid = len/2;
			int mid1 = mid+1;
			String fst = s.substring(0,1);
			String last = s.substring(len-1);
			String midname = s.substring(mid,mid1);
			String fname = fst+midname+last;
			System.out.println(fname);
		}
  }
}