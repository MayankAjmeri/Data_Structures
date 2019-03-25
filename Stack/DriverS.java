import java.util.*;
public class DriverS
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Stack_ArrayList ");
        System.out.println("Enter 2 for Stack_LinearList ");
        System.out.println("Enter your choice ");
        Integer choice = in.nextInt();
        switch(choice)
        {
            case 1:
            Stack_ArrayList ob = new Stack_ArrayList<Integer>();
            ob.push(1);
            ob.push(2);
            ob.push(3);
            ob.push(4);
            ob.push(5);
            System.out.println("Size of Stack is : " + ob.Size());
            System.out.println("Removing topmost element ... "+ob.pop());
            System.out.println("Displaying topmost element ... " +ob.peek());
            break;
            
            case 2:
            Stack_LinearList ob1 = new Stack_LinearList<Integer>();
            ob1.push(1);
            ob1.push(2);
            ob1.push(3);
            ob1.push(4);
            ob1.push(5);
            System.out.println("Size of Stack is : " + ob1.Size());
            System.out.println("Removing topmost element ... "+ob1.pop());
            System.out.println("Displaying topmost element ... " +ob1.peek());
            break;
            default:
            System.out.println("Wrong Choice!!");
        }
    }
}
