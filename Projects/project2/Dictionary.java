/*
	Starter code for Delaware Technical Community College
	Hash function and Dictionary Assignment
 */
public interface Dictionary<K extends Comparable<K>, V> {
    /*
    Inserts the new node in the correct place in the Binary Search Tree according to the key.
    Duplicates cannot be added.
     */
    public void insert(K key, V value);

    /*
    Returns the object that matches the key.
    */
    public V search(K key);
}

