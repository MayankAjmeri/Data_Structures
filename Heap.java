import java.util.*;
public class Heap
{
    Integer A[],size,buffer;
    Heap()
    {
        size = 0;
        buffer = 10;
        A = new Integer [buffer];
    }
    public void heapify(Integer pos,Integer Size)
    {
        Integer rc = (2*pos)+2,l=pos;
        Integer lc = (2*pos)+1;
        if (lc<=(Size-1) && A[lc]>A[l])
        l = lc;
        if (rc<=(Size-1) && A[rc]>A[l])
        l = rc;
        if (l!=pos)
        {
            A[l] = A[l] + A[pos];
            A[pos] = A[l] - A[pos];
            A[l] = A[l] - A[pos];
            heapify(l,Size);
        }
    }
    public void BuildMaxHeap()
    {
        for (Integer i=(size/2)-1;i>=0;i--)
        {
            heapify(i,size);
        }
    }
    public void HeapSort()
    {
        BuildMaxHeap();
        Integer Size = size;
        for(Integer i=size-1;i>=1;i--)
        {
            A[i] = A[i] + A[0];
            A[0] = A[i] - A[0];
            A[i] = A[i] - A[0];
            Size--;
            heapify(0,Size);
        }
    }
    public void Display()
    {
        for (int i=0;i<size;i++)
        {
            System.out.print(A[i] + "\t");
            if (i == 0 || (i%2==0 && i%4!=0))
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Heap ob = new Heap();
        System.out.println("How many elements do you want to enter??");
        Integer n = in.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter an Element");
            ob.A[i] = in.nextInt();
            ob.size++;
        }
        System.out.println("Current Heap");
        ob.Display();
        System.out.println("Heap After Heapify at index 0");
        ob.heapify(0,ob.size);
        ob.Display();
        System.out.println("Heap After Build Max Heap");
        ob.BuildMaxHeap();
        ob.Display();
        System.out.println("Heap After Heapsort");
        ob.HeapSort();
        ob.Display();
        in.close();
    }
}