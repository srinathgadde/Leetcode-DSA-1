class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,maxi=Integer.MIN_VALUE;
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            sum=sum+nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0) sum=0;
            
        }
        return maxi;
    }
}
