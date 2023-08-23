
import java.util.*;
public class KeypadCombi{
    public static String getValue(char ch){
        switch(ch){
            case '2': return "abc"; 
            case '3': return "def"; 
            case '4': return "ghi"; 
            case '5': return "jkl"; 
            case '6': return "mno"; 
            case '7': return "pqrs"; 
            case '8': return "tuv"; 
            case '9': return "wxyz"; 
            // default: return ""; 
        }

        return "null";
    }
    public static void keypadCombination(String num,String ans,int k,String str,ArrayList<String> list){
        if(ans.length()==num.length()){
            // System.out.print(ans+" ");
            list.add(ans);
            return;
        }

         str = getValue(num.charAt(k));
        //  System.out.print(str+" ");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            keypadCombination(num,ans+ch,k+1,str,list);
        }
    }
    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<String>();
        keypadCombination("234","",0,"",list);
        System.out.println();
        System.out.println(list);


        // String num = "234";
        // num = num.substring(1);
        // System.out.print(num);
    }
}