

import java.util.*;
public class Part2Ques{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int d){
            data = d;
            right = left = null;
        }
    }
    static class BST{
        public static Node insert(Node root,int val){
            if(root==null){
                root = new Node(val);
                return root;
            }
            if(root.data < val){
                root.right = insert(root.right,val);
            }else{
                root.left = insert(root.left,val);
            }
            return root;
        }
        public static void inorderSeqGetter(Node root,ArrayList<Integer> path){
            if(root==null) return ;

            inorderSeqGetter(root.left,path);
            path.add(root.data);
            inorderSeqGetter(root.right,path);
        }
        public static void preOrder(Node root){
            if(root==null) return ;

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static Node buildBST(int arr[],int si,int ei){
            if(si>ei) return null;
            
            int mid = si + (ei-si)/2;
            Node root = new Node(arr[mid]);
            root.left = buildBST(arr,si,mid-1);
            root.right = buildBST(arr,mid+1,ei);

            return root;
        }

        static class Info{
            boolean isBST;
            int size;
            int min;
            int max;
            Info(boolean isBST,int size,int min,int max){
                this.isBST = isBST;
                this.size = size;
                this.min = min;
                this.max = max;
            }
        }
        static int maxBST=0;
        public static Info largestBstInBt(Node root){
            if(root == null){
                return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
            }

            Info leftSubTInfo = largestBstInBt(root.left);
            Info rightSubTInfo = largestBstInBt(root.right);

            int min = Math.min(root.data,Math.min(leftSubTInfo.min,rightSubTInfo.min));
            int max = Math.max(root.data,Math.max(leftSubTInfo.max,rightSubTInfo.max));
            int size = leftSubTInfo.size + rightSubTInfo.size + 1;

            if(root.data <= leftSubTInfo.max || root.data >= rightSubTInfo.min){
                return new Info(false,size,min,max);
            }

            if(leftSubTInfo.isBST && rightSubTInfo.isBST){
                maxBST = Math.max(maxBST,size);
                return new Info(true,size,min,max);
            }
           else{
                return new Info(false,size,min,max);
           }

        }
    }
    public static void main(String args[]){
        BST tree = new BST();
        // Node root = null;
        int arr[] = {2,3,4,5,8,9,10,11,12};
        //Sorted Array To BST
        Node root = tree.buildBST(arr,0,arr.length-1);
        System.out.println("Sorted Array to BST:");
        tree.preOrder(root);
        //  8 3 2 4 5 10 9 11 12 

        //Same Logic in these Question also
        // 1. BST to Balanced BST
        // 2. Merge 2 BST's 
        //First get inorder Seq which will be sorted then build bst


        //Question Largest BST in Given BT
                /*
                       50
                     /    \
                  30       60
                 /  \     /  \ 
                5   20   45    70
                              /  
                            65    
              
                    given BT
         */
        root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);

        /*
                     60
                    /  \ 
                  45    70
                       /  
                     65    
            expected BST
        */
        System.out.println();
        tree.largestBstInBt(root);
        System.out.println("Largest BST Size is: "+tree.maxBST); // 4

    }
}