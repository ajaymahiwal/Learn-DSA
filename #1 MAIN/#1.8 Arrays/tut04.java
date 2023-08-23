//LINEAR SEARCH

public class tut04{
    public static int linear(int num[],int key){

        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;   //AGER VALUE ARRAY M NHI MILII TO
    }
    public static void main(String args[]){

        int number[]={9,2,88,4,5,63,7,89,9,10};
        int find=5;

        int a=linear(number,find);   //METHOD CALL AND PASSING THE PARAMETERS
        if(a==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Key is found on index:"+a);
        }

    }
}