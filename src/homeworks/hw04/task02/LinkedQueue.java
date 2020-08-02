package homeworks.hw04.task02;

import lessons.lesson4.MyLinkedList;

public class LinkedQueue<T> {
    private MyLinkedList<T> queue;

    public LinkedQueue() {
        queue = new MyLinkedList<>();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public T peek(){
        return queue.getLast();
    }

    public void insert(T item){
        queue.insertLast(item);
    }

    public void delete(){
        queue.deleteFirst();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
