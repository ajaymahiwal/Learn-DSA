


public class duplicate{
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){

        //BASE CASE
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar - 'a']==true){  //ager phle se hai map array m to
            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currChar - 'a']=true;  //nhi h phle se map array m isliye true ker do us idx per
            removeDuplicate(str,idx+1,newStr.append(currChar),map);
        }

    }

    public static void main(String args[]){

        String str="ajaymahiwal";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);

    }
}