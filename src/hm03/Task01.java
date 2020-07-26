package hm03;

import lesson3.MyStack;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();

        while (!read.equals("/end")) {

            MyStack<String> stack = new MyStack<>(read.length());

            for (String str : read.split("")) {
                stack.push(str);
            }

            int size = stack.size();

            for (int i = 0; i < size; i++) {
                System.out.print(stack.pop());
            }

            System.out.println();
            read = scanner.nextLine();
        }
        scanner.close();
    }

}
