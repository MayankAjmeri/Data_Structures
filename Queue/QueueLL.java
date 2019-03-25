public class QueueLL<D> implements Queue<D>
{
    ListObject <D> head,tail;
    public QueueLL()
    {
        head=null;
        tail=null;
    }
    public void enqueue(D o)
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
    public D dequeue()
    {
        ListObject<D> ob1 = head,temp = head;
    	Integer s=size();
    	try
        {
            if (s==0)
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
        ob1=ob1.next;
        head = ob1;
        return ((D)(temp.val));
    }
    public Integer size()
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
}
