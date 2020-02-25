/*CSE 205: Class 11333 - Tues/Thurs 4:30-5:45
  Assignment: 2
  Description: This file allows the user to modify the linked list
 */
import java.util.NoSuchElementException;

public class MyLinkedList implements MyList {
    private Node head = null;
    private int size = 0;

    @Override
    public void add(Object o) {

    }

    @Override
    public void insert(int index, Object o) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    // Do not alter the code below

    public MyListIterator getIterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyListIterator {
        Node currentNode = null;

        @Override
        public Object next() {
            if (currentNode != null)
                currentNode = currentNode.next;
            else
                currentNode = head;

            return currentNode.data;
        }

        @Override
        public boolean hasNext() {
            if (currentNode != null)
                return currentNode.next != null;
            else
                return head != null;
        }
    }

    class Node {
        public Object data = null;
        public Node next = null;
    }
}
