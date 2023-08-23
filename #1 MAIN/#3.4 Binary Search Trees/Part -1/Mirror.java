

public class Mirror{

    static class Node{
        int data;
        Node left,right;
        Node(int da){
            data=da;
            left=null;
            right=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static Node mirrorBst(Node root){  // TC => O(n)
        if(root==null){
            return null;
        }
        Node leftS=mirrorBst(root.left);
        Node rightS=mirrorBst(root.right);

        root.left=rightS;
        root.right=leftS;
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String args[]){
        int values[]={8,5,10,6,3,11};
/*           8                         8
           /   \                     /   \
          5     10        ==>>     10     5
         / \    / \               / \    / \
        3   6  N    11           11  N  6   3
*/
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);   //Sorted aaya hai isliye BST hai
        System.out.println();

        root=mirrorBst(root);
        preorder(root);

        // 3 5 6 8 10 11  inorder
        // 8 10 11 5 6 3  preorder
    }
}