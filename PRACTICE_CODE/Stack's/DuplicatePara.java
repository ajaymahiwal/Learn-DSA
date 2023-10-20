
import java.util.*;
public class DuplicatePara{
    public static boolean duplicatePara(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                int count = 0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return false;
                }
            }else{
                s.push(str.charAt(i));
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "(a+b)+b+((h))";
        System.out.println(duplicatePara(str));
    }
}