public class TwoSum {
    public static void main(String args[]){
        int[] nums = {1,3,5,6};
        int target = 6;

        for(int i=0; i<nums.length; i++){
           for(int j=1; j<5; j++){
            if(nums[i] + nums[j] == target){
                System.out.println(i+","+j);
            }
           }
        }

    }    
}
