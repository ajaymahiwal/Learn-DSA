

import java.util.*;
public class convert{
    public static void uppercaseLetter(String name){

        StringBuilder sb=new StringBuilder("");
        int n=name.length();
        char ch=Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for(int i=1;i<n;i++){
            if(name.charAt(i)==' ' && i<n-1){
                sb.append(name.charAt(i));
                i++;
                char up=Character.toUpperCase(name.charAt(i));
                sb.append(up);
            }
            else{
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter here:");
        String name;
        name=s.nextLine();

        uppercaseLetter(name);

    }
}