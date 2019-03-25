import java.util.*;
public class Driver
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for ArrayList ");
        System.out.println("Enter 2 for OrderedList ");
        System.out.println("Enter 3 for LinearList ");
        System.out.println("Enter your choice ");
        Integer choice = in.nextInt();
        switch(choice)
        {
            case 1:
            ArrayList ob1 = new ArrayList<Integer>();
            ob1.add(1);
            ob1.add(2);
            ob1.add(3);
            ob1.add(4);
            ob1.add(7,3);
            ob1.add(5);
            ob1.traverse();
            System.out.println("Removing 7.../nDisplaying ArrayList :");
            ob1.remove(7);
            ob1.traverse();
            System.out.println("Element at index 3 is : " + ob1.getElementAt(3));
            System.out.println("Index of element 5 is : " + ob1.search(5));
            break;
            
            case 2:
            OrderedList ob2 = new OrderedList<Integer>();
            ob2.add(1);
            ob2.add(2);
            ob2.add(7);
            ob2.add(4);
            ob2.add(3);
            ob2.traverse();
            System.out.println("Removing 1.../nDisplaying ArrayList :");
            ob2.remove(1);
            ob2.traverse();
            System.out.println("Element at index 3 is : " + ob2.getElementAt(3));
            System.out.println("Index of element 3 is : " + ob2.search(3));
            ob2.traverse();
            break;
            
            case 3:
            LinearList <Integer> ob3 = new LinearList<Integer>();
            ob3.add(1);
            ob3.add(2);
            ob3.add(3);
            ob3.add(4);
            ob3.add(5);
            //ob3.add(6,3);
            System.out.println("Size of Linked List is : " + ob3.getSize());
            System.out.println("Index of 2 is : " + ob3.indexOf(2));
            System.out.println("Element at index 3 is : " + ob3.getElementAt(3));
            System.out.println("Element 3 is at index : " + ob3.search(3));
            ob3.traverse();
            System.out.println("Removing 1.../nDisplaying ArrayList :");
            ob3.remove(1);
            System.out.println("Removing element at 1.../nDisplaying ArrayList :");
            ob3.removepos(1);
            ob3.traverse();
            break;
            
            default:
            System.out.println("Wrong Choice!!");
        }
    }
}