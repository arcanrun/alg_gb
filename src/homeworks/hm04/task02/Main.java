package homeworks.hm04.task02;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        linkedQueue.insert("1");
        linkedQueue.insert("2");
        linkedQueue.insert("3");
        linkedQueue.insert("4");
        System.out.println(linkedQueue);
        System.out.println(linkedQueue.peek());
        linkedQueue.delete();
        linkedQueue.delete();
        System.out.println(linkedQueue);
        linkedQueue.insert("5");
        linkedQueue.insert("6");
        System.out.println(linkedQueue);
        System.out.println(linkedQueue.peek());
    }
}
