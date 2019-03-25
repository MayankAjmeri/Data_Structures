public class LinearList <D> implements List<D>
{
    ListObject <D> head,tail;
    LinearList()
    {
        head=null;
        tail=null;
    }
    public void add(D o)
    {
        ListObject<D> ob = new ListObject(o);
        if (head==null)
        {
            head = ob;
            head.next = ob;
            tail = ob;
        }
        else 
        {
            tail.next = ob;
            tail = ob;
        }
    }
    public void add(D o,Integer pos)
    {
        Integer size = getSize();
        try
        {
            if (pos<0 || pos>size)
            {
                BoundsException b = new BoundsException();
                throw b;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
            return;
        }
        
    }
    public void traverse()
    {
        ListObject<D> ob = head;
        while(ob!=null)
        {
            System.out.println(ob.val);
            ob = ob.next;
        }
    }
    public Integer indexOf(D o)
    {
        Integer c = 0;
        ListObject<D> ob = head;
        while(ob!=null)
        {
            if (o==ob.val)
            {
                return (c); 
            }
            ob = ob.next;
            c++;
        }
        return(-1);
    }
    public Integer getSize()
    {
        Integer c=0;
        ListObject<D> ob = head;
        while(ob!=null)
        {
            ob = ob.next;
            c++;
        }
        return (c);
    }
    public void removepos(Integer pos)
    {
        try
        {
            if (pos<0 || pos>getSize())
            {
                BoundsException b = new BoundsException();
                throw b;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
            return;
        }
        ListObject<D> ob = head;
        for(int i=0;i<getSize();i++)
        {
            if(i==pos)
            {
                ob = ob.next.next;
                i++;
            }
            else
                ob = ob.next;
        }
    }
    public void remove(D o)
    {
        ListObject<D> ob = head,ob1=head;
        while(ob!=null)
        {
            if (o!=ob.val)
            {
                ob1 = ob.next;
            }
            ob = ob.next;
        }
        ob = ob1;
    }
    public void reverse()
    {
    
    }
    public D getElementAt(Integer pos)
    {
        try
        {
            if (pos<0 || pos>getSize())
            {
                BoundsException b = new BoundsException();
                throw b;
            }
        }
        catch(BoundsException x)
        {
            x.printerror();
        }
        ListObject<D> ob = head;
        for(int i=0;i<getSize();i++)
        {
            if(i==pos)
            {
                break;
            }
            ob = ob.next;
        }
        return (ob.val);
    }
    public Integer search(D o)
    {
        ListObject<D> ob = head;
        for(int i=0;i<getSize();i++)
        {
            if(ob.val==o)
            {
                return i;
            }
            ob = ob.next;
        }
        return -1;
    }
}
