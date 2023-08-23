


// APPROACH 1: //Time complexity: O(n^2)
// APPROACH 2: //Time complexity: O(n)

public class Diameter2{

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

    static class Info{
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
        int hgt=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,hgt);
    }

    public static void main(String args[]){
                /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
           /
          8

         */
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);

        System.out.println("Diameter of tree ="+diameter(root).dia);
        System.out.println("Height of tree ="+diameter(root).ht);
        //Diameter of tree =6
        //Height of tree =4
    }
}