
 
//Height of a tree  //Time complexity: O(n)
public class Height{

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

    //HEIGHT OF A TREE
    public static int height(Node root){   //Time complexity: O(n)
        if(root==null){
            return 0;
        }
        int lh=height(root.left);   //left-height
        int rh=height(root.right); //right-height
        int h=Math.max(lh,rh) + 1;
        return h;
    }


    public static void main(String args[]){
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        
         */
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Height of Tree is= "+height(root));
        //op =>  Height of Tree is= 3
    }
}