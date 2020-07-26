package lesson3;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());



//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression e = new Expression("(4-6)+[{67+45} * {a / b}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//
//        System.out.println(queue);
//
//        for (int i = 0; i < 3 ; i++) {
//            System.out.println(queue.removeRight());
//        }


//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(1);
//        mpq.insert(7);
//        mpq.insert(4);
//        mpq.insert(2);
//
//        System.out.println(mpq);
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(mpq.remove());
//        }

    }
}
