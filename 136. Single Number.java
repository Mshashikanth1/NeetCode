class Solution {
    /**
    Time : O(n)
    Space : O(n)
     */
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> frqHashMap=new HashMap<>();
        for(int i :nums){ 
            int frq=frqHashMap.getOrDefault(i,0);
            frqHashMap.put(i,++frq);
        }
        for( Map.Entry<Integer,Integer> e: frqHashMap.entrySet()){
            if(e.getValue()==1) return e.getKey();
        }
        return -1;
    }

    /**
    as we know the bit xor ^ operation, the xor or a^a =0  and a^0 =a ;
    knowing this fact the array elemtns are twice repeated xor operationw ill be come 0 are 
    result will be the ans
    Time : O(n)
    Space : O(1) 
     */
   public int singleNumber(int[] nums) {
        int sum=0;
        for(int i:nums) sum^=i;
        return sum;
        }

        /**
        
        136. Single Number
Solved
Easy
Topics
Companies
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

         */
}
