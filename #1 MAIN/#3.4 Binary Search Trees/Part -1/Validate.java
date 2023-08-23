
//Validate BST
public class Validate{

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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


    public static boolean validBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return validBst(root.left,min,root) && validBst(root.right,root,max);
        //jab ye dono True return ker dege to Valid BST hoga vo
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
        // int values[]={5,3,4,5,6,4,3,1};  // Dupicate not allowed in BST my code
        // answer=> Not a Valid BST.

        int values[]={5,3,6,4,7,1};
        //answer=> Valid BST.

        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
        if(validBst(root,null,null)){
            System.out.println("Valid BST.");
        }else{
            System.out.println("Not a Valid BST.");

        }
    }
}