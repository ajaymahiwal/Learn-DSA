

//Sum of Nodes (yani jo data hai nodes k ander un sab ka Sum return kerna hai)
public class SumOfNodes{

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

    //SUM of Nodes
    public static int sum(Node root){   //Time complexity= O(n)
        if(root==null){
            return 0;
        }
        int lSum=sum(root.left);
        int rSum=sum(root.right);
        int treeSum = lSum+rSum+root.data;
        return treeSum;
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

        System.out.println("Sum of All Nodes= "+sum(root));
        //op => Sum of All Nodes= 28
    }
}