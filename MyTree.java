/**
 * Created by amyquispe on 5/28/15.
 */
public abstract class MyTree<T> {
    private MyNode<T> root;
    public abstract void insert(MyNode<T> newNode);
    public boolean remove(Comparable someData){
        if(root.getData().equals(someData)){

        }
    };
}
