public class Main{
    public static void main(String[] args){
        int[] nums = {25,75,100,125};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            sum = sum + nums[i];
        }
        System.out.println("The sum of array elements are:" +sum);
    }
}