

import java.util.*;
class BT{
    static class Node{
        int val;
        Node right;
        Node left;
        Node(int d){
            val = d;
            right = left = null;
        }
    }
    static class BinaryTree{
        public static void preorderSeq(Node root){
            if(root==null) return ;

            System.out.print(root.val+" ");
            preorderSeq(root.left);
            preorderSeq(root.right);

        }
        //TC => O(n)
        public static boolean isUnivalued(Node root){
            if(root==null) return true;

            if(root.left!=null && root.left.val != root.val){
                return false;
            }
            if(root.right!=null && root.right.val != root.val){
                return false;
            }

            return isUnivalued(root.left) && isUnivalued(root.right);
        }

        //TC = O(n)
        public static Node invertBT(Node root){
            if(root==null) return null;

            Node leftST = invertBT(root.left);
            Node rightST = invertBT(root.right);

            root.left = rightST;
            root.right = leftST;

            return root;
        }

        //TC => O(n)
        public static Node deleteLeafNodesValueX(Node root,int data){
            if(root==null) return null;

            if(root.val == data && root.left==null && root.right==null){
                return null;
            }

            root.left = deleteLeafNodesValueX(root.left,data);
            root.right = deleteLeafNodesValueX(root.right,data);

            if(root.val == data && root.left==null && root.right==null){
                return null;
            }

            return root;
        }
        
        //TC O(n)
        static class Res {
            public int val;
        }
        public static int maxPathSum(Node root){
            Res res = new Res();
            res.val = Integer.MIN_VALUE;

            maxPathSumUtil(root,res);
            return res.val;
        }
        public static int maxPathSumUtil(Node root,Res res){
            if(root==null)return 0;

            int l = maxPathSumUtil(root.left,res);
            int r = maxPathSumUtil(root.right,res);

            int max_single = Math.max(Math.max(l,r)+root.val, root.val);
            int currSum = l + r + root.val;
            int max_top = Math.max(max_single, l + r + root.val);  

            res.val = Math.max(res.val,max_top);          
            return max_single;
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(5);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(5);
        root.left.right = new Node(5);

        System.out.println(tree.isUnivalued(root)); // true

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        tree.preorderSeq(root);
        System.out.println();
        root = tree.invertBT(root); //convert bt into mirror of it.
        tree.preorderSeq(root);
        System.out.println();

        root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        tree.deleteLeafNodesValueX(root,3);
        tree.preorderSeq(root);
        System.out.println();

        root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        int result = tree.maxPathSum(root);
        System.out.println(result);
    }
}