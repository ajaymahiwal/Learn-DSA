

import java.util.*;
public class ChoColaP{
    public static void main(String args[]){
        int n=4;//row
        int m=6;//column
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2}; //n-1

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int hPointer=0,vPointer=0;
        int horiPiece = 1, veriPiece = 1;
        int cost = 0;
        
        
        while(hPointer < costHor.length && vPointer < costVer.length){
            //vertical cost < hor cost
            if(costVer[vPointer] <= costHor[hPointer]){  //horizontal cut
               cost+=(costHor[hPointer]*veriPiece);
               horiPiece++;
               hPointer++;
            }else{//vertical cut
                cost+=(costVer[vPointer]*horiPiece);
                veriPiece++;
                vPointer++;
            }
        }

        while(hPointer < costHor.length){
            cost+=(costHor[hPointer]*veriPiece);
               horiPiece++;
               hPointer++;
        }
        while(vPointer < costVer.length){
            cost+=(costVer[vPointer]*horiPiece);
            veriPiece++;
            vPointer++;
        }

        System.out.println("Minimum cost of cut= "+cost); // 42
    }
}