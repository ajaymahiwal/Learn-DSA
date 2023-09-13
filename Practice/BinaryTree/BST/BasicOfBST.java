
import java.util.*;
class BasicOfBST{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int d){
            data=d;
            right=left=null;
        }
    }
    static class BinaryTree{
        public static Node buildBST(Node root,int data){
            if(root==null){
                root = new Node(data);
                return root;
            }
            if(root.data > data){
                root.left = buildBST(root.left,data);
            }
            else{ // root.data < data
                root.right = buildBST(root.right,data);
            }
            return root;
        }
        public static boolean search(Node root,int key){
            if(root==null) return false;
            if(root.data == key){
                return true;
            }

            if(root.data > key){
                return search(root.left,key);
            }
            else{ //root.data < key
                return search(root.right,key);
            }
        }
        public static Node delete(Node root,int val){
            if(root.data > val){
                root.left = delete(root.left,val);
            }
            else if(root.data < val){
                root.right = delete(root.right,val);
            }else{
                //root.data == val case
                if(root.left==null && root.right==null){ //leaf node
                    return null;
                }

                if(root.right==null){
                    return root.left;
                }
                else if(root.left == null){
                    return root.right;
                }

                Node IS = findIS(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }
            return root;
        }
        public static Node findIS(Node root){
                while(root.left!=null){
                    root = root.left;
                }
                return root;
        }

        public static void inorderSeq(Node root){
            if(root==null){
                return;
            }
            inorderSeq(root.left);
            System.out.print(root.data+" ");
            inorderSeq(root.right);
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        int arr[]={4,5,6,2,3,1};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = tree.buildBST(root,arr[i]);
        }
        tree.inorderSeq(root); // 1 2 3 4 5 6 
        System.out.println();
        System.out.println(tree.search(root,10));
        System.out.println(tree.delete(root,2));
        tree.inorderSeq(root); 

    }
}