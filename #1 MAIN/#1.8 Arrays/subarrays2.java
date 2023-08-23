//SUB-ARRAYS
//MAX SUBARRAY SUM(PREFIX SUM)

/*TIME-COMPLEXCITY OF THIS PROGRAM IS O(N^2) BECAUSE  HERE WE USE ONLY TWO LOOPS OUTER AND INNER ONLY. DONO LOOP N TAK CHALRHE HAI ISLIYE O(N^2) COMPLEXITY HAI

*/
public class subarrays2 {

  public static void sub_array(int numbers[]) {
    int sum = 0;
    int total = 0;
    int large = Integer.MIN_VALUE; //-infinite

    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];

    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
      // int block_large = 0;
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        sum = 0;
        int end = j;

        sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1] ;
        //PREFIX SUM
     
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
