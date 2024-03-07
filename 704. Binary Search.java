class Solution {
    /**
    Idea : in a sorted array if pic mid value and compare it with target, then we can 
    eleminate the other half 
    Time : O(log(n))  0ms Beats 100.00% of users with Java
    Space : O(1) 45.53 MB Beats64.58%of users with Java
     */
    public int search1(int[] nums, int target) {
        int l=0,r=nums.length-1,m;
        while(l<=r){
             m=l+(r-l)/2;
            if(nums[m]==target) return m;
            else if (nums[m]>target) r=m-1;
            else l=m+1;
        }
        return -1;
    }

 /**
 recursive approach
 Time : O(log(n))
 Space : O(1)
  */

    public int search(int[] nums, int target) {
               return bsrec( nums, target, 0, nums.length-1);
        }
    public int bsrec(int[] nums,int target,int l,int r){
              if(l<=r) {
               int m=l+(r-l)/2;
               if(nums[m] ==target) return m;
               else if(nums[m] > target)  return bsrec(nums,target,l,m-1);
               else  return bsrec(nums,target,m+1,r);
              }
              return -1;
        };
}
