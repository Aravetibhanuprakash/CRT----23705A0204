import java.util.*;
public class EvenDigitSum{
    public static void main(String[] args){
        int num=26;
        int sum=0;
        int count=0;
        for(int i=1;i<=num;i++){
            int reminder=i%10;
            int quotient=i/10;
            sum=reminder+quotient;
            if(sum%2==0){
                count++;
            }
        }
        System.out.println("the total number of even number between num:"+count);
    }
}
