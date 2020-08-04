package homeworks.hw05.task02;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        Bag bag = new Bag(4);

        items.add(new Item(3000,4, "BoomBox"));
        items.add(new Item(2000,3 , "LapTop"));
        items.add(new Item( 1500,1, "Guitar"));
        items.add(new Item(2000, 1, "Iphone"));


        bag.findBesSet(items);
        System.out.println(bag.getBestSet());
    }
}
