
//Questions 

// 1. KthLevel Nodes of tree (both approach TC=> O(n) & (_1 SC=> O(1) _2 SC=> O(n))
// 2. LCA (Lowwst Common Ancestor) of two Nodes n1 and n2  (Both Tc=>O(n)) and space   complexities of both (_1 SC=> O(1) & _2 SC=> O(n))
// 3. Minimum Distance bw Two Nodes   TC=>O(n) & SC=> O(1)
// 4. Kth Ancestor of a Node          TC=>O(n) & SC=> O(1)
// 5. Transform to Sum Tree           TC=>O(n) & SC=> O(1)
import java.util.*;
class Part3Ques{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree{
        public static void kthLevelTree_1(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            kthLevelTree_1(root.left,level+1,k);
            kthLevelTree_1(root.right,level+1,k);
        }
        public static void kthLevelTree_2(Node root,int k){
            if(k==1){
                System.out.println(root.data);
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            int level=1;
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        level++;
                        if(level==k){
                            while(!q.isEmpty()){
                                System.out.print(q.remove().data+" ");
                            }
                            break;
                        }
                      q.add(null);
                    }
                }
                else{

                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }//While loop End

            System.out.println();
        }

        //LCA
        public static int lca_1(Node root,int n1,int n2){
            ArrayList<Integer> path1 = new ArrayList<>();
            ArrayList<Integer> path2 = new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);
            int i=0;
            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }

            return path1.get(i-1);
        }
        public static boolean getPath(Node root,int n,ArrayList path){
            if(root==null){
                return false;
            }
            path.add(root.data);
            if(root.data==n){
                return true;
            }
            // boolean leftSubT = getPath(root.left,n,path);
            // boolean rightSubT = getPath(root.right,n,path);

            if(getPath(root.left,n,path) || getPath(root.right,n,path)){
                return true;
            }
            path.remove(path.size()-1);
            return false;
        }

        //LCA
        public static Node lca_2(Node root,int n1,int n2){
            if(root==null) return root; //null
            if(root.data == n1 || root.data == n2){
                return root;
            }

            Node leftSubT = lca_2(root.left,n1,n2);
            Node rightSubT = lca_2(root.right,n1,n2);

            if(rightSubT==null){
                return leftSubT;
            }
            if(leftSubT==null){
                return rightSubT;
            }

            return root;
        }


        //Minimum Distance Question
        public static int minDistance(Node root,int n1,int n2){
            Node lca = lca_2(root,n1,n2);
            int dist1 = findDistane(lca,n1);
            int dist2 = findDistane(lca,n2);

            return dist1 + dist2;
        }
        public static int findDistane(Node node,int n){
            if(node==null) return -1;
            if(node.data==n) return 0;

            int leftSubT = findDistane(node.left,n);
            int rightSubT = findDistane(node.right,n);

            if(leftSubT==-1 && rightSubT==-1) return -1;

            // if(rightSubT==-1){
            //     return leftSubT+1;
            // }else{
            //     return rightSubT+1;
            // }

            int max = Math.max(leftSubT,rightSubT);
            return max+1;
        }

        //Kth ancestor of a node
        public static int kthAncestorOfNode(Node root,int n,int k){
            if(root==null) return -1;
            if(root.data==n){
                return 0;
            }
            int leftSubT = kthAncestorOfNode(root.left,n,k);
            int rightSubT = kthAncestorOfNode(root.right,n,k);
            if(leftSubT==-1 && rightSubT==-1){
                return -1;
            }
        //     int max = Math.max(leftSubT,rightSubT);
        //     if(max+1 == k){
        //         System.out.println("Kth Ancestor: "+root.data);
        //     }
        // return max+1;

        if(leftSubT==-1 && rightSubT==-1) return -1;

            if(rightSubT==-1){
                if(leftSubT+1 == k){
                    System.out.println("Kth Ancestor: "+root.data);
                }
                return leftSubT+1;
            }else{
                if(rightSubT+1 == k){
                    System.out.println("Kth Ancestor: "+root.data);
                }
                return rightSubT+1;
            }
        }

        // Transform Sum
        public static int transformSum(Node root){
            if(root==null){
                return 0;
            }
            int leftSubT = transformSum(root.left);
            int rightSubT = transformSum(root.right);

            int currNodeData = root.data;

            int leftChildSum = root.left==null?0:root.left.data;
            int rightChildSum = root.right==null?0:root.right.data;

            root.data = leftChildSum + leftSubT + rightChildSum + rightSubT;
            return currNodeData;
        }

        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+"  ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node rooot = new Node(1);
        rooot.left = new Node(2);
        rooot.right = new Node(3);
        rooot.left.left = new Node(4);
        rooot.left.right = new Node(5);
        rooot.right.left = new Node(6);
        rooot.right.right = new Node(7);

        tree.kthLevelTree_1(rooot,1,2);  //  2  3
        System.out.println();
        tree.kthLevelTree_2(rooot,2);    //  2  3

        System.out.println("lca is: "+tree.lca_1(rooot,4,5));  // 2
        System.out.println("lca is: "+tree.lca_2(rooot,4,6).data);  // 1

        System.out.println("Min Distance bw two node:"+tree.minDistance(rooot,4,3)); // 3
        tree.kthAncestorOfNode(rooot,4,2); // 1

        tree.transformSum(rooot);
        tree.levelOrder(rooot);
    // Transformed Tree   
    //       27
    //     9    13
    //   0   0 0   0  
    }
}