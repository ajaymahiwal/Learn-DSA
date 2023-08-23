//SUB-ARRAYS
//MAX SUBARRAY SUM(KADANE'S ALGORITHM)

/*TIME-COMPLEXCITY OF THIS PROGRAM IS O(N) BECAUSE  HERE WE USE ONLY ONE LOOP.LOOP N TAK CHALRHAA HAI ISLIYE O(N) COMPLEXITY HAI

*/
import java.lang.Math;
public class subarrays3 {


/*
public static  void kadane(int numbers[]){

    int current_sum=0;
    int maximum_sum=Integer.MIN_VALUE;   // -infinte

    for(int i=0;i<numbers.length;i++){
        current_sum=current_sum+numbers[i];
        // System.out.println(current_sum);
        if(current_sum<0){
            current_sum=0;
        }
        maximum_sum=Math.max(current_sum,maximum_sum);
    }
    System.out.println("Maximum sum is:"+ maximum_sum);

}
 */
public static void kadane1(int numbers[]){
    int cs=0;
    int ms=Integer.MIN_VALUE;     //-infinite   use for finding maximum number 
    // int min=Integer.MAX_VALUE;   //+infinite   use for finding minimum number 
    int count=0;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]<0){
            count++;
        }
    }
    if(numbers.length==count){
        for(int i=0;i<numbers.length;i++){
            if(ms<numbers[i]){
                ms=numbers[i];
            }
        }
    System.out.println("Maximum sum is:"+ ms);

    }
    else{
        for(int i=0;i<numbers.length;i++){
        cs=cs+numbers[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
    System.out.println("Maximum sum is:"+ ms);

}
    }



  public static void main(String args[]) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    int numbers[] = {-1,-2,-3,-4};
     
    // kadane(numbers); //ager array k sare element -ve huye to maximum sum WRONG bta dega 
    kadane1(numbers);   //Chahe +ve ho ya fir -ve sab m RIGHT Maximum sum bta dega
    
    /*
    AGER HUM SARE NUMBER -VE DE DE ARRAY M TO MAXIMUM SUM ZERO BTAYEGA.
    ISLIYE HUM AK OR METHOD BNAYE GE kadane1 K NAAM SE CHAYE ARRAY M SARE K SARE -VE NO. HO YA FIR +VE SAB K LIYE KAAM KRE GA
    
     */
  }

}