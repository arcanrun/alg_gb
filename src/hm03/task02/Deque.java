package hm03.task02;

import java.util.EmptyStackException;

public class Deque<T> {
    private T[] list;
    private int size = 0;
    private final int MAX_SIZE_DEFAULT = 10;
    private int begin = 0;
    private int end = -1;

    //0 1 2 3 4
    //4     8 6
    //      b
    //  e

    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Deque() {
        list = (T[]) new Object[MAX_SIZE_DEFAULT];
    }


    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        end++;
        list[end] = item;
        if (end > list.length - 1) {
            end = 0;
        }

    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        begin--;
        if (begin < 0) {
            begin = list.length - 1;
        }

        list[begin] = item;

    }

    public T removeLeft() {
        T value = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }



    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }
    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end];
    }


    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (true) {
                sb.append(list[i]).append(", ");
                i++;
                if (i > list.length - 1) {
                    i = 0;
                }
                if (end +1 == i) {
                    break;
                }
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
