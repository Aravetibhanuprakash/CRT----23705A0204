import java.util.Scanner;
class juice{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=10,b=2,x=15,y=5;
        int maxA=(n+a-1)/a;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=maxA;i++){
            int rem=n-a*i;
            int j=0;
            if(rem>0){
                j=(rem+b-1)/b;
            }
            int cost=x*i+y*j;
             res=Math.min(res,cost);
        }
         System.out.println(res);
    }
}