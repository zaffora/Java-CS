package zaffora;

public class StackArray<T> {
    private static final int DEFAULT_SIZE=52;
    private int capacity;
    private int top=-1;
    private T [] stack;

    public StackArray(int cap){
        capacity=cap;
        stack = (T[]) new Object[DEFAULT_SIZE];
    }
    public StackArray(){
        this(DEFAULT_SIZE);
    }

    public int size(){
        return top+1;
    }
    public Object top(){
        if(isEmpty())
            return "Stack is empty.";
        return obj[top];
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
        obj[++top]=o;
    }

    public Object pop(){
        if(isEmpty()) return "Stack is empty.";

        Object temp;
        temp=obj[top];
        obj[top--]=null;
        return temp;
    }
}