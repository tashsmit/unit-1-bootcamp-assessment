/**
 * Created by amyquispe on 5/28/15.
 */
public abstract class MyNode<T> {
    private MyNode left;
    private MyNode right;
    private T data;

    public abstract MyNode getLeft();

    public abstract MyNode getRight();

    public abstract T getData();
}
