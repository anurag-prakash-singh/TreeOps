import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anurags on 8/1/15.
 */
public class Main {
    private static void test1() {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);

        node2.setLeft(node1);
        node2.setRight(node3);

        TreeOps.inorderIterative(node2);
    }

    private static void test2() {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<Integer>(6);

        node3.setLeft(node2);
        node2.setLeft(node1);
        node3.setRight(node5);
        node5.setLeft(node4);
        node5.setRight(node6);

        TreeOps.inorderIterative(node3);
    }

    private static void test3() {
        // Test linearization
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
        Node<Integer> node6 = new Node<Integer>(6);

        node3.setLeft(node2);
        node2.setLeft(node1);
        node3.setRight(node5);
        node5.setLeft(node4);
        node5.setRight(node6);

        List<Node<Integer>> prev = new ArrayList<Node<Integer>>();

        prev.add(null);
        TreeOps.linearize(node3, prev);

        // prev will have the last node visited so go back to the head
        // of the list.
        Node<Integer> head = prev.get(0);

        while (head.getLeft() != null) {
            head = head.getLeft();
        }

        TreeOps.printLinearizedTree(head);
    }

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }
}
