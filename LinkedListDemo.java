import java.util.*;
class LinkedList{
	Node head;
	public void append(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
		}
		else{
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next = n;
		}
	}
	public void printList()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else{
			Node current = head;
			while(current!=null)
			{
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public void insertStart(int data)
	{
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	//remove 1st last nth
	//inset nth
}
class Node{
	int data;
	Node next;
	
	Node(int a)
	{
		data = a;
		next = null;
	}
}
class LinkedListDemo{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.append(5);
		list.append(4);
		list.append(3);
		list.insertStart(7);
		list.printList();
	}
}