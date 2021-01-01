import java.util.ArrayList;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    				Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList();
		ArrayList<Integer> arr2 = new ArrayList();
		for(int i =0;i<n;i++) {			
			int a = sc.nextInt();
			arr1.add(a);
		}
		for(int i =0;i<n;i++) {			
			int a = sc.nextInt();
			arr2.add(a);
		}
//		System.out.println(arr1);
//		System.out.println(arr2);
		int count =0;
		int len1 = arr1.size();
		int len2 = arr2.size();
		if(n==0) {
			System.out.println("Invalid Input");
		}else {
			if(len1==len2) {
				for(int j=0;j<len1;j++) {
					int ith_Elem = arr1.get(j);
					for(int k=0;k<len2;k++) {
						int ith_Elem2 = arr2.get(k);
						//System.out.println(ith_Elem + " "+ith_Elem2);
						if(ith_Elem < ith_Elem2) {
							count++;
						}
					}				
				}
				if(count!=0)
					System.out.println("Incompatible");
				else
					System.out.println("Compatible");
				
			}
		}
		
  }
}