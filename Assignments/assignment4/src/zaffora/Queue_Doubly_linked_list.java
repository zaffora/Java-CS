package zaffora;// code from https://www.java2novice.com/data-structures-in-java/queue/dque-linked-list/
// Queue implamenting a doubly linked list

class DequeDblLinkedListImpl<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size = 0;
	private String name;

	public String getName(){return name;}

	public void setName(String name){
		this.name = name;
	}

	public int size(){return size;}
	
	public void insertFront(T item){
		//add element at the beginning of the queue
		System.out.println("adding at front: "+item);
		Node<T> nd = new Node<T>();
		nd.setValue(item);
		nd.setNext(front);
		if(front != null) front.setPrev(nd);
		if(front == null) rear = nd;
		front = nd;
		size++;
	}
	
	public void insertRear(T item){
		//add element at the end of the queue
		System.out.println("Airplane: "+item+" has landed");
		Node<T> nd = new Node<T>();
		nd.setValue(item);
		nd.setPrev(rear);
		if(rear != null) rear.setNext(nd);
		if(rear == null) front = nd;		
		rear = nd;
		size++;
	}
	
	public void removeFront(){
		if(front == null){
			System.out.println("There are no plains waiting to takeoff.");
			return;						
		}
		//remove an item from the beginning of the queue
		Node<T> tmpFront = front.getNext();
		if(tmpFront != null) tmpFront.setPrev(null);
		if(tmpFront == null) rear = null;
		System.out.println("Airplane: "+front.getValue()+" has taken off.");
		front = tmpFront;
		size--;
	}
	
	public void removeRear(){
		if(rear == null){
			System.out.println("There are no planes in queue.");
			return;
		}
		//remove an item from the beginning of the queue
		Node<T> tmpRear = rear.getPrev();
		if(tmpRear != null) tmpRear.setNext(null);
		if(tmpRear == null) front = null;
		 System.out.println(rear.getValue() + " removed from rear of the queue");
		rear = tmpRear;
		size--;
	}
	

}

class Node<T>{
	
	private Node<T> prev;
	private Node<T> next;
	private T value;
	
	public Node() {
    }

    public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}