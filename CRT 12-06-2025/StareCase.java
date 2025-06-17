import java.util.Scanner;
public class StareCase{
    public static int numberOfWays(int step){
        if(step==0||step==1){
            return 1;
        }
        return numberOfWays(step-1)+numberOfWays(step-2);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the of steps:");
        int step=sc.nextInt();
        int ways=numberOfWays(step);
        System.out.println("Number of ways to climb"+step+"step:"+ways);
    }
}