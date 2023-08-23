

//Count of nodes   //Time complexity= O(n)
public class CountNodes{

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

    //Count
    public static int count(Node root){  //Time complexity= O(n)
        if(root==null){
            return 0;
        }
        int lc=count(root.left);  //left count
        int rc=count(root.right); //right count
        return lc+rc+1;
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

        System.out.println("Total Nodes are="+count(root));
        //op => Total Nodes are=7
    }
}