public class Stack_ArrayList <D> implements stack <D>
{
    Integer buffer;
    Object arr[];
    Stack_ArrayList()
    {
        buffer = 5;
        arr = new Object [buffer];
    }
    public void push(D o)
    {
        Integer s=Size();
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
    public Integer Size()
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
    public D pop()
    {
        try
        {
            if (Size()==0)
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
        t = (D)(arr[Size()-1]);
        arr[Size()-1] = null;
        return t;
    }
    public D peek()
    {
        try
        {
            if (Size()==0)
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
        t = (D)(arr[Size()-1]);
        return t;
    }
}
