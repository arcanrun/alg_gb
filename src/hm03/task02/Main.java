package hm03.task02;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>(5);
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertLeft(3);
        deque.insertLeft(4);
        deque.insertLeft(7);







        System.out.println(deque);




    }
}
