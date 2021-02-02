

public class BoxedString<T>
{
  T contents;
 
  public BoxedString(T initialContents)
  {
    this.contents = initialContents;
  } // BoxedString(String)

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get the contents of the box.
   */
  public T get()
  {
    return this.contents;
  } // get()

  /**
   * Update the contents of the box.
   */
  public void set(T newContents)
  { 
    this.contents = newContents;
  } // set(String)

  /**
   * Get the contents of the box as a string.
   */
  public T toString() // I'm not sure how to handle this toString with T
  {
    return this.contents;
  } // toString()
} // class BoxedString
