
/*    //https://www.geeksforgeeks.org/friends-pairing-problem/ 

Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. 
 */

public class FriendsPairProblem{
    public static int friendsPair(int n){
        //BASE CASE
        if(n==1 || n==2){
            return n;
        }

        //single 
        int single=friendsPair(n-1);
        
        //pair
        int pair=(n-1) * friendsPair(n-2);

        int totalways=single + pair;
        return totalways;
    }
    public static void main(String args[]){
        int friends=4;
        System.out.println(friendsPair(friends));
    }
}