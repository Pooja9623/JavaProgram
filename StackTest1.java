package prog;

import java.util.Scanner;

interface StackOperations{
	int Max=5;
	
	boolean isFull();
	boolean isEmpty();
	void push(int val);
	int pop();
	int peek();
	
}

class MyStack implements StackOperations{
	private int top,stk[];
	
	public MyStack() {
		top=-1;
		stk = new int[Max];
	}
	
	public boolean isFull() {
		return top == Max-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack Overflow...");
			return;
		}
		
		stk[++top] = val;
	}
	
	public int pop() {
		if(isEmpty())  {
			System.out.println("Stack Underflow...");
			return -9999;
		}
		return stk[top--];
	}
	
	public int peek() {
		if(isEmpty())  {
			System.out.println("Stack Underflow...");
			return -9999;
		}
		return stk[top];
	}
}

public class StackTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StackOperations s = new MyStack();
		
		int ch;
		
		do {
			
		System.out.println("1.Push\n2.Pop\n3.Peek\n4.Exit\nEnter your choice(1-4):");
		ch = in.nextInt();
		
		switch(ch) {
		case 1:
			System.out.print("Enter value to push:");
			int val = in.nextInt();
			s.push(val);
			break;
			
		case 2:
			System.out.println("The poped element is "+s.pop());
			break;
			
		case 3:
			System.out.println("The topmost element is "+s.peek());
			break;
			
		}
		
		
		}while(ch!=4);

		in.close();
	}

}
