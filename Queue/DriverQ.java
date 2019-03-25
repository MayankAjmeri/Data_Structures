import java.util.*;
public class DriverQ
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Queue_ArrayList ");
        System.out.println("Enter 2 for Queue_LinearList ");
        System.out.println("Enter your choice ");
        Integer choice = in.nextInt();
        switch(choice)
        {
            case 1:
            QueueAL ob = new QueueAL<Integer>();
            ob.enqueue(1);
            ob.enqueue(2);
            ob.enqueue(3);
            ob.enqueue(4);
            ob.enqueue(5);
            System.out.println("Size of Queue is : " + ob.size());
            System.out.println("Removing First element ... "+ob.dequeue());
            break;

            case 2:
            QueueAL ob1 = new QueueAL<Integer>();
            ob1.enqueue(1);
            ob1.enqueue(2);
            ob1.enqueue(3);
            ob1.enqueue(4);
            ob1.enqueue(5);
            System.out.println("Size of Queue is : " + ob1.size());
            System.out.println("Removing First element ... "+ob1.dequeue());
            break;
            default:
            System.out.println("Wrong Choice!!");
        }
    }
}
