public class Stack_LinearList <D> implements stack<D>
{
    ListObject <D> head,tail;
    Stack_LinearList()
    {
        head=null;
        tail=null;
    }
    public void push(D o)
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
    public D pop()
 	{
    	ListObject<D> ob1 = head;
    	ListObject<D> ob2 = head;
    	Integer a=0,s = Size();
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
        while(a!=(s-1))
        {
            ob2=ob1;
            ob1=ob1.next;
            a++;
        }
        tail = ob2;
        return ((D)(ob1.val));
    }
    public Integer Size()
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
    public D peek()
    {
    	return ((D)(tail.val));
    }
}
