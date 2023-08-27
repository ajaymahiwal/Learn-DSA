
// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1


// TC  => 
class Solution {
    public static int countUni(String str){
        boolean isUnique[]=new boolean[26];
        int totalUnique=0;
        for(int i=0;i<str.length();i++){
            if(!isUnique[str.charAt(i)-'a']){
                isUnique[str.charAt(i)-'a']=true;
                totalUnique++;
            }
        }
        return totalUnique;
    }
    public int longestkSubstr(String s, int k) {
        // code here
        int n = s.length();
        int totalUnique=countUni(s);
        int longKUni = 0;
        
        if(totalUnique<k){
            return -1;
        }else if(totalUnique==k){
            return n;
        }else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    String str = s.substring(i,j);
                    int uniqueLen = countUni(str);
                    if(uniqueLen > k){
                        break;
                    }
                    int len = str.length();
                    longKUni = Math.max(longKUni,len);
                    // System.out.println(longKUni);
                }
            }
        }
        return longKUni;
        
    }
}