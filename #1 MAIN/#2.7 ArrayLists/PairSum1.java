

//modular arithematic is used %
import java.util.*;
public class PairSum1{
    public static boolean pairSum1(ArrayList<Integer> num, int target){
        int bp=-1;//BREAKING POINT OR PIVOT 
        int n=num.size();
        for(int i=0;i<num.size();i++){
            if(num.get(i) > num.get(i+1)){//breaking point
                bp=i;
                break;
            }
        }

        int lp=bp+1; //left point
        int rp=bp; //right point

        while(lp!=rp){
        //case 1
            if(num.get(lp) + num.get(rp) == target){
                return true;
            }
        //case 2
            if(num.get(lp) + num.get(rp) < target){
                lp=(lp+1) % n;
            }
        //case 3
            else{
                rp=(n+rp-1) % n;
            }

        }
        return false;
    }
    public static void main(String args[]){

        ArrayList<Integer> num=new ArrayList<>();
        num.add(13);
        num.add(15);
        num.add(5); 
        num.add(7);
        num.add(9);
        num.add(11);

        int target=20;
        System.out.println(pairSum1(num,target));
    }
}