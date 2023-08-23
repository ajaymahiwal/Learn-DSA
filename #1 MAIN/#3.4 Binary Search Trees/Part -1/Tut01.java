

//Bulid a BST

public class Tut01{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Insert => Bulid BST
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

    //Inorder
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Search Node  O(H)  H is height
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);   //root.data > key (key is less than root)
        }else{
            return search(root.right,key);  //root.data < key (key is greater than root)
        }

    }

    //Delete
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left=delete(root.left,val);
        }
        else if(root.data < val){
            root.right=delete(root.right,val);
        }
        else{  //when root.data == val  Jo val delete kerni hai vo delete ker dege

            //Case 1: Leaf Child
            if(root.left==null && root.right==null){
                return null;
            }

            //Case 2: Single Child exist
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //Case 3: Both Children exist
            Node IS=findInorderSuccesor(root.right);
            root.data=IS.data; //Value Replaced with that root
            root.right=delete(root.right,IS.data);
        }

        return root;
    }

    public static Node findInorderSuccesor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }


    public static void main(String args[]){
        // int values[]={8,5,3,1,4,6,10,11,14};
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
        //1 2 3 4 5 7   sorted

        //Search   ✅TC=> O(H)  H is height of tree.
        if(search(root,88)){
            System.out.println("Value Found.");
        }else{
            System.out.println("Value Not Found.");
        }


        //delete
        Node Root=delete(root,1);
        inorder(Root);
    }
}