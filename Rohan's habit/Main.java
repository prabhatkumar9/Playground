// import the respective packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
  public static void main (String[] args)throws Exception{
    //Try out your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        String str1 = str.toLowerCase();
		String word = br.readLine().trim();
    	String words = word.toLowerCase();
		String[] s = str1.split(" ");
		int count = 0;
		for(int j=0;j<s.length;j++) {
			if (words.equals(s[j])){ 
		        count++; 
            }
		    } 
			System.out.println(count);
  }
}