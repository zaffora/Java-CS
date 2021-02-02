interface BST <K extends Comparable<K>, V> {
    /*
    Inserts the new node in the correct place in the Binary Search Tree according to the key.
    Duplicates cannot be added.
     */
    public void insert(K key, V value);

    /*
    Returns the object that matches the key.
     */
    public V search(K key);

    /*
    Returns the number of comparisons needed to find the key in the BST.
     */
    public int searchComparisons(K key);
}