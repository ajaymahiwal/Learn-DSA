

//All Ways of tree traversal
import java.util.*;
public class TreeTraversal{
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

    static  class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        //PRE-ORDER
        public static void preorderTraversal(Node root){
            if(root==null){
            // System.out.print(-1+" ");
            return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        //IN-ORDER
        public static void inorderTraversal(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }

        //POST-ORDER
        public static void postorderTraversal(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
        }

        //LEVEL-ORDER
        public static void levelorderTraversal(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        // tree.preorderTraversal(root);  //Time Complexity=> O(n)
        //op => 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1 
        // Without printing -1 =>  1 2 4 5 3 6 

        // tree.inorderTraversal(root);   //Time Complexity => O(n)
        //op  => -1 4 -1 2 -1 5 -1 1 -1 3 -1 6 -1 
        // Without Printing -1  =>  4 2 5 1 3 6 

        // tree.postorderTraversal(root);   //Time Complexity => O(n)
        //op  =>  -1 -1 4 -1 -1 5 2 -1 -1 -1 6 3 1 
        //Without Printing -1  =>  4 5 2 6 3 1 

        tree.levelorderTraversal(root);//Time Complexity => O(2*n)=O(n)  2 is constant.
        /* //output
            1 
            2 3
            4 5 6
         */
        
    }
}