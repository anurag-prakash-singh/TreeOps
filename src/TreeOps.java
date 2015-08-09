import java.util.List;
import java.util.Stack;

/**
 * Created by anurags on 8/3/15.
 */
public class TreeOps {
    public static <T> void inorderIterative(Node<T> node) {
        Node<T> currentNode = node;
        Stack<Node<T>> stack = new Stack<Node<T>>();

        while (currentNode != null || !stack.empty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }

            currentNode = stack.pop();
            System.out.print(currentNode.getData() + " ");

            currentNode = currentNode.getRight();
        }

        System.out.println();
    }

    public static <T> void linearize(Node<T> root, List<Node<T>> prev) {
        if (root == null) {
            if (prev.get(0) != null) {
                prev.get(0).setRight(root);
            }

            return;
        }

        linearize(root.getLeft(), prev);

        if (prev.get(0) != null) {
            prev.get(0).setRight(root);
        }

        root.setLeft(prev.get(0));

        prev.clear();
        prev.add(root);

        linearize(root.getRight(), prev);
    }

    /*
     * Print tree starting at head using 'left' as
     * previous and 'right' as next.
     */
    public static <T> void printLinearizedTree(Node<T> head) {
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getRight();
        }

        System.out.println();
    }
}
