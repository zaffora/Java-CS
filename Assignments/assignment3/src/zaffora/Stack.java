package zaffora;

public interface Stack<T>
{
    public int size(); // Same as length

    public boolean isEmpty();

    public T top()
            throws EmptyStackException;

    public void push(T element);

    public T pop()
            throws EmptyStackException;
}
