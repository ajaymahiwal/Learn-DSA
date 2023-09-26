
import java.util.*;
class Inbuilt{
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",1947);
        map.put("UK",1947);
        map.put("USA",1742);

       Set<String> keys = map.keySet();

       for(String k : keys){
        System.out.println(k+"->"+map.get(k));
       } 
    }
}