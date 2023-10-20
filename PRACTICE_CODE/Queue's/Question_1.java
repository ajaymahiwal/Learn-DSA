

//First Non-repeating letter in a stream of character

import java.util.*;

//TC => O(n)  SC=> O(n),for queue
public class Question_1{
    public static void firstNonRLetterInStream(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(str.substring(0,i+1)+" => -1");
            }else{
                System.out.println(str.substring(0,i+1)+" => "+q.peek());
            }
        }
    }
    public static void main(String args[]){
        String str = "aabccxb";
        firstNonRLetterInStream(str);
    }
}