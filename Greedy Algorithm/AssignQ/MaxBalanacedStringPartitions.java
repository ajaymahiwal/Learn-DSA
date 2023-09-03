

//Easy Type
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MaxBalanacedStringPartitions{

    //Time pass K liye bnya tha ye method
    /**
    public static boolean balanacedString(String s){
        int countL=0,countR=0;
        for(int z=0;z<s.length();z++){
            if(s.charAt(z)=='L'){
                countL++;
            }else{
                countR++;
            }
        }
        return countL==countR;
    }
     */
    public static void main(String args[]){
        String str = "LRRRRLLRLLRL";
        int ans = 0;
        int l=0,r=0;
        for(int x=0;x<str.length();x++){
            if(str.charAt(x)=='L'){
                l++;
            }else{
                r++;
            }

            if(l==r){
                ans++;
            }
        }
        System.out.println("Answer IS: "+ ans);
    }
}
