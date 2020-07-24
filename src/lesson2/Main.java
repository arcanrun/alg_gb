package lesson2;

import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        for (int i = 0; i < 1_00; i++) {
            arr.add((int)(Math.random()*100));
        }



    }

    public static void bubbleSortTime(MyArrayList<Integer> arr){
        long start = System.nanoTime();
        arr.bubbleSort();
        long end = System.nanoTime();
        System.out.println(end-start + " ms");

    }

    public static void insertionSortTime(MyArrayList<Integer> arr){
        long start = System.nanoTime();
        arr.insertionSort();
        long end = System.nanoTime();
        System.out.println(end-start + " ms");
    }

    public static void  selectionSortTime(MyArrayList<Integer> arr){
        long start = System.nanoTime();
        arr.selectionSort();
        long end = System.nanoTime();
        System.out.println(end-start + " ms");
    }


}
