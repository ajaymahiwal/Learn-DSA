/*
Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 */

 public class BinaryStringProblem{
    public static void binaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+"0");
        if(lastplace==0){
        binaryString(n-1,1,str+"1");      
        }
    }
    public static void main(String args[]){
        int n=3;
        binaryString(n,0,"");
    }
 }