package linkedList;

public class LinkedListEx {
	int length;
	static class Node{
		int data;
		Node next;
		Node(int x){
			this.data=x;
		}
	}
	private Node first=null;
	//add element from start
    //	last should point to null too 
	private Node last=null;
	
//	ADDING NODE AT AT START IS  0(1)
	public void addStart(Node y) {
		y.next=first;
		first=y;
		length++;
	}
//	print list
	public void print() {
		Node temp=first;
		while(temp.next !=null) {
//			System.out.print(temp.data+"->");
			temp=temp.next;
			System.out.print(temp.data+"->");
		}
	}
	public void getLength() {
		System.out.println("the length of link is: "+length);
	}
    public void getLast() {
    	if(length==0) {
    		last=first=null;
    	}
    	Node temp=first;
    	
    	while(temp !=null) {
    	 System.out.println("never run"+temp.data); 
    	  temp=temp.next;
    	}
    	
    }
	public static void main(String[] args) {
		LinkedListEx w= new LinkedListEx();
		w.addStart(new Node(66));
		w.addStart(new Node(98));
		w.addStart(new Node(20));
		w.addStart(new Node(53));
		w.addStart(new Node(78));
		w.addStart(new Node(10));
		w.addStart(new Node(99));
		
		w.getLength();
//		w.getLast();
		w.print();
      
	}

}
