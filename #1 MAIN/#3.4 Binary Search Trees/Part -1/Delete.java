

public class Delete{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }


    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left=delete(root.left,val);
        }
        else if(root.data < val){
            root.right=delete(root.right,val);
        }
        else{  //jo delete kerni hai value found
             //leaf node
             if(root.left==null && root.right==null){
                return null;
             }

             //one child
             if(root.left==null){
                return root.right;
             }else if(root.right==null){
                return root.left;
             }

             //two child
    /*       //Method - 1
             Node IS=findInorderSuccesor(root.right);
             root.data=IS.data; // replaced
             root.right=delete(root.right,IS.data); 
            //delete inorder successor from right subtree and updating right subtree
     */
            //Method - 2
            Node IS=findInorderSuccesor1(root.left);
             root.data=IS.data; // replaced
             root.left=delete(root.left,IS.data); 
             //delete inorder successor from left subtree and updating left subtree
             
        }
        return root;
    }
    public static Node findInorderSuccesor(Node root){  //Inorder Succeesor Method - 1
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node findInorderSuccesor1(Node root){  //Inorder Succeesor Method - 2
        while(root.right!=null){
            root=root.right;
        }
        return root;
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
        int values[]={25,10,35,5,20,3,6,15,21};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
        Node Root=delete(root,10);
        inorder(Root);
    }
}