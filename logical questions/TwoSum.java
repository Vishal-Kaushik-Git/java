public class TwoSum {
    public static void main(String args[]){
        int[] nums = {1,3,5,6};
        int target = 10;

        for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
            if(nums[i] + nums[j] == target){
                System.out.println(i+","+j);
            }
            }
           }
        }

    }    

