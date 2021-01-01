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
		
		String[] ss = s.split(",");
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i].trim());
		}
  }
}