package Day2;
public class LC_53 {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int maxi=nums[0];
        for (int i : nums){
            curr+=i;
            if(curr>maxi)
                maxi=curr;
            if(curr<0)
                curr=0;
        }
        return maxi;
    }
}