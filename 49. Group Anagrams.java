/**

time : O(n)
space : O(n)
 */
class Solution {
    /**
    Time : O(n)
    Space : O(n)
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();
        for(String str : strs){
            String key=Arrays.toString(str.chars()
                               .sorted()
                               .toArray());
            List<String> lis = ans.containsKey(key) ? ans.get(key)  : new ArrayList<>();
            lis.add(str);
            ans.put(key,lis);
        }

        return new ArrayList<>(ans.values());
    }
}

/**
49. Group Anagrams
Solved
Medium
Topics
Companies
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

 */
