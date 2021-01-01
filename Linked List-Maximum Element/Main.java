import java.util.Scanner;

public class Main {
    Node head;
    class Node{
	int data;
	Node next;
	
	Node(int n){
	    data = n;
	    next = null;
	}
    }
    
    // insert at end
    public void insert_at_end(int x) {
	Node newNode = new Node(x);
	Node temp = head;
	// check for empty queue
	if(head == null) {
	    head = newNode;
	}else {
	    while(temp.next != null) {
		temp = temp.next;
	    }
	    temp.next = newNode;
	}
    }
    
  
 	// print Queue elements
 public int printQueue() {
     int max = 0;
	Node temp = head;
	
	while(temp != null) {
	    if(temp.data > max) {
		max = temp.data;
	    }
	    System.out.print(temp.data+" ");
	    temp = temp.next;
	}
	return max;
     }
 
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Main stack = new Main();

	  while(true)
    		{
    			int x = sc.nextInt();
    			if(x > 0)
    			{
    				stack.insert_at_end(x);
    			}
    			else
    			{
    				break;
    			}
    		}
	  System.out.println("The students marks are:");
	 int marks = stack.printQueue();
	 System.out.println();
	 System.out.println("The maximum mark is "+marks+".");
	
    }

}