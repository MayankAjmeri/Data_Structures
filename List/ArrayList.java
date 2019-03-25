public class ArrayList<D> implements List<D>
{
    Integer buffer;
    Integer size;
    Object arr[];
    ArrayList()
    {
        buffer = 5;
        size = 0;
        arr = new Object [buffer];
    }
    public void add(D o,Integer pos)
    {
        try
        {
            if (pos>size)
            {
                BoundsException ob = new BoundsException();
                throw ob;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
        }
        if (size>=buffer)
        {
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for (int j=0;j<size;j++)
                arr2[j] = arr[j];
            arr = arr2;
        }
        for (int i=size;i>pos;i--)
            arr[i] = arr[i-1];
        arr[pos] = o;
        size++;
    }
    public void add(D i)
    {
        if (size>=buffer)
        {
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for (int j=0;j<size;j++)
                arr2[j] = arr[j];
            arr2[size]=i;
            size++;
            arr = arr2;
        }
        else
        {
            arr[size] = i;
            size++;
        }
    }
    public void traverse ()
    {
        for (int i=0;i<size;i++)
        System.out.println(arr[i]);
    }
    public void remove(D O)
    {
        for (int i=0;i<size;i++)
            if (arr[i] == O)
            {
                for (int j=i;j<size;j++)
                {
                    arr[j] = arr[j+1];
                }
                size--;
                i--;
            }
    }
    public Integer search(D O)
    {
        int k=-1;
        for (int i=0;i<size;i++)
        if ((Integer)(arr[i]) == (Integer)(O))
        {
            k=i;
            break;
        }
        return(k);
    }
    public D getElementAt(Integer pos)
    {
        return((D)(arr[pos]));
    }
}