import java.util.Scanner;
public class Main {
    Node head;
    class Node{
	int data;
	Node next;
	Node(int x){
	    this.data = x;
	    next = null;
	}
    }
    
    // insert element at top of stack
    public void push_element(int n) {
	Node new_node = new Node(n);
	if(head == null) {
	    head = new_node;
	}else {
	    // new node will be head that will make new element at top of stack 
	    new_node.next = head;  // head will be new_node.next 
	    head = new_node;  	// new head will new_node
	}
    }
    
    // print all elements of stack
    public void display() {
	Node temp = head;
	while(temp != null) {
	    System.out.print(temp.data+" ");
	    temp = temp.next;
	}
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Main stack = new Main();

	  while(true)
    		{
    			int x = sc.nextInt();
    			if(x > 0)
    			{
    				stack.push_element(x);
    			}
    			else
    			{
    				break;
    			}
    		}
	stack.display();
	
    }
}