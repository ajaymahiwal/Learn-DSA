//SUB-ARRAYS
//MAX SUBARRAY SUM(BRUTE FORCE)
/* TIME-COMPLEXCITY OF THIS PROGRAM IS O(N^3) BECAUSE  HERE WE USE THREE LOOPS OUTER,INNER AND MOST INNER. TINO LOOP N (YANI LAST INDEX TAK )CHALRHE HAI ISLIYE O(N^3) COMPLEXITY HAI

*/
public class subarrays1 {

  public static void sub_array(int numbers[]) {
    int sum = 0;
    int large = Integer.MIN_VALUE; //-infinite

    int total = 0;
 
    for (int i = 0; i < numbers.length; i++) {
      int block_large = 0;
      for (int j = i; j < numbers.length; j++) {
        sum = 0;
        for (int k = i; k <= j; k++) {
          // System.out.print(numbers[k]+" ");
          
          sum = sum + numbers[k];   //  SUM (BRUTE FORCE)
        }
        total++;
        // System.out.print("Sum:" + sum);

        if (large < sum) {
          large = sum;
        }

        // System.out.println();
      }

      // if (block_large < sum) {
      //   block_large = sum;
      // }
      // System.out.println("Largest sum in this block is:" + block_large);
      // System.out.println();
    }
    System.out.println("Total subarrays is:" + total); // sum of n natural no: n(n+1)/2  where n is total numbers in array
    System.out.println("Largest sum in All Outputs is:" + large);
  }

  public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    sub_array(numbers);
  }
}
