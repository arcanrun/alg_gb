package homeworks.hm04.task01;

import lessons.lesson4.MyLinkedList;

import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.insertFirst("1");
        myLinkedList.insertFirst("2");
        myLinkedList.insertFirst("3");
        myLinkedList.insertFirst("4");
        myLinkedList.insertFirst("5");

        System.out.println(myLinkedList);
        ListIterator<String> listIterator = myLinkedList.getListIterator();
        System.out.println("move forward");
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println("move backward");
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.hasPrevious());
    }
}
