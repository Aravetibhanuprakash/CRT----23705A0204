import java.util.*;
public class DigitCount{
    public static void main(String[]args){
        int num=4521;
        int sum=0;
        int count=0;
        while(num>0){
            int quotient=num/10;
            count++;
            num=quotient;
        }
        System.out.println(count);
    }
}