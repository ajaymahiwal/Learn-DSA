

//IS PALINDROME OR NOT

import java.util.*;
public class palindrome{
    public static boolean isPalindrome(String name){
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i) != name.charAt(n-1-i)){
                System.out.println("not palindrome.");
                return false;
            }
        }
        System.out.println("Yes,\""+name+"\" is palindrome."); //escape squence used for " "
        return true;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String name;
        System.out.println("Enter for checking palindrome:");
        name=s.nextLine();
        isPalindrome(name); //METHOD CALLING

    }
}