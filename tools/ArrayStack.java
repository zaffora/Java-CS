
package zaffora;

import java.util.Arrays;

public class ArrayStack<T> {
	private static final int DEFAULT_SIZE=52;
	private int capacity;
	private int top=-1;
	private T [] stack;

	public ArrayStack(int cap){
		capacity=cap;
		stack = (T[]) new Object[DEFAULT_SIZE];
	}
	public ArrayStack(){
		this(DEFAULT_SIZE);
	}

	public int size(){
		return top+1;
	}
	public Object peek(){
		if(isEmpty())
			return "Stack is empty.";
		return stack[top];
	}

	public boolean isEmpty(){
		return top<0;
	}

	public boolean isFull(){
		return size()>=capacity;
	}

	public void push(Object o){
		if(size()>=capacity){
			System.out.println("Stack is full.");
			return;
		}
		stack[++top]= (T) o;
	}

	public Object pop(){
		if(isEmpty()) return "Stack is empty.";

		Object temp;
		temp=stack[top];
		stack[top--]=null;
		return temp;
	}
	
	public int length() {
		return top+1;
	}

	@Override
	public String toString() {
		return "ArrayStack{" +
				"stack=" + Arrays.toString(stack) +
				'}';
	}
}
