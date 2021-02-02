package zaffora;

import java.util.Arrays;

public class NodeStack<T> implements Stack<T>
{
    protected Node<T> top;
    protected int size;      

    public NodeStack()
    {
        top = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(top == null)
            return true;
        return false;
    }

    @Override
    public T top() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException("Stack is empty.");
        return top.getElement();
    }

    @Override
    public void push(T element) {
        Node<T> v = new Node<T>(element, top);
        top = v;
        size++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException("Stack is empty.");
        T temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }

    @Override
    public String toString() {
        return "NodeStack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }
}
