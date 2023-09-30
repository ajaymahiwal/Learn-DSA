

import java.util.*;
class Itinerary{
    public static String getStartPoint(HashMap<String,String> map){
        HashMap<String,String> revMap = new HashMap<>();
        
        for(String key:map.keySet()){
            revMap.put(map.get(key),key);
        }
        String start="";
        for(String key:map.keySet()){
            if(!revMap.containsKey(key)){
                start = key;
                break;
            }
        }
        return start;
    }
    public static void main(String args[]){
        HashMap<String,String > tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStartPoint(tickets);

        System.out.print(start+"->");
        for(String key:tickets.keySet()){
            System.out.print(tickets.get(start)+"->");
            start = tickets.get(start);
        }
    }
}