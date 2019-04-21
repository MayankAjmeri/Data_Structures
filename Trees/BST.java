package Trees;
import java.util.*;
public class BST
{
    BSTStruct root;
    public void insert(int element)
    {
        root = insertrec(root, element);
    }
    public BSTStruct insertrec(BSTStruct Root,int element)
    {
        if(Root==null)
            Root = new BSTStruct(element);
        if(element<Root.val)
            Root.left = insertrec(Root.left, element);
        else if(element>Root.val)
            Root.right = insertrec(Root.right, element);
            return Root;
    }

    void search(BSTStruct r,int num)
    { 
        boolean found = false;
        while (r!=null)
        {
            if(num<r.val)
                r = r.left;
            else if(num>r.val)
                r = r.right;
            else
            {
                found = true;
                break;
            }
        }
        if (found)
        System.out.println("Element is present in Binary Search Tree");
        else
        System.out.println("Element is not present in Binary Search Tree");
    }

    void inorder(BSTStruct root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println("  " + root.val);
            inorder(root.right);
        }
    }
    void preorder(BSTStruct root)
    {
        if(root!=null)
        {
            System.out.println(" "+root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(BSTStruct root)
    {
        if (root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(" "+root.val);
        }
    }
    void delete(int element)
    {
        root = deleteRec(root, element);
    }
    BSTStruct deleteRec(BSTStruct root, int element)
    {
        if (root == null)
            return root;
        if (element < root.val)
            root.left = deleteRec(root.left, element);
        else if (element > root.val)
            root.right = deleteRec(root.right, element);
        // if element is same as root's element, then this is the node to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node with two children: Get the inorder successor(smallest in the right subtree)
            int min = root.val; 
            while (root.left != null) 
            {
                min = root.left.val; 
                root = root.left; 
            }
            root.val = min;
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }
    public static void main(String args[])
    {
        BST ob = new BST();
        Scanner in = new Scanner(System.in);
        String s = "yes";
        while (s.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter 1 for Insertion");
            System.out.println("Enter 2 for Search");
            Integer choice = in.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("How many numbers do you want to enter???");
                int n = in.nextInt(),t=0;
                for (int i=0;i<n;i++)
                {
                    System.out.println("Enter a number");
                    t = in.nextInt();
                    ob.insert(t);
                }
                System.out.println("Tree after insertion in INORDER traversal is:");
                ob.inorder(ob.root);
                break;
                case 2:
                System.out.println("Enter element to be searched");
                int g = in.nextInt();
                ob.search(ob.root,g);
                break;
                default:
                System.out.println("Wrong Input!!!!");
            }
            if (choice!=1 || choice!=2)
            System.out.println("Do you want to continue??\n Enter \'yes\'' or \'no\'");
            in.nextLine();
            s = in.nextLine().trim();
        }
        in.close();
    }

}
