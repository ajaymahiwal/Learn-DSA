

import java.util.*;
public class KthLevel{

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

    // Using Recursion TC=>O(n)
    public static void kthLevelProblem(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kthLevelProblem(root.left,level+1,k);
        kthLevelProblem(root.right,level+1,k);
    }

        //Using Iteration =>  TC=> O(n)
        public static void kthLevelProblem(Node root,int k){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            int level=1;
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                        level+=1;
                    }
                }
                else{
                    // System.out.print(currNode.data+" ");
                    if(level==k){
                        do{
                            System.out.print(currNode.data+" ");
                            currNode=q.remove();
                        }while(!q.isEmpty());

                        return;
                    }
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                    // System.out.println("level="+count);
                }
            }
        }
  
    
    public static void main(String args[]){
                /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
           /
          8

         */
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);

        kthLevelProblem(root,1,3);
        // 4 5 6 7 
        // System.out.println();
        kthLevelProblem(root,3);
        //4 5 6 7 
    }
}