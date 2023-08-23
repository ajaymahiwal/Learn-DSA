
import java.util.*;
public class Decode{
    public static String decodeStr(String str){
        Stack<Character> s = new Stack<>();
        String answer = "";
        for(int i=0;i<str.length();i++){
            String temp="";
            if(str.charAt(i)==']'){
                while(s.peek()!='['){
                    temp = s.pop() + temp;
                }
                s.pop(); // remove '['
                char ch = s.pop();
                int num = ch - 48; //finding num
                // System.out.println(num);
                temp+=answer;
                String temp1=temp;
                while(num>1){
                    temp= temp+temp1; //this line taking memory again string are immutable
                    num--; //thisline was missing so java.lang.OutOfMemoryError error heap full
                }
                System.out.println(temp);
                if(!s.isEmpty()){
                    answer=temp+answer;
                }else{




                    ///PENDING SOLUTION


                    answer=temp;
                }
            }else{
                s.push(str.charAt(i));
            }
        }
        return answer;
    }
    public static void main(String args[]){
        String str = "1[ba]2[na]";
        // String str = "3[a2[c]]";
        System.out.println("Decoded String of "+str+" is: "+decodeStr(str));
    }
}