public class QueueAL<D> implements Queue<D>
{
    Integer buffer;
    Object arr[];
    QueueAL()
    {
        buffer = 5;
        arr = new Object [buffer];
    }
    public void enqueue(D o)
    {
        Integer s=size();
        if (s>=buffer)
        {
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for (int j=0;j<s;j++)
                arr2[j] = arr[j];
            arr = arr2;
        }
        arr[s] = o;
    }
    public D dequeue ()
    {
        try
        {
            if (size()==0)
            {
                BoundsException ob = new BoundsException();
                throw ob;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
            return null;
        }
        D t;
        t = (D)(arr[0]);
        for (int i=0;i<size()-1;i++)
        arr[i] = arr[i+1];
        arr[size()-1] = null;
        return t;
    }
    public Integer size()
    {
        Integer i=0;
        while(arr[i]!=null)
        {
            i++;
            if (i==buffer)
            break;
        }
        return (i);
    }
}
