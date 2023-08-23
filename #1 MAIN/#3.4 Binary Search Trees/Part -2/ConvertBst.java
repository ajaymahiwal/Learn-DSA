

//convert BST to balanced BST
import java.util.*;
public class ConvertBst{

    static class Node{
        int data;
        Node left,right;
        Node(int dta){
            data=dta;
            left=null;
            right=null;
        }
    }

    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }

    public static Node createBst(ArrayList<Integer> arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBst(arr,st,mid-1);
        root.right=createBst(arr,mid+1,end);
        return root;
    }

    public static Node balanceBst(Node root){
        //Inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        // System.out.print(inorder);  //for checking list id Sorted or not .
        //Sorted inorder -> balance BST
        root = createBst(inorder,0,inorder.size()-1);
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){

/*           8                         8
           /   \                     /    \
          6     10        ==>>      5      11
         /       \                 / \    /  \
        5         11              3   6  10   12
       /           \         
      3             12             expected BST
*/
        //GIVEN BST 
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        root=balanceBst(root);
        preorder(root);

    }
}