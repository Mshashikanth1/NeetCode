/**
 time O(n), space O(1)
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] sCharArray=new int[26],tCharArray=new int[26];
        for(char ch: s.toCharArray()) sCharArray[Math.abs(97 - (int)ch)]++;
        for(char ch: t.toCharArray()) tCharArray[Math.abs(97 -(int)ch)]++;

        for(int i=0;i<26;i++){
            if(sCharArray[i]!=tCharArray[i]) return false;
        }
        return true;
    }
}

/**
242. Valid Anagram
Solved
Easy
Topics
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

 */
