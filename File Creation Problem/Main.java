import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		try {
			File file = new File(br.readLine().trim());
		
			if(file.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}

	}

}