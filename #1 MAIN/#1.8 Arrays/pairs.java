

//PAIRS IN AN ARRAYS


import java.util.*;
public class pairs{
    
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        int total=0;

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){

                System.out.print("("+numbers[i]+","+numbers[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of Pairs: "+total);

        //WE HAVE A FORMULA ALSO TO FIND TOTAL NO. OF PAIRS : n(n-1)/2  where n is total numbers 

    }
}