

// code from http://cs-fundamentals.com/data-structures/implement-queue-using-linked-list-in-java.php
// modified by Domenico Zaffora
// Linked Queue

package zaffora;

class LinkedQueue <T> implements Queue <T>
{
  private Node front, rear; //begin and end nodes
  private int size; // number of items
 
  //nested class to define node
  private class Node
  { 
    T item;
    Node next;
  }
 
  //Zero argument constructor
  public LinkedQueue()
  {
    front = null;
	rear = null;
    size = 0;
  }

  // returns the front element
  public T getFront(){
    return front.item;
  }

  // returns the rear element
  public T getBack(){
    return rear.item;
  }
 //returns True if empty
  public boolean isEmpty()
  {
    return (size == 0);
  }
 
  //Remove element from the front of the list.
  public T dequeue()
  {
    T item = front.item;
    front = front.next;
    if (isEmpty()) 
    {
      rear = null;
    }
    size--;
    return item;
  }
 
  //Add element to the end of the list.
  public void enqueue(T item)
  {
    Node oldRear = rear;
    rear = new Node();
    rear.item = item;
    rear.next = null;
    if (isEmpty()) 
    {
      front = rear;
    }
    else 
    {
      oldRear.next = rear;
    }
    size++;
  }
 
  public int size()
  {
    return size;
  }

 
}