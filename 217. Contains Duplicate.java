class Solution {
    /*
    approach 1: O(n) space O(n) time;  ---> Accepted
    initialize a hash set and add all elemnts of nums and compare the sum and size
    */
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> hSet=new HashSet<>();
        int numsSum=0,hSetSum=0;
        for(int i: nums){ numsSum+=i; hSet.add(i);}
        for(int i: hSet) {hSetSum+=i;}
        return !(hSet.size()==nums.length);
    }
    /**
    brute force comparing each element with every other element
    time O(n^2) space O(1). --> TLE
     */
    public boolean containsDuplicate2(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if (i!=j && nums[i]==nums[j]) return true;
            }
        }
        return false;
    }

    /**
    sort the array and check the are same values beside.each element 
    O(nlogn) + O(n) --> time  (accepted)
     */
    public boolean containsDuplicate3(int[] nums) {
             Arrays.sort(nums);
             for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]) return true;
             }
             return false;
         }
    /**
    hashMap  construct a map of element,count seen in the array
    time : O(n), space :O(n) -->accepted
     */
         public boolean containsDuplicate(int[] nums) {
                    Map<Integer,Integer> hMap=new HashMap<>();
                    for(int i=0,n=nums.length;i<n;i++){
                        if(hMap.containsKey(nums[i])) {
                            return true;
                        }
                        else hMap.put(nums[i],1);
                    }
                    return false;
         }
}

/**
217. Contains Duplicate
Solved
Easy
Topics
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

 */
