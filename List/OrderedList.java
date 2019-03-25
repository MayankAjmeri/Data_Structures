public class OrderedList<D> implements List<D>
{
    Integer buffer;
    Integer size;
    Object arr[];
    OrderedList()
    {
        buffer = 5;
        size = 0;
        arr = new Object [buffer];
    }
    public void add(D i)
    {
        Integer pos=0;
        for (int k=0;k<=size;k++)
        {
            if (arr[k] == null )
            {
                pos = k;
                break;
            }
            else if ((Integer)(i) <= (Integer)(arr[k]))
            {
                pos = k;
                break;
            }
        }
        if (arr[pos]!=null)
        for (int k=size;k>pos;k--)
        {
            arr[k] = arr[k-1];
        }
        arr[pos] = i;
        size++;
        if (size>=buffer)
        {
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for (int j=0;j<size;j++)
                arr2[j] = arr[j];
            arr = arr2;
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
        Integer k=-1, low=0, high=size-1, mid=(low+high)/2;
        for (;low<high;)
        {
            if ((Integer)(O) == (Integer)(arr[mid]))
            {
                k=mid;
                break;
            }
            else if ((Integer)(O) > (Integer)(arr[mid]))
                low = mid+1;
            else if ((Integer)(O) < (Integer)(arr[mid]))
                high = mid-1;
        }
        return(k);
    }
    public D getElementAt(Integer pos)
    {
        try
        {
            if (pos<1 || pos>size)
            {
                BoundsException b = new BoundsException();
                throw b;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
        }
        return((D)(arr[pos]));
    }
}