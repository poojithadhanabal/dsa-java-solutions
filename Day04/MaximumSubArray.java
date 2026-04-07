class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int largest_sum=nums[0];
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            largest_sum=Math.max(largest_sum,current_sum);

            if(current_sum<0){
                current_sum=0;
            }
        }
        return largest_sum;

    }
}