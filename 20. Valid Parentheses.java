class Solution {

    /**
    Time : O(n)
    Space : O(1)
     */
    Map<Character,Character> hmap=new HashMap<>();
    public boolean isValid(String s) {
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        Stack<Character> stack =new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && hmap.containsKey(ch) && hmap.get(ch)==stack.peek()) stack.pop();
            else stack.push(ch);
        }
        return stack.isEmpty();
    }
}

/**
20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
