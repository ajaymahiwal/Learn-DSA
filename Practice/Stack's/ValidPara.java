

import java.util.*;
public class ValidPara{

    //Time Complexity: O(n)
    public static boolean checkValidPara(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

//Ye code if else se bhii ker skte hai bus default vala else ban jaye ga 
            switch(ch){
                //Opening Brackets
                case '(': s.push(ch); break;
                case '[': s.push(ch); break;
                case '{': s.push(ch); break;

                //Closing Brackets
                default:
                //ager start mein hi closingBrac dediya to EmptyStackException aa jayegi
                //Isliye checking & return false
                if(s.isEmpty()){
                    return false;
                }
                
                //Valid Cases
                if(s.peek()=='(' && ch==')' ||
                   s.peek()=='[' && ch==']' || 
                   s.peek()=='{' && ch=='}')
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static boolean checkValidPara1(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);


            //Opening Brackets
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else{ //Closing Brackets
                //ager start mein hi closingBrac dediya to EmptyStackException aa jayegi
                //Isliye checking & return false
                if(s.isEmpty()){
                    return false;
                }
                
                //Valid Cases
                if(s.peek()=='(' && ch==')' ||
                   s.peek()=='[' && ch==']' || 
                   s.peek()=='{' && ch=='}')
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static boolean checkValidPara_my(String str){
        char[] arr = str.toCharArray();
        int n = str.length();
        int mid = n/2;

        if(n%2!=0){
            return false;
            //odd numbers mein brac aayegi to pair to ak a bn hi ni payega isliye invaild
        }
        
        for(int i=0;i<mid;i++){
            if(!(arr[i]=='(' && arr[n-1-i]==')' ||
               arr[i]=='[' && arr[n-i-1]==']' ||
               arr[i]=='{' && arr[n-1-i]=='}' )){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "(({}))";
        // System.out.println(checkValidPara(str));
        // System.out.println(checkValidPara1(str));

        System.out.println(checkValidPara_my(str));
    }
}