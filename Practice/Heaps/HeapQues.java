

import java.util.*;
class HeapQues{
    static class Points {
        int x,y,dist,idx;
        Points(int x,int y,int dist,int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        // public int compareTo(Points p2){
        //     return this.dist - p2.dist;
        // }
    }

    static class Row implements Comparable<Row>{
        int soldiers,idx;
        Row(int s,int i){
            soldiers = s;
            idx=i;
        }

        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }
            return this.soldiers - r2.soldiers;
        }
    }


    static class Window {
        int val,idx;

        Window(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public static void main(String args[]){
        int pts[][]={ { 3,3},   // C0
                      {5,-1},   // C1
                      {-2,4}};  // C2 
        int k=2; //Find Nearest Kth Cars

        PriorityQueue<Points> pq = new PriorityQueue<>((a,b)->(a.dist - b.dist));//ascending

        // PriorityQueue<Points> pq0 = new PriorityQueue<>((a,b)->(b.dist - a.dist));//decending
        //Use it for finding the farest points or distace things

        for(int i=0;i<pts.length;i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0],pts[i][1],dist,i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }


//================================================================================

        int ropes[]={4,6,2,3,3};

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        for(int r=0;r<ropes.length;r++){
            pq1.add(ropes[r]);
        }
        int minCost = 0;
        while(pq1.size()>1){
            int currCost = pq1.remove() + pq1.remove();
            pq1.add(currCost);
            minCost+=currCost;
        }
        System.out.println("Minimum Cost for Connecting n ropes:"+ minCost);
       
        for(int r=0;r<ropes.length;r++){
            pq2.add(ropes[r]);
        }
        int maxCost = 0;
        while(pq2.size()>1){
            int currCost = pq2.remove() + pq2.remove();
            pq2.add(currCost);
            maxCost+=currCost;
        }
        System.out.println("Maximum Cost for Connecting n ropes:"+ maxCost);

//=====================================================================================

        int army[][]={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

         k=2;

        PriorityQueue<Row> pqArmy = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int countSoldiers = 0;
            for(int j=0;j<army[0].length;j++){
                countSoldiers+= army[i][j]==1?1:0;
            }
            pqArmy.add(new Row(countSoldiers,i));
        }

        for(int weakArmy=0;weakArmy<k;weakArmy++){
            System.out.println("row"+pqArmy.remove().idx);
        }

//==================================================================================

        int arr[]={1,3,-1,-3,5,3,6,7}; // ans=> 3 3 5 5 6 7 
        k=1; //Window size

        int n = arr.length;
        int res[] = new int[n-k+1];
        PriorityQueue<Window> pqW = new PriorityQueue<>((a,b)->(b.val-a.val));

        for(int el=0;el<k;el++){
            pqW.add(new Window(arr[el],el));
        }

        res[0] = pqW.peek().val;

        for(int i=k;i<n;i++){
            while(pqW.size()>0 && pqW.peek().idx <= (i-k)){
                pqW.remove();
            }
            pqW.add(new Window(arr[i],i));
            res[i-k+1] = pqW.peek().val;
        }

        System.out.println("Sliding Window Maximum:");
        for(int val:res){
            System.out.print(val+" ");
        }
        // Sliding Window Maximum:
        // 1 3 -1 -3 5 3 6 7
    }
}