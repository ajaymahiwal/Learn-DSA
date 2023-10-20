

//Heap - Two Types
//MinHeap
//MaxHeap

import java.util.*;
class HeapOp{
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data){
            list.add(data);
            int x = list.size()-1;//child idx
            int par = (x-1)/2; //par idx
            //minHeap
            while(list.get(x) < list.get(par)){
                //swap
                int temp = list.get(par);
                list.set(par,list.get(x));
                list.set(x,temp);

                //update child parent idx
                x = par;
                par = (x-1)/2;
            }
        }

        public int remove(){
            int data = list.get(0);

            // swap with last idx
            int temp = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //remove last idx value after swap
            list.remove(list.size()-1);

            //fix heap which is not fixed now after swap
            heapify(0);

            return data;
        }
        public void heapify(int i){
            int minIdx = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left < list.size() && list.get(minIdx) > list.get(left)){
                minIdx = left;
            }
            if(right < list.size() && list.get(minIdx) > list.get(right)){
                minIdx = right;
            }

            if(minIdx!=i){
                int temp = list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);

                heapify(minIdx);
            }
        }


        public int peek(){
            return list.get(0);
        }
        public boolean isEmpty(){
            return list.size()==0;
        }

        
        public void print(){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Heap hp = new Heap();
        hp.add(4);
        hp.add(1);
        hp.add(3);
        hp.add(2);
        hp.add(6);
        hp.add(5);
        hp.print();

        hp.remove();
        hp.print();
    }
}