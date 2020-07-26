package hm03.task02;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>(5);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertRight(12);
        deque.insertRight(22);
        deque.insertLeft(123);
        System.out.println(deque.peekRight());
        System.out.println(deque.peekLeft());
        deque.removeRight();
        deque.removeLeft();
        deque.removeRight();
        deque.removeLeft();

        System.out.println(deque);




    }
}
