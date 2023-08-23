


import java.util.*;
public class TopView{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.left=null;
        }
    }

    static class Info{
        Node node;
        int hd;// horizontal distance
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topView(Node root){
        //Level Order
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root,0));  //default H.D. 0 hota hai Origin Point manlete hai isaye
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
            if(!map.containsKey(curr.hd)){//first time my hd is occuring
                map.put(curr.hd,curr.node);
            }

            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
        } 

        //print
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    /*
                1
               / \
              2   3
               \
                4
                 \
                  5
                   \
                    6

         */
        
    /*    Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(4);
        root.left.right.right=new Node(5);
        root.left.right.right.right=new Node(6);  */

       
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
           /
          8

         */
        //  /*
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        //  */

        topView(root);
        //8 4 2 1 3 7 
    }
}