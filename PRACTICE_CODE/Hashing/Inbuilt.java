
import java.util.*;
class Inbuilt{
    public static void main(String args[]){

        //MAP


        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",1947);
        map.put("UK",1947);
        map.put("USA",1742);

       Set<String> keys = map.keySet();

       for(String k : keys){
        System.out.println(k+"->"+map.get(k));
       }
       System.out.println();
       System.out.println();


        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        map1.put("Ajay",1000000);
        map1.put("Raj",18231132);
        map1.put("Mahi",100132);

        for(String key:map1.keySet()){
            System.out.println(key+" -> "+map1.get(key));
        }
        System.out.println();
        System.out.println();
       
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("Guava",40);
        tm.put("Apple",60);
        tm.put("Pomegranate",100);
        tm.put("Banana",70);

        for(String k:tm.keySet()){
            System.out.println(k+"-->"+tm.get(k));
        }
        System.out.println();
        System.out.println();








        //SET

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(150);
        set.add(47);
        set.add(1323);
        set.add(893);
        set.add(12);

        System.out.println(set.remove(1));//returns true
        System.out.println(set.contains(150)); //true
        System.out.println(set.size()); //true

        //Iteration on Set
        Iterator it = set.iterator();
        System.out.println(it);
        // System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println();


        //Iteration using for each loop
        for(Integer k:set){
            System.out.println("Value - "+k);
        }


        //LinkedHashSet

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(37);
        lhs.add(157);
        lhs.add(534);

        //TreeSet

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(588);
        ts.add(478);
        ts.add(9356);

    }
}