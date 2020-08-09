package homeworks.hw06;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import lessons.lesson6.MyTreeMap;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        List<MyTreeMap<Integer,Integer>> trees = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            trees.add(createTree(6));
//        }
//
//    }
//
//    public static MyTreeMap<Integer, Integer> createTree(int level){
//        Random r = new Random();
//        double a = Math.pow(2, level) - 1;
//        MyTreeMap<Integer, Integer> res = new MyTreeMap<>();
//        while (res.size() < a){
//            Integer val = (int) (Math.random() * 200 - 101);
//            res.put(val, val);
//        }
//        return res;
//    }


        MyTreeMap<Integer, Integer> tree = new MyTreeMap<>();
        tree.put(100, 100);
        tree.put(99, 99);
        tree.put(200, 200);
        tree.put(201, 201);
        tree.put(202,202);
        tree.put(47,47);
        tree.put(55,55);
        tree.put(65,65);
        System.out.println(tree.height(100));
        System.out.println(tree.isBalanced());


    }
}
