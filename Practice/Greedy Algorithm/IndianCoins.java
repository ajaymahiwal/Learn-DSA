

import java.util.*;
public class IndianCoins{
    public static void main(String args[]){
        //canonial coin system
        int supply[] = {2000,1000,500,200,100,50,20,10,5,2,1};

        int rupees = 2005;
        int notesCount = 0;
        ArrayList<Integer> change = new ArrayList<>();
        int i=0;
        while(rupees!=0){
            if(rupees >= supply[i]){
                notesCount++;
                rupees-=supply[i];
                change.add(supply[i]);
            }else{
                i++;
            }
        }
        System.out.println("Given Coins Are: ");
        for(int j=0;j<change.size()-1;j++){
            System.out.print(change.get(j)+" + ");
        }
        System.out.println(change.get(change.size()-1));
        System.out.println("Total (minimum) coins used = "+notesCount);
    }
}

// Given Coins Are: 
// 2000 + 5
// Total (minimum) coins used = 2