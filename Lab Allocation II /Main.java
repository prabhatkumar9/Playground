import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		int y = Integer.parseInt(sc.nextLine());
		int z = Integer.parseInt(sc.nextLine());
    	String FaceTraining = sc.nextLine();
		if(FaceTraining.equals("L1")) {
			if(y<=z){
				System.out.println("L2");
			}else {
				System.out.println("L3");
			}
		}else if(FaceTraining.equals("L2")) {
//			System.out.println(Math.max(x,z));
			if(z<=y){
				System.out.println("L3");
			}else {
				System.out.println("L1");
			}
		}else if(FaceTraining.equals("L3")) {
			if(x<=y) {
				System.out.println("L1");
			}else {
				System.out.println("L2");
			}
		}
		else{
			System.out.println("Invalid");
		}
  }
}