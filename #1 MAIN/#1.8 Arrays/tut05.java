//BINARY SEARCH

public class tut05{
    public static int binary(int num[],int key){

        int start=0,end=num.length-1;   //-1 isliye kykui length index se 1 jyada hoti hai

        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){   //ager mid ki value chotii hoo key se
                start=mid+1;
            }
            else{
                end=mid-1;      //ager mid ki value badii hoo key se
            }

        }
    return -1;   //AGER VALUE ARRAY M NHI MILII TO
    }
    public static void main(String args[]){

        int number[]={1,2,3,4,5,6,7,8,9,10};
        int find=2;

        int a=binary(number,find);
        if(a==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Key is found on index:"+a);
        }

    }
}