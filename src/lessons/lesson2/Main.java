package lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arr.add((int)(Math.random()*100000));
        }

//        bubbleSortTime(arr); // 41546816210 ms

//        selectionSortTime(arr); // 16006932259 ms

//        insertionSortTime(arr);  //7590247886 ms

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
