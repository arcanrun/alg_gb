package homeworks.hw08;

import lessons.lesson8.ChainingHashMap;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();
        chm.put(1,"one");
        chm.put(2,"two");
        chm.put(3,"three");
        chm.put(4,"four");
        chm.put(5,"five");
        chm.put(18787,"hello");
        chm.put(31,"world");
        chm.put(24,"some");
        chm.put(123,"gogog");
        chm.put(11234,"blblbl");
        System.out.println(chm);
        System.out.println(chm.delete(18787));
        System.out.println(chm.delete(11234));
        System.out.println(chm.delete(123));
        System.out.println(chm);
    }
}
