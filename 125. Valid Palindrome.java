class Solution {
    public boolean isPalindrome1(String s) {
         
         /**
         remove the special chars and use two pointer apprach to deside its a palidrome or not
         Time : O(n)
         Space: O(n)
          */
          List<Character> chr=new ArrayList<>();
          for(char ch :s.toCharArray()){
              int ascii=(int) ch;
              if(ascii>=65 && ascii<=90 ) chr.add( (char) (ascii-65+97));
              else if(ascii>=48 && ascii<=57 ) chr.add( (char) (ascii));
              else if(ascii>=97 && ascii<=122) chr.add( (char) (ascii));
          }

          int i=0,j=chr.size()-1;
          while(i<j){
              if(chr.get(i++)!=chr.get(j--)){
                  return false;
              }
          }
          return true;
    }

    public boolean isPalindrome(String s) {
     int i=0,j=s.length()-1;
     while(i<j){
          while ( !(isDigit( (int) s.charAt(i)) || isAlpha( (int) s.charAt(i))) ) i++;
          while ( !(isDigit( (int) s.charAt(i)) || isAlpha( (int) s.charAt(i))) ) j--;
          if(!isSameChar( (int) s.charAt(i) , (int) s.charAt(j) )) {
              
              return false;
          }
          i++;
          j--;
     }
    return true;
    }
    public boolean isDigit(int ascii){
        return ascii>=48 && ascii<=57;
    }
    public boolean isAlpha(int ascii){
        return ascii>=97 && ascii<=122 || ascii>=65 && ascii<=90;
    }
    public boolean isSameChar(int ascii1, int ascii2){
        return (ascii1-65+97 == ascii2 ) || (ascii2-65+97 == ascii1 ) || ascii1==ascii2;
    }
}

/**

125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
