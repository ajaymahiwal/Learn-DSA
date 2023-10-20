


//Date 06/09/2023
//Build a preorder BinaryTree
//Traversal's on Binary tree
import java.util.*;
public class Lec01{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1; 

        public static Node buildTree(int nodes[]){ //O(n)
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrderTraversal(Node root){ //O(n)
            if(root == null){
                System.out.print(-1 +" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static void inOrderTraversal(Node root){ //O(n)
            if(root == null){
                System.out.print(-1 +" ");
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }

        public static void postOrderTraversal(Node root){ //O(n)
            if(root == null){
                System.out.print(-1 +" ");
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrderTraversal(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }


    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);
        tree.preOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(root);
        System.out.println();
        tree.postOrderTraversal(root);
        System.out.println();
        tree.levelOrderTraversal(root);
        System.out.println();
    }
}

/*

(DFS Traversal)  TC=O(n) SC=O(1)
1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1   //PreOrder
-1 4 -1 2 -1 5 -1 1 -1 3 -1 6 -1   //InOrder
-1 -1 4 -1 -1 5 2 -1 -1 -1 6 3 1   //PostOrder

(BFS Traversal)
//LevelOrder  TC=O(n) SC=O(n)- for Queue
1 
2 3
4 5 6
 */