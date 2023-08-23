
//sunday contest 310 leetcode
class Solution {
    public int mostFrequentEven(int[] nums) {
    int Max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            Max=Math.max(nums[i],Max);
        }
    
    int count[]=new int[Max+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count[nums[i]]++;
            }
        }
        int maxi=count[0];
        for(int i=0;i<count.length;i++){
            if(maxi<count[i]){
                maxi=i;
            }
        }
        
        for(int i=0;i<count.length;i++){
            for(int j=i+1;j<count.length;j++){
                
                 if(count[i]==count[j] && count[i]!=0){
                    if(i<j){
                        return i;
                    }
                    else{
                        return j;
                    }
                 }
                    else if(maxi>1){
                        return maxi;
                    }
            

                }
            }
        
        return -1;
        
    }
}