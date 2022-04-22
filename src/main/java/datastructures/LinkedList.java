package datastructures;
import java.util.*;
public class LinkedList {
	 Node head; // head of list

		/* Linked list Node*/
		class Node
		{
			int data;
			Node next;
			Node(int d) {data = d; next = null; }
		}

		/* Inserts a new Node at front of the list. */
		public void insertfront(int newdata)
		{
			/* 1 & 2: Allocate the Node &
					Put in the data*/
			Node newnode = new Node(newdata);

			/* 3. Make next of new Node as head */
			newnode.next = head;

			/* 4. Move the head to point to new Node */
			head = newnode;
		}
	    /* Appends a new node at the end. This method is
		defined inside LinkedList class shown above */
		public void insertend(int newdata)
		{
			/* 1. Allocate the Node &
			2. Put in the data
			3. Set next as null */
			Node newnode = new Node(newdata);

			/* 4. If the Linked List is empty, then make the
				new node as head */
			if (head == null)
			{
				head = new Node(newdata);
				return;
			}

			/* 4. This new node is going to be the last node, so
				make next of it as null */
			newnode.next = null;

			/* 5. Else traverse till the last node */
			Node last = head;
			while (last.next != null)
				last = last.next;

			/* 6. Change the next of last node */
			last.next = newnode;
			return;
		}

		/* This function prints contents of linked list starting from
			the given node */
		public void printList()
		{
			Node tnode = head;
			while (tnode != null)
			{
				System.out.print(tnode.data+" ");
				tnode = tnode.next;
			}
	    }

	    /* Given a key, deletes the first
	       occurrence of key in
	     * linked list */
	    void deleteNode(int key)
	    {
	        // Store head node
	        Node temp = head, prev = null;
	 
	        // If head node itself holds the key to be deleted
	        if (temp != null && temp.data == key) {
	            head = temp.next; // Changed head
	            return;
	        }
	 
	        // Search for the key to be deleted, keep track of
	        // the previous node as we need to change temp.next
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }
	 
	        // If key was not present in linked list
	        if (temp == null)
	            return;
	 
	        // Unlink the node from linked list
	        prev.next = temp.next;
	    }
	    public void getCount()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        System.out.println("total count :"+count);
	    
	    }



	    
	    public static void main(String[] args)
	{
	   

	    	LinkedList llist=new LinkedList();
	Scanner sc=new Scanner(System.in);
	int operationoption,option=1,value;
	do{
	    System.out.println("=========================================================================================");
	    System.out.println("enter your option\n1.addition at the front\n2.addition at back\n3.deletion \n4.count the number of nodes\n5.print the linked list");
	    operationoption=sc.nextInt();
	    
	    switch(operationoption){
	        case 1:
	        System.out.println("enter the value");
	        value=sc.nextInt();
	            llist.insertfront(value);
	            break;
	        case 2:
	        System.out.println("enter the value");
	    value=sc.nextInt();
	            llist.insertend(value);
	            break;
	        case 3:
	        System.out.println("enter the value");
	    value=sc.nextInt();
	            llist.deleteNode(value);
	            break;
	        case 4:
	            llist.getCount();
	            break;
	        case 5:
	            llist.printList();
	            break;
	            default:
	            System.out.println("invalid selection");
	            option=0;
	    }





	    System.out.println("=========================================================================================");
	System.out.println("enter your option\n1.continue\n2.exit");
	option=sc.nextInt();
	}while(option==1);

	}
}
