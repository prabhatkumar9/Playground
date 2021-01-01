// import the respective packages
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		try {
			File oldfile = new File(br.readLine().trim());
		
			File newfile =new File(br.readLine().trim());
		
			if(oldfile.renameTo(newfile)) {
				System.out.println("Renamed successfully");
			}else {
				System.out.println("error");
			}
		}catch(IOException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}

	}

}