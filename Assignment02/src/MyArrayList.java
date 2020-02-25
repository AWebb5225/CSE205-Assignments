/*CSE 205: Class 11333 - Tues/Thurs 4:30-5:45
  Assignment: 2
  Description: This file allows the user to modify the array list
 */
import java.util.NoSuchElementException;

public class MyArrayList implements MyList {
    private int capacity = 16;
    private Object[] array = new Object[capacity];
    private int size = 0;

    @Override
    public void add(Object o) {
        //add a new value to the end of a given array
        if (size() == array.length)
            ensureCapacity(capacity * 2);

    }

    @Override
    public void insert(int index, Object o) {
        Object[] tempArray = new Object[array.length + 1];

        // if the index is not valid then throw an exception
        if(index > capacity)
            throw new NoSuchElementException();

        for (int i = 0; i < array.length + 1; i++) {
            if (i < index - 1)
                tempArray[i] = array[i];
            else if (i == index - 1)
                tempArray[i] = o;
            else
                tempArray[i] = array[i - 1];
        }
    }

    @Override
    public void remove(int index) {
        Object[] tempArray = new Object[array.length];

        for(int i = 0; i < tempArray.length - 1; i++)
            if (i != index)
                tempArray[i] = array[i];

            array = tempArray;
    }


    @Override
    public Object get(int index) {
        if (index < 0 || index > size)
            throw new NoSuchElementException();

        //returns the value at the requested index
        Object o;
        o = array[index];
        return o;
    }

    @Override
    public int size() {
        return size;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity < 16)
            capacity = 16;

        Object[] tempArray = new Object[capacity]; //new array to copy contents from old array with updated capacity
        tempArray = array.clone();

    }

    public void trimToSize() {
        ensureCapacity(size);
    }

    // Do not alter the code below
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = - 1;

        @Override
        public Object next( ) {
            currentIndex++;
            return array[currentIndex];
        }

        @Override
        public boolean hasNext( ) {
            return currentIndex +1 < size;
        }
    }
}
