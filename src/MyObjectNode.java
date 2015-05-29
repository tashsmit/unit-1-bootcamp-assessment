import java.util.ArrayList;

/**
 * Created by c4q-tashasmith on 5/28/15.
 */
public class MyObjectNode extends MyNode
{
    protected MyNode    left;
    protected MyNode    right;
    protected ArrayList data;

    public void setLeft(MyNode left)
    {
        this.left = left;
    }

    public void setRight(MyNode right)
    {
        this.right = right;
    }

    public void setData(ArrayList data)
    {
        this.data = data;
    }

    @Override
    public MyNode getLeft()
    {
        return this.left;
    }

    @Override
    public MyNode getRight()
    {
       return this.right;
    }

    @Override
    public Object getData()
    {
        return this.data;
    }

    @Override
    public void insert(MyNode newNode)
    {

    }
}
