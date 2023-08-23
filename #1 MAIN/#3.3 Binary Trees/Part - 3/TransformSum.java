

//Transform to sum Tree
import java.util.*;
public class TransformSum{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftChild=sum(root.left);
        int rightChild=sum(root.right);
        int value=root.data;

        int newLeft=root.left==null ? 0 : root.left.data;
        int newRight=root.right==null ? 0 : root.right.data;

        root.data=leftChild+newLeft+rightChild+newRight;
        return value;
    }

    //Using PreOrder traversal
    public static void Print(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Print(root.left);
        Print(root.right);
    }
    public static void main(String args[]){
                /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        
         */
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        sum(root);//  Transform Sum
        Print(root);
        //27 9 0 0 13 0 0 
    }
}