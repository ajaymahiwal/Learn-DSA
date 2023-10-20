

import java.util.*;
class ValidAnagram{
    public static void main(String args[]){
        String s = "race";
        String t = "care";

        //Using HashMap
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            Character ch = s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                System.out.println("false");
                //yani s string se kuch alag character hai isliye false
            }
        }

        if(map.isEmpty()){

            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}