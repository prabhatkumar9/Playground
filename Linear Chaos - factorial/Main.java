import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
class OneException extends Exception
{
    OneException(String message)
    {   
        System.out.println(message);       
    }
}

public class Main{
	
	
	
	public static int fact(int a)
	 {
	  int result=1;
	  for(;a>0;a--) 
	  {
	   result=result*a;
	   }
	  return result;
	  }
	
	
	
	  public static void main(String[] args)throws Exception {
	   InputStreamReader r=new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(r);
	    int a = Integer.parseInt(br.readLine().trim());
	    
	    
	    try {	    	
	   	        if(a < 0) {	      
	                   throw new OneException("Invalid Input");
	                 }else {
	                	 int result = fact(a);
	                	 System.out.println(result);
	                 }
	    	}
	   catch(OneException e)
	    	{

	    	} 
	   
	  }
}
