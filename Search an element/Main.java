import java.util.Scanner;
import java.util.ArrayList;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0 ; i<n ; i++) {
			int n1 = sc.nextInt();
			list.add(n1);
		}
		int a = sc.nextInt();
		//System.out.println(list);
		int searchedElem = 0;
		for(int j = 0; j<list.size();j++) {
			int elem = list.get(j);
			if(elem == a) {
				 searchedElem = elem;
			}
		}
		if(searchedElem != 0)
			System.out.println(searchedElem +" is present in the array");
		else
			System.out.println(a + " is not present in the array");
		
    }
}