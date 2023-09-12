

public class PrintInRange{
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
             //left subtree
            root.left=insert(root.left,val);
        }else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void rangePrinter(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            rangePrinter(root.left,k1,k2);
            System.out.print(root.data+" ");
            rangePrinter(root.right,k1,k2);
        }
        else if(root.data < k1){
            rangePrinter(root.right,k1,k2);
        }
        else{
            rangePrinter(root.left,k1,k2);
        }
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
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        System.out.println("Inorder");
        inorder(root);
        System.out.println();
        rangePrinter(root,10,15);
        /**
        Inorder
        1 3 4 5 6 8 10 11 14 
        10 11 14 //Range
         */
    }
}