


public class AssignQ2{

    public static void convertInto(int num){
        int numCopy = num;
        int len=0;
        int tempLen=0;
        while(num>0){
            num/=10;
            len++;
            tempLen++;
        }
        // System.out.println(len);
        // System.out.println(tempLen);
        convertIntoEnglish(numCopy,len,tempLen);
    }
    public static void convertIntoEnglish(int num,int len,int tempLen){
        if(num==0){
            return;
        }
        int lastDigit = num % 10;
        num /= 10;
        convertIntoEnglish(num,len,tempLen-1);
        if(tempLen==len){
            if(lastDigit==0){
                System.out.println();
                System.out.println("Note: LastDigit Can't be Zero.");
                return;
            }
        }
        switch(lastDigit){
            case 0: System.out.print("zero ");break;
            case 1: System.out.print("one ");break;
            case 2: System.out.print("two ");break;
            case 3: System.out.print("three ");break;
            case 4: System.out.print("four ");break;
            case 5: System.out.print("five ");break;
            case 6: System.out.print("six ");break;
            case 7: System.out.print("seven ");break;
            case 8: System.out.print("eight ");break;
            case 9: System.out.print("nine ");break;
        }
    }
    public static void main(String args[]){
        int num = 2020;
        convertInto(num);
    }
}