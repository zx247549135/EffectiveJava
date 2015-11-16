package book.section2.elimateObsoleteReference;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zx on 15-11-14.
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object val) {
        ensureCapacity();
        elements[size++] = val;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public Object pop() {
        if(size == 0){
            throw new EmptyStackException();
        }
        // direct returning will result in leak of memory sometimes.
        // return elements[--size];
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

}
