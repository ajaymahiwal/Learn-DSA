
//Approach 1: TC => O(n) Space => O(n)
//Approach 2: TC => O(n) Space => O(n)
import java.util.*;
public class LowestCommonAncestor{

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
/*  //Approach 1
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }

        path.add(root);
        if(root.data==n){
            return true;
        }

        boolean leftFound=getPath(root.left,n,path);
        boolean rightFound=getPath(root.right,n,path);

        if(leftFound || rightFound){
            return true;
        }

        path.remove(path.size()-1);  //when value is not exist in tree So remove
        return false;

    }

    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);//find root to node path and store in path1 arraylist
        getPath(root,n2,path2);//find root to node path and store in path2 arraylist

        int i=0;
        for(; i<path1.size() && i<path2.size() ;i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last equal node -> i-1th
        Node lca=path1.get(i-1);
        return lca;
    }

*/

    //Approach 2
    public static Node lca2(Node root,int n1, int n2){
        
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);

        //leftLca=value , rightLca=null
        if(rightLca==null){
            return leftLca;
        }
        //rightLca=value , leftLca=null
        if(leftLca==null){
            return rightLca;
        }

        return root;//when leftLca and rightLca both have some value.
    }
    public static void main(String args[]){
    /*
                1
               / \
              2   3
             / \ / \
            4  5 6  6
           /         \
          7           8

    */
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(6);
        root.left.left.left=new Node(7);
        root.right.right.right=new Node(8);

        int n1=7,n2=8;

        // System.out.println(lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
        //1
    }
}