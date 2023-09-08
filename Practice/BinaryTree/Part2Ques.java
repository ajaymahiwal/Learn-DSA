

import java.util.*;
class Part2Ques{
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
        public static boolean isIdentical(Node node,Node subroot){
            if(node == null && subroot == null){
                return true;
            }
            if(node == null || subroot == null || node.data!=subroot.data){
                return false;
            }
            if(!isIdentical(node.left,subroot.left)){
                return false;
            }
            if(!isIdentical(node.right,subroot.right)){
                return false;
            }

            return true;
        }
        public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(root.data == subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
        }



        static class Info{
            Node node;
            int hd; //Horizontal Distance
            public Info(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public static void topViewOfTree(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();
            int min=0,max=0;

            q.add(new Info(root,0));
            q.add(null);
            while(!q.isEmpty()){
                Info currNode = q.remove();
                if(currNode==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(currNode.hd)){
                        map.put(currNode.hd,currNode.node);
                    }
                    if(currNode.node.left!=null){
                        q.add(new Info(currNode.node.left,currNode.hd-1));
                        min = Math.min(min,currNode.hd-1);
                    }
                    if(currNode.node.right!=null){
                        q.add(new Info(currNode.node.right,currNode.hd+1));
                        max = Math.max(max,currNode.hd+1);
                    }
                }
            }

            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            } 
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(tree.isSubtree(root,subroot)); //true

        Node rooot = new Node(1);
        rooot.left = new Node(2);
        rooot.right = new Node(3);
        rooot.left.right = new Node(4);
        rooot.left.right.right = new Node(5);
        rooot.left.right.right.right = new Node(6);

        tree.topViewOfTree(rooot); 
        // 2  1  3  6
        tree.bottomViewOfTree(rooot); //one line change in topview code
        // 2  4  5  6   
    }
}