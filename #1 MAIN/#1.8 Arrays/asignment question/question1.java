/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:Input:nums = [1, 2, 3, 1]
Output:   true 
Example 2:Input:nums = [1, 2, 3, 4]
Output:   false
*/


public class question1{
    public static boolean first_question(int nums[]){
       
       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
       return false;
}

    public static void main(String args[]){
    //   int number[]=new int[20]
    int numbers[]={1,2,3,4,1};
    System.out.println(first_question(numbers));
    }
}