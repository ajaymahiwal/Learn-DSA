

import java.util.*;
public class Part1Ques{
    //Node class
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int d){
            this.data=d;
            left=right=null;
        }
    }
    //BST class
    static class BST{
        //Build BST || Insert TC O(h)
        public static Node insert(Node root,int val){
            if(root==null){
                root = new Node(val);
                return root;
            }
            if(root.data > val){
                root.left = insert(root.left,val);
            }
            else{ //root.data < val
                root.right = insert(root.right,val);
            }
            return root;
        }
        //Inorder Sequence (Traversal)
        public static void inorderSeq(Node root){
            if(root==null){
                return;
            }
            inorderSeq(root.left);
            System.out.print(root.data+" ");
            inorderSeq(root.right);
        }

        //PrintInRange TC=> O(n)
        public static void printInRange(Node root,int n1,int n2){
            if(root==null)return;

            //When a node is in range of n1 and n2.
            if(root.data >= n1 && root.data <= n2){
            //then check for values which are smaller than that node value
                printInRange(root.left,n1,n2);
            //after checking small values now print node value (root value)
                System.out.print(root.data+" ");
            //now check for larger values then that node value
                printInRange(root.right,n1,n2);
            }
            else if(root.data < n1){
            // when node value is less than given range
                printInRange(root.right,n1,n2);
            }
            else{ // root.data > n2
            //when node value is larger than given range
                printInRange(root.left,n1,n2);
            }
        }

        //root to leaf node all path printer
        static ArrayList<Integer> path = new ArrayList<>();
        public static void rootToLeaf(Node root){
            if(root==null) return;

            path.add(root.data);
            //we reached at a leaf node
            if(root.left == null && root.right == null){
                printPath(path);
            }
            rootToLeaf(root.left);
            rootToLeaf(root.right);
            path.remove(path.size()-1);
        }
        public static void printPath(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"-");
            }
            System.out.println();
        }

        //validate bst tc=> O(n) checking every node 
        public static boolean validateBST(Node root){
            return isVaild(root,null,null);
        }
        public static boolean isVaild(Node root,Node min,Node max){
            if(root==null){
                return true;
            }
            if(min!=null && root.data <= min.data){
                return false;
            }
            if(max!=null && root.data >= max.data){
                return false;
            }

            return isVaild(root.left,min,root) && isVaild(root.right,root,max);
        }

        //mirror  TC => O(n)
        public static Node mirrorBST(Node root){
            if(root==null){
                return null;
            }
            Node leftSubT = mirrorBST(root.left);
            Node rightSubT = mirrorBST(root.right);

            root.left = rightSubT;
            root.right = leftSubT;

            return root;
        }

        public static void preOrder(Node root){
            if(root==null)return ;

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String a[]){
        BST tree = new BST();
        Node root = null;
        int arr[] = {8,6,7,12,10,15,5,13};

        for(int k=0;k<arr.length;k++){
            root = tree.insert(root,arr[k]);
        }
        
        tree.inorderSeq(root); // 5 6 7 8 10 12 13 15 
        System.out.println();
        tree.printInRange(root,10,15); // 10 12 13 15
        System.out.println();
        tree.rootToLeaf(root);
        // 8-6-5-
        // 8-6-7-
        // 8-12-10-
        // 8-12-15-13-

        System.out.println(tree.validateBST(root)); //true
        // root.left.left.left=new Node(100); //false

        tree.preOrder(root);
        System.out.println();
        tree.mirrorBST(root);
        tree.preOrder(root);
            //8
    //   6       12
//    5    7  10    15
//                13

//MIRROR
            //8
    //   12       6
//    15    10  7    5
//      13
    }
}