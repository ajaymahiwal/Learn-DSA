


class StartWith{

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startWith(String s){
        Node curr = root;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx]==null){
                return false;  
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String args[]){
        String arr[] = {"hello","mahi","google","tcs","googly","hola"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        System.out.println(startWith("goog"));  //true
    }
}