import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      char c = sc.next().charAt(0);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                System.out.println("Vowel");
            else 
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
                System.out.println("Consonant");
        else
        	System.out.println("Not an alphabet");
        
}
    }