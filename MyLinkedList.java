public class MyLinkedList<E> implements MyList<E> {

  protected Node<E> head, tail;

  protected int size = 0; // Number of elements in the list


  public MyLinkedList() {

  }

  /** Create a list from an array of objects */

  public MyLinkedList(E[] objects) {

    for (int i = 0; i < objects.length; i++)

      add(objects[i]);

  }

  /** Return the head element in the list */

  public E getFirst() {

    if (size == 0) {

      return null;

    }

    else {

      return head.element;

    }

  }

  /** Return the last element in the list */

  public E getLast() {

        //Add code here

  }

  /** Add an element to the beginning of the list */

  public void addFirst(E e) {

        //Add code here

  }

  /** Add an element to the end of the list */

  public void addLast(E e) {

    Node<E> newNode = new Node<>(e); // Create a new for element e

    if (tail == null) {

      head = tail = newNode; // The new node is the only node in list

    }

    else {

      tail.next = newNode; // Link the new with the last node

      tail = newNode; // tail now points to the last node

    }

    size++; // Increase size

  }

  @Override /** Add a new element at the specified index

   * in this list. The index of the head element is 0 */

  public void add(int index, E e) {

    if (index == 0) {

      addFirst(e);

    }

    else if (index >= size) {

      addLast(e);

    }

    else {

      Node<E> current = head;

      for (int i = 1; i < index; i++) {

        current = current.next;

      }

      Node<E> temp = current.next;

      current.next = new Node<>(e);

      (current.next).next = temp;

      size++;

    }

  }

  /** Remove the head node and

   *  return the object that is contained in the removed node. */

  public E removeFirst() {

    if (size == 0) {

      return null;

    }

    else {

      E temp = head.element;

      head = head.next;

      size--;

      if (head == null) {

        tail = null;

      }

      return temp;

    }

  }

  /** Remove the last node and

   * return the object that is contained in the removed node. */

  public E removeLast() {

    if (size == 0) {

      return null;

    }

    else if (size == 1) {

      E temp = head.element;

      head = tail = null;

      size = 0;

      return temp;

    }

    else {

      Node<E> current = head;

      for (int i = 0; i < size - 2; i++) {

        current = current.next;

      }

      E temp = tail.element;

      tail = current;

      tail.next = null;

      size--;

      return temp;

    }

  }

  @Override /** Remove the element at the specified position in this

   *  list. Return the element that was removed from the list. */

  public E remove(int index) {   

    if (index < 0 || index >= size) {

      return null;

    }

    else if (index == 0) {

      return removeFirst();

    }

    else if (index == size - 1) {

      return removeLast();

    }

    else {

      Node<E> previous = head;

      for (int i = 1; i < index; i++) {

        previous = previous.next;

      }

      Node<E> current = previous.next;

      previous.next = current.next;

      size--;

      return current.element;

    }

  }

  @Override /** Override toString() to return elements in the list */

  public String toString() {

    StringBuilder result = new StringBuilder("[");

    Node<E> current = head;

    for (int i = 0; i < size; i++) {

      result.append(current.element);

      current = current.next;

      if (current != null) {

        result.append(", "); // Separate two elements with a comma

      }

      else {

        result.append("]"); // Insert the closing ] in the string

      }

    }

    return result.toString();

  }

  @Override /** Clear the list */

  public void clear() {

    size = 0;

    head = tail = null;

  }

  @Override /** Return true if this list contains the element e */

  public boolean contains(Object e) {

    // Left as an exercise

    return true;

  }

  @Override /** Return the element at the specified index */

  public E get(int index) {

    // Left as an exercise

    return null;

  }

  @Override /** Return the index of the first matching element in

   *  this list. Return -1 if no match. */

  public int indexOf(Object e) {

    // Left as an exercise

    return 0;

  }

  @Override /** Return the index of the last matching element in

   *  this list. Return -1 if no match. */

  public int lastIndexOf(E e) {

    // Left as an exercise

    return 0;

  }

  @Override /** Replace the element at the specified position

   *  in this list with the specified element. */

  public E set(int index, E e) {

    // Left as an exercise

    return null;

  }

  @Override /** Override iterator() defined in Iterable */

  public java.util.Iterator<E> iterator() {

    return new LinkedListIterator();

  }

  private class LinkedListIterator

      implements java.util.Iterator<E> {

    private Node<E> current = head; // Current index

    @Override

    public boolean hasNext() {

      return (current != null);

    }

    @Override

    public E next() {

      E e = current.element;

      current = current.next;

      return e;

    }

    @Override

    public void remove() {

      // Left as an exercise

    }

  }

// This class is only used in LinkedList, so it is private.

// This class does not need to access any

// instance members of LinkedList, so it is defined static.

  protected static class Node<E> {

    E element;

    Node<E> next;

    public Node(E element) {

      this.element = element;

    }

  }

  @Override /** Return the number of elements in this list */

  public int size() {

    return size;

  }

}

public

class

TestMyLinkedList {

  /** Main method */

public

static

void

main(String[] args) {

    // Create a list for strings

    MyLinkedList<String> list =

new

MyLinkedList<>();

    // Add elements to the list

    list.add("America"); // Add America to the list

    System.out.println("(1) " + list);

    list.add(0, "Canada"); // Add Canada to the beginning of the list

    System.out.println("(2) " + list);

    list.add("Russia"); // Add Russia to the end of the list

    System.out.println("(3) " + list);

    list.addLast("France"); // Add France to the end of the list

    System.out.println("(4) " + list);

    list.add(2, "Germany"); // Add Germany to the list at index 2

    System.out.println("(5) " + list);

    list.add(5, "Norway"); // Add Norway to the list at index 5

    System.out.println("(6) " + list);

    list.add(0, "Poland"); // Same as list.addFirst("Poland")

    System.out.println("(7) " + list);

    // Remove elements from the list

    list.remove(0); // Same as list.remove("Australia") in this case

    System.out.println("(8) " + list);

    list.remove(2); 

    System.out.println("(9) " + list);

    list.remove(list.size() - 1); 

    System.out.print("(10) " + list + "\n(11) ");

for

(String s: list)

      System.out.print(s.toUpperCase() + " ");

    list.clear();

    System.out.println("\nAfter clearing the list, the list size is "

      + list.size());

  }

}

