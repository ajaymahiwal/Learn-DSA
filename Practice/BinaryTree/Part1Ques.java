


import java.util.*;
class Part1Ques{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    static class BinaryTree{
        public static int height(Node root){  //O(n)
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            
            return Math.max(lh,rh)+1;
        }

        public static int sumOfNodes(Node root){ //O(n)
            if(root==null){
                return 0;
            }
            int lSum = sumOfNodes(root.left);
            int rSum = sumOfNodes(root.right);

            return lSum+rSum+root.data;
        }

        public static int countNodes(Node root){ //O(n)
            if(root == null){
                return 0;
            }
            int lNodes = countNodes(root.left);
            int rNodes = countNodes(root.right);

            return lNodes+rNodes+1;
        }

        public static int diameter1(Node root){  //O(n^2)
            if(root == null){
                return 0;
            }
            int leftDia = diameter1(root.left);
            int rightDia = diameter1(root.right);
            
            //Height Of left and right subtrees
            int leftSubtreeH = height(root.left); 
            int rightSubtreeH = height(root.right);

            int selfDia = leftSubtreeH + rightSubtreeH + 1;

            return Math.max(selfDia,Math.max(leftDia,rightDia));
        }



        static class Info{
            int dia;
            int ht;
            Info(int dia,int ht){
                this.dia=dia;
                this.ht=ht;
            }
        }
        public static Info diameter2(Node root){ //O(n)
            if(root==null){
                return new Info(0,0);
            }
            Info leftSubTree = diameter2(root.left);
            Info rightSubTree = diameter2(root.right);

            int selfDia = leftSubTree.ht + rightSubTree.ht + 1;
            int dia = Math.max(selfDia,Math.max(leftSubTree.dia,rightSubTree.dia));
            int ht = Math.max(leftSubTree.ht,rightSubTree.ht) + 1;

            return new Info(dia,ht);
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.left = new Node(6);
        root.right.right= new Node(7);
        root.right.right.right= new Node(8);

        System.out.println(tree.height(root)); // 4
        System.out.println(tree.sumOfNodes(root)); // 36
        System.out.println(tree.countNodes(root)); // 8

        System.out.println(tree.diameter1(root)); // 6 O(n^2)
        System.out.println(tree.diameter2(root).dia); // 6 O(n)


    }
}