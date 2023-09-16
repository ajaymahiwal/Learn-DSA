

import java.util.*;
class BST{
    static class Node{
        int val;
        Node right,left;
        Node(int val){
            this.val  = val;
            right=left=null;
        }
    }
    static class BinaryTree{
        //O(n) will visit everynode
        public static int rangeSum(Node root,int l,int r,int sum[]){
            if(root==null)return 0;

            if(root.val>=l && root.val<=r){
                rangeSum(root.left,l,r,sum);
                sum[0]+=root.val;
                rangeSum(root.right,l,r,sum);
            }
            else if(root.val < l){
                rangeSum(root.right,l,r,sum);
            }
            else{
                rangeSum(root.left,l,r,sum);
            }

            return sum[0];
        }

        //O(H) will visit only one side (left ya right) elements after comparing with k
        public static int closestEle(Node root,int k,int min[]){
            if(root==null)return 0;

            int diff = Math.abs(root.val - k);
            min[0] = Math.min(min[0],diff);

            if(root.val > k){
                closestEle(root.left,k,min);
            }
            else{
                closestEle(root.right,k,min);
            }

            return min[0];
        }

        //Tc = O(n) SC= O(1) no extra space other than recusion
        public static int kthSmallestEle(Node root,int k){
            int pointer[] = new int[2];
            pointer[0] = -1;
            
            return inorderUtil(root,k,pointer);
        }
        public static int inorderUtil(Node root,int k,int pointer[]){
            if(root == null){
                if(pointer[0]==-1){
                    pointer[0] = 0;
                }
                return -1;
            }
            inorderUtil(root.left,k,pointer);
            if(++pointer[0] == k){
                pointer[1]=root.val;
            }
            inorderUtil(root.right,k,pointer);

            return pointer[1];
        }

        //TC O(n)  SC O(n)
        public static int kthSmallestEle_1(Node root,int k){
            ArrayList<Integer> list = new ArrayList<>();
            inorderUtil_1(root,list);

            return list.get(k-1);
        }
        public static void inorderUtil_1(Node root,ArrayList<Integer> list){
            if(root == null){
                return;
            }
            inorderUtil_1(root.left,list);
            list.add(root.val);
            inorderUtil_1(root.right,list);
        }





        static class Info{
            boolean isBST;
            int size;
            int min;
            int max;
            int sum;
            Info(boolean isBST,int size,int min,int max,int sum){
                this.isBST = isBST;
                this.size = size;
                this.min = min;
                this.max = max;
                this.sum = sum;
            }
        }

         static int maxBST=0;
         static int maxBSTsum=0;
        public static Info maxSumBSTinBT(Node root){
            if(root == null){
                return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
            }

            Info leftSubTInfo = maxSumBSTinBT(root.left);
            Info rightSubTInfo = maxSumBSTinBT(root.right);

            int min = Math.min(root.val,Math.min(leftSubTInfo.min,rightSubTInfo.min));
            int max = Math.max(root.val,Math.max(leftSubTInfo.max,rightSubTInfo.max));
            int size = leftSubTInfo.size + rightSubTInfo.size + 1;
            int sum = leftSubTInfo.sum + rightSubTInfo.sum + root.val;

            if(root.val <= leftSubTInfo.max || root.val >= rightSubTInfo.min){
                return new Info(false,size,min,max,sum);
            }

            if(leftSubTInfo.isBST && rightSubTInfo.isBST){
                maxBST = Math.max(maxBST,size);
                maxBSTsum = Math.max(maxBSTsum,sum);
                return new Info(true,size,min,max,sum);
            }
           else{
                return new Info(false,size,min,max,sum);
           }

        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        //BST
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.right.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        int sum[] = new int[1];
        System.out.println(tree.rangeSum(root,3,8,sum)); // 3 + 5 + 6 + 8 = 22

        int min[] = new int[1];
        min[0] = Integer.MAX_VALUE;
        System.out.println(tree.closestEle(root,19,min)); // 1

        System.out.println(tree.kthSmallestEle(root,6)); // 20
        System.out.println(tree.kthSmallestEle_1(root,6)); // 20


         root = new Node(5);
        root.left = new Node(9);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.left.left = new Node(6);
        // root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);
        tree.maxSumBSTinBT(root);
        System.out.println(tree.maxBSTsum); // 22 ✅
    }
}