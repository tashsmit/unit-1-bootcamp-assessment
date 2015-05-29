/**
 * Created by c4q-tashasmith on 5/28/15.
 */
public class MyObject
{
    String name;
    int age;

    public MyObject(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean areEqual (MyObject something) {
        return ((something.getAge() == this.age) && (something.getName().equals(this.name)));
    }
}
