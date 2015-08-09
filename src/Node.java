/**
 * Created by anurags on 8/1/15.
 */
public class Node<T> {
    private Node mLeft;
    private Node mRight;
    private T mData;

    public Node(T data) {
        mData = data;
        mLeft = null;
        mRight = null;
    }

    public T getData() {
        return mData;
    }

    public Node<T> getLeft() {
        return mLeft;
    }

    public Node<T> getRight() {
        return mRight;
    }

    public void setLeft(Node<T> left) {
        mLeft = left;
    }

    public void setRight(Node<T> right) {
        mRight = right;
    }
}
