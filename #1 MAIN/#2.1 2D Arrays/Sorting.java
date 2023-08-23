

//sorting of 2d arrays
import java.util.*;
public class Sorting{
    public static void main(String args[]){
        int contests[][]={
            {11,51,24,85},
            {64,45,89,80},
            {10,20,31,55},
            {90,51,48,50},
            {18,55,24,89}};   
//lamda function                    
Arrays.sort(contests,Comparator.comparingDouble(o->o[2]));  //sorted acc. to 2nd idx column
//o/p
/**
11 51 24 85 
18 55 24 89
10 20 31 55
90 51 48 50
64 45 89 80
 */

Arrays.sort(contests, (a, b) -> Integer.compare(a[0],b[0]));//increasing order ---1
/**
10 20 31 55 
11 51 24 85 
18 55 24 89 
64 45 89 80 
90 51 48 50 
 */

Arrays.sort(contests, (b, a) -> Integer.compare(b[0],a[0]));//increasing order ---2
/**
10 20 31 55 
11 51 24 85 
18 55 24 89 
64 45 89 80 
90 51 48 50 
 */
Arrays.sort(contests, (a, b) -> Integer.compare(b[0],a[0]));//decreasing order ---3
/**
90 51 48 50 
64 45 89 80
18 55 24 89
11 51 24 85
10 20 31 55
 */
Arrays.sort(contests, (b, a) -> Integer.compare(a[0],b[0]));//decreasing order ---4
/**
90 51 48 50 
64 45 89 80
18 55 24 89
11 51 24 85
10 20 31 55
 */

//print
for(int i=0;i<contests.length;i++){
    for(int j=0;j<contests[0].length;j++){
        System.out.print(contests[i][j]+" ");
    }
    System.out.println();
}

    }
}