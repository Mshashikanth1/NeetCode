/**
347. Top K Frequent Elements
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

class Solution {
    /**
      Time : O(n)
      Space : O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hMap=new HashMap<>();
        for(int i : nums) {
            int count= hMap.containsKey(i) ? hMap.get(i) : 0;
            hMap.put(i,++count);
        }
        Queue<Integer> minHeap =new PriorityQueue<>((a,b)->hMap.get(a)-hMap.get(b));
        for(int i : hMap.keySet()){
            minHeap.offer(i);
            if(minHeap.size()>k) minHeap.poll(); 
        }
        return minHeap.stream().mapToInt(Integer::valueOf).toArray();
    }
}

/**
347. Top K Frequent Elements
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


 */
