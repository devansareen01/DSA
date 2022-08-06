package Binarytrees;

import java.util.Scanner;

public class  BinaryTreeInputRecursively 
{
    public static BinaryTreeNode<Integer> TakeInput(Scanner sc)
    {
       System.out.println("enter root data");
       int data = sc.nextInt();
       BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
       if(data == -1)
       {
           return null;
       }
       root.left = TakeInput(sc);  //whenever takeinput is called a new root is made that root will be added in the left of previous root and if again takeinput is called now our current root will add next root 
       root.right = TakeInput(sc);
       return root;
    }
    public static void print(BinaryTreeNode<Integer> root)
    {
         if(root == null)
         {
             return;
         }
         String s = root.data + ":";
         if(root.left != null)
         {
             s += root.left.data + "L" + ",";
         }
         if(root.right != null)
         {
             s+= root.right.data + "R";
         }
         System.out.println(s);
         print(root.left);
         print(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = TakeInput(sc);
        print(root);
        sc.close();
    }
}
