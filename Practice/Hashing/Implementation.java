
import java.util.*;
class Implementation{
    static class HashMap< K,V >{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        LinkedList<Node> [] bucket;
        int N;
        int nodes;
        ArrayList< K > keySet = new ArrayList<>();

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key){
            return Math.abs(key.hashCode()) % N;
        }
        public int searchInLL(int bi,K key){

            for(int i=0;i<bucket[bi].size();i++){
                if(bucket[bi].get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash(){
            LinkedList<Node> [] oldBucket = bucket;
            bucket = new LinkedList[N*2];

            N = N*2;

            for(int i=0;i<bucket.length;i++){
                bucket[i] = new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll =oldBucket[i];
                for(int j=0;j<ll.size();j++){
                // for(int j=0;j<oldBucket[i].size();j++){
                    // Node node = oldBucket[i].remove(j);
                    Node node = ll.remove(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi = hashFunction(key);
            int di = searchInLL(bi,key);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }else{
                bucket[bi].add(new Node(key,value));
                nodes++;
                keySet.add(key);
            }

            double lamda = (double)nodes/N;
            if(lamda>2.0){
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(bi,key);

            if(di != -1){
                return bucket[bi].get(di).value;
            }
            else{
                return null;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(bi,key);

            if(di != -1){
                keySet.remove(key);
                return bucket[bi].remove(di).value;
            }else{
                return null;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(bi,key);

            if(di != -1){
                return true;
            }
            return false;
        }

        public ArrayList< K > keySet(){
            //it is working like LinkedHashMap, order is mantained in this.
            //without anykind of DLL we can save the order of Nodes which we are adding.
            return keySet;
        }

        public ArrayList<K> keySet_1(){
            ArrayList<K> keys= new ArrayList<>();

            for(int i=0;i<bucket.length;i++){
                LinkedList<Node> ll =bucket[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            } 
            return keys;
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer> mapp = new HashMap<>();

        
        mapp.put("Ajay",20);
        mapp.put("Gargi",3);
        mapp.put("Raj",77);
        mapp.put("dhs",377);
        mapp.put("hsdj",37);
        mapp.put("hiisd",30);


        mapp.remove("dhs");
        System.out.println(mapp.containsKey("Raj"));
        System.out.println(mapp.containsKey("raj"));

        for(String k:mapp.keySet()){
            System.out.println(k+" -> "+ mapp.get(k));
        }
        
        System.out.println();
        System.out.println();

        for(String k:mapp.keySet_1()){
            System.out.println(k+" -> "+ mapp.get(k));
        }
    }
}