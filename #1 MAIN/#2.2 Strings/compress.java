

import java.util.*;
public class compress{
    public static String compressString(String name){
        StringBuilder sb=new StringBuilder("");
        
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            Integer count=1;
            while(i<name.length()-1 && name.charAt(i)==name.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(name.charAt(i));
            if(count>1){
            String num=count.toString();
            sb.append(num);
            }
        }
        
        return sb.toString();
    }
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter here:");
        String name=s.nextLine();

        String sb=compressString(name);
        System.out.println("Compressed string:\""+sb+"\"");


    }
}