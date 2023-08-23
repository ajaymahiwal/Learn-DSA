
// APPROACH 1: //Time complexity: O(n^2)
// APPROACH 2: //Time complexity: O(n)

public class Diameter1{

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

     public static int height(Node root){  
        if(root==null){
            return 0;
        }
        int lh=height(root.left);   //left-height
        int rh=height(root.right); //right-height
        int h=Math.max(lh,rh) + 1;
        return h;
    }
// APPROACH 1: //Time complexity: O(n^2)
    public static int diameterOfTree(Node root){  
        if(root==null){
            return 0;
        }
        int lDiam=diameterOfTree(root.left);
        int rDiam=diameterOfTree(root.right);

        int lh=height(root.left);
        int rh=height(root.right);
        int self=lh+rh+1;  // passes through root

        int subTreeDiam= Math.max(lDiam,rDiam);  //Maximum Diameter from Left & Right SubTree
        int maxDiam= Math.max(subTreeDiam,self); // Maximum Diameter of Tree
        return maxDiam;
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


        System.out.println("Diameter of Tree is= "+diameterOfTree(root));
        //Diameter of Tree is= 6
    }
}