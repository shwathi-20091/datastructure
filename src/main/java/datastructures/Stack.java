package datastructures;
import java.util.*;
public class Stack {
	static final int MAX = 1000;
	int top;
	int[] a = new int[MAX]; // Maximum size of Stack

	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}

	boolean push(int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0; 
		}
		else {
			return a[top--];
			 
		}
	}

	int peek()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			return a[top];
			
		}
	}
	
	void print(){
	for(int i = top;i>-1;i--){
	System.out.print(" "+ a[i]);
	}
}



	public static void main(String[] args)
	{
		Stack s = new Stack();
        
        Scanner sc=new Scanner(System.in);
        int operationoption;
		int option=1;
		int value;
do{
    System.out.println("=========================================================================================");
    System.out.println("enter your option\n1.push an element\n2.pop an element\n3.top most element\n4.element present in stack");
    operationoption=sc.nextInt();
    
    switch(operationoption){
        case 1:
        System.out.println("enter the value");
        value=sc.nextInt();
        s.push(value);
        break;
        case 2:
        System.out.println(s.pop() + " Popped from stack");
        break;
        case 3:
        System.out.println("Top element is :" + s.peek());
        break;
        case 4:
        System.out.print("Elements present in stack :");
		s.print();
        break;
        default:
        System.out.print("invalid");
        option=0;
    }





    System.out.println("=========================================================================================");
System.out.println("\nenter your option\n1.continue\n2.exit");
option=sc.nextInt();
}while(option==1);
	}

}
