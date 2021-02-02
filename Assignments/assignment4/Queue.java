// @author Delaware Technical Community College
// modified by Domenico Zaffora

public interface Queue<T> { 
	
	public void enqueue(T item); //Inserts the specified element into this queue.
	
	public T dequeue(); //Retrieves and removes the head of this queue, or returns null if this queue is empty.
		
	public T getFront(); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

	public T getBack();//Retrieves, but does not remove, the tail of this queue, or returns null if this queue is empty.

	public boolean isEmpty(); //  @return true if, and only if, the queue is empty.

	public int size(); // returns the size of the Queue.
	
	@Override
	public String toString(); //@return appropriate string representing the queue
}
