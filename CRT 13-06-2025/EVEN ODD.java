import java.util.Scanner;
public class EvenOdd{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.print("Even is "+number);
        }else{
            System.out.print("Odd is "+number);
        }
    }
}