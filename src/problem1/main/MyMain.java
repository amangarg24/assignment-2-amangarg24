package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree a = new MyBinarySearchTree();
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        a.insert(scanner.nextInt());
        System.out.println("PreOrder traversal ::");
        a.print();
    }
}