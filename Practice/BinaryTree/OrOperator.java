


//Video 23.2 at 46:00 mintues
import java.util.*;
class OrOperator{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            left = right = null;
        }
    }
    static class BinaryTree{
        public static boolean orTest(Node root,int val){
            if(root==null){
                return false;
            }
            if(root.data==val){
            System.out.print(root.data+" ");
                return true;
            }
            System.out.print(root.data+" ");
            
            /*
            boolean left = orTest(root.left,val);
            boolean right = orTest(root.right,val);
            return left || right;
            
            // 1    2    4     5     3     6

             */

            boolean result =  orTest(root.left,val) || orTest(root.right,val);
            return result;
            // 1    2    4

            //Ager true hogya left phle hi to phir right vale subtree k liye call hi nhi jayegi

        }
        static int i=-1;
        public static Node kthAncestor(Node root,int num,int k){
            if(root==null){
                return root;//null
            }
            if(root.data==num){
                i = 0;
                return root;
            }
            Node leftSub = kthAncestor(root.left,num,k);
            Node rightSub = kthAncestor(root.left,num,k);
            if(i > -1){
                i++;
            }
            if(k==i){
                return root;
            }
            return root;
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node rooot = new Node(1);
        rooot.left = new Node(2);
        rooot.right = new Node(3);
        rooot.left.left = new Node(4);
        rooot.left.right = new Node(5);
        rooot.right.right = new Node(6);
        tree.orTest(rooot,4);

        System.out.println(tree.kthAncestor(rooot,5,1).data);
    }
}