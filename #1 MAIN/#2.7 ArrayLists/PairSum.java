


import java.util.*;
public class PairSum{
    //BRUTE FORCE => O(n^2)
    /*public static boolean pairSum(ArrayList<Integer> num,int target){

        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                if(num.get(i) + num.get(j)== target){
                    return true; //pair sum exits
                }
            }
        }
        return false; //pair sum not exits
    }
    */

    //2 pointer approach
    public static boolean pairSum(ArrayList<Integer> num, int target){

        int lp=0; //left point
        int rp=num.size()-1; //right point

        while(lp<rp){ // while( lp != rp )  ✅
        //case 1
            if(num.get(lp) + num.get(rp) == target){
                return true;
            }
        //case 2
            if(num.get(lp) + num.get(rp) < target){
                lp++;
            }
        //case 3
            else{
                rp--;
            }

        }
        return false;
    }

    public static void main(String args[]){

        ArrayList<Integer> num=new ArrayList<>();
        //ArrayList is Sorted Given
        num.add(1);
        num.add(2);
        num.add(3); 
        num.add(4);
        num.add(5);
        num.add(6);

        int target=5;

        System.out.println(pairSum(num,target));
        
    }
}