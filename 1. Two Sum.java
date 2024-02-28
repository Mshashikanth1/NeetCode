class Solution {

    /**
    brute force 
    time :O(n^2) : checking all possible ways --> TLE
    space : O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    /** [Two pass hashmap]
     we use hashmap to store the element and index stored and search target-nums[i] is present
     in keys of map;
     time : O(1)
     space : O(n)
     */
         public int[] twoSum2(int[] nums, int target) {
                      Map<Integer,Integer> map=new HashMap<>();
                      for(int i=0;i<nums.length;i++) map.put(nums[i],i);

                      for(int i=0;i<nums.length;i++){
                          int elementToFind=target-nums[i];
                          if(map.containsKey(elementToFind) && map.get(elementToFind) != i ){
                              return new int[]{i,map.get(elementToFind)};
                          }
                      }
                      return new int[]{-1,-1};

         }

         /**
         one pass hashmap
         time: O(n)
         space : O(n)
          */
                   public int[] twoSum(int[] nums, int target) {
                       Map<Integer,Integer> map=new HashMap<>();
                       for(int i=0;i<nums.length;i++){
                           int eleToFind=target-nums[i];
                           if(map.containsKey(eleToFind)) return new int[]{map.get(eleToFind),i};
                                                  map.put(nums[i],i);

                       }
                                             return new int[]{-1,-1};

                   }


    
}


/**
1. Two Sum
Solved
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
